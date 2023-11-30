package com.example;

import java.sql.*;


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
