package test;

import produto.Produto;
import listeners.OuvintesEmail;
import listeners.OuvintesMobile;

public class Test {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.eventos.inscrever("alteraPrecoEmail", new OuvintesEmail("test@test.com"));
        produto.eventos.inscrever("alteraPrecoApp", new OuvintesMobile("01"));

        try {
            produto.alteraPrecoEmail(10.0, "test@test.com");
            produto.alteraPrecoApp(10.0, "01");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}