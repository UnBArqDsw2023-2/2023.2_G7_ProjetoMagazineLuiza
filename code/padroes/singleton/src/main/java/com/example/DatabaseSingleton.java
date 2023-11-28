package com.example;

import java.sql.*;

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
