``` 
Classe DatabaseSingleton:

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private Connection connection;
    private String dbName = "magaluDB";
    // Se por ventura seu servidor MySQL não estiver no localhost ou na porta 3306 modifique a string abaixo
    private String url = "jdbc:mysql://localhost:3306/" + dbName;
    // Troque o valor de username e password para refletir suas credenciais no MySQL
    private String username = "user";
    private String password = "123456";

    // Construtor privado da classe
    private DatabaseSingleton() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Database Driver Not Found : " + ex.getMessage());
        }
        catch (SQLException ex) {
            throw new SQLException("Database Connection Failed : " + ex.getMessage());
        }
    }

    // Getter para outras classes conseguirem a conexão com o banco
    public Connection getConnection() {
        return this.connection;
    }

    // Getter para que haja apenas uma instância da classe, synchronized para evitar problemas de concorrência
    public static DatabaseSingleton getInstance() throws SQLException {
        DatabaseSingleton result = instance;

        if (result != null) {
            return result;
        }

        synchronized(DatabaseSingleton.class) {
            if (instance == null) {
                instance = new DatabaseSingleton();
            }
            return instance;
        }
    }
    
    // Se a conexão não estiver fechada ou não existir, fecha ela
    public void closeConnection() throws SQLException {
        if (this.connection != null && !this.connection.isClosed()) {
             this.connection.close();
        }
    } 

}


Classe PlataformStatistics:

// Interface de processamento dos dados das queries
interface ResultSetProcessor {
    void process(ResultSet rs) throws SQLException;
}

public class PlataformStatistics {

    // Método que dada uma string sql e uma função de processamento realiza a query da string no banco e processa os dados com a função
    private void executeQuery(String sql, ResultSetProcessor processor) {
        try (PreparedStatement stmt =  DatabaseSingleton.getInstance().getConnection().prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
    
            while (rs.next()) {
                processor.process(rs);
            }
            System.out.println();
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método que fecha a conexão com o banco
    public void closeConnection() {
        try {
            DatabaseSingleton.getInstance().closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método que usa a  view ProdutosMaisVendidos para exibir algumas estátisticas da plataforma
    public void getProdutosMaisVendidos() {
        String sql = "SELECT * FROM ProdutosMaisVendidos";

        System.out.println("Produtos mais vendidos: ");
        executeQuery(sql, rs ->  {
            String nomeProduto = rs.getString("nomeProduto");
            String nomeDepartamento = rs.getString("nomeDepartamento");
            int quantidadeVendida = rs.getInt("quantidadeVendida");

            System.out.println("Produto: " + nomeProduto + " , Departamento: " + nomeDepartamento + ", Quantidade Vendida: " + quantidadeVendida);
            });
    }

    // Método que usa a view VendasPorDepartamento para exibir algumas estátisticas da plataforma
    public void getVendasPorDepartamento() {
        String sql = "SELECT * FROM VendasPorDepartamento";

        System.out.println("Vendas por departamento: ");
        executeQuery(sql, rs ->  {
            String nomeDepartamento = rs.getString("nomeDepartamento");
            int qtdTotalVendas = rs.getInt("qtdTotalVendas");
            double valorTotalVendas = rs.getDouble("valorTotalVendas");

            System.out.println("Departamento: " + nomeDepartamento + ", Quantidade Total de Vendas: " + qtdTotalVendas + ", Valor Total de Vendas: " + valorTotalVendas);
            });
    }

    // Método que usa a view MetodoPagamentoMaisPopular para exibir algumas estátisticas da plataforma
    public void getMetodoPagamentoMaisPopular() {
        String sql = "SELECT * FROM MetodoPagamentoMaisPopular LIMIT 1";

        executeQuery(sql, rs ->  {
                String metodoPagamento = rs.getString("métodoPagamento");
                int quantidade = rs.getInt("quantidade");

                System.out.println("Método de Pagamento Mais Popular: " + metodoPagamento + ", Quantidade: " + quantidade);
            });
    }
}

E por fim a Main:

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de estatísticas
        PlataformStatistics statistics = new PlataformStatistics();

        // Chama seus métodos de estátistica e depois fecha a conexão com o banco
        statistics.getMetodoPagamentoMaisPopular();
        statistics.getProdutosMaisVendidos();
        statistics.getVendasPorDepartamento();

        statistics.closeConnection();

        // Finaliza a JVM
        System.exit(0);
    }
}
```