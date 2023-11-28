package com.example;

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