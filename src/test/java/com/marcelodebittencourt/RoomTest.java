package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //TesteNovoQuarto
    void TestNewRoom(){
        //E - Entrada de dados - massa
        int numeroDoQuarto = 200;
        String nomeDoQuarto = "Suíte luxo";
        double valorDiaria = 500;   

        //T - Teste - Execução do teste
        Room quartoLuxo = new Room(numeroDoQuarto, nomeDoQuarto, valorDiaria);

        //R - Resultado - Validação de Resultados
        assertEquals(numeroDoQuarto, quartoLuxo.getId());
        assertEquals(nomeDoQuarto, quartoLuxo.getName());
        assertEquals(valorDiaria, quartoLuxo.getPricePerDay());
    }
    
}
