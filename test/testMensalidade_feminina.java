package test;

import org.junit.Assert;

import org.junit.Test;

import mensalidade.Mensalidade_feminina;

public class testMensalidade_feminina {

	@Test
    public void testCalcularMensalidade_feminina_IdadeMenorIgual18() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(15, "F");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_feminina_IdadeEntre19e25() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(20, "F");
        Assert.assertEquals(90.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_feminina_IdadeEntre26e40() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(30, "F");
        Assert.assertEquals(85.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_feminina_IdadeEntre41e50() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(45, "F");
        Assert.assertEquals(65.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_feminina_IdadeMaior50() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(55, "F");
        Assert.assertEquals(50.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_feminina_SexoInvalido() {
        double mensalidade = Mensalidade_feminina.calcularMensalidade_feminina(30, "M");
        Assert.assertEquals(0.0, mensalidade, 0.01);
    }
}
