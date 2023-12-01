package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcDescontoPorcentoTest {
    

    @Test
    public void testCalculaDesconto(){
        CalcDescontoStrategy calc = new CalcDescontoPorcento(20);
        float valorTotal = 200.0f;

        float valorComDescontoPorcento = calc.calculaDesconto(valorTotal);

        assertEquals(160.0f, valorComDescontoPorcento, 0.00f);
        
    }

    @Test
    public void testCalculaDesconto30(){
        CalcDescontoStrategy calc = new CalcDescontoPorcento(30);
        float valorTotal = 247.0f;

        float valorComDescontoPorcento = calc.calculaDesconto(valorTotal);

        assertEquals(172.9f, valorComDescontoPorcento, 0.00f);
        
    }
}
