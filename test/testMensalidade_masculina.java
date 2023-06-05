package test;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import mensalidade.Mensalidade_masculina;

public class testMensalidade_masculina {

	@Test
    public void testCalcularMensalidade_masculina_IdadeMenorIgual15() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(12, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_IdadeEntre16e18() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(17, "M");
        Assert.assertEquals(75.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_IdadeEntre19e30() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(25, "M");
        Assert.assertEquals(90.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_IdadeEntre31e40() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(35, "M");
        Assert.assertEquals(85.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_IdadeEntre41e50() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(45, "M");
        Assert.assertEquals(80.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_IdadeMaior50() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(55, "M");
        Assert.assertEquals(60.0, mensalidade, 0.01);
    }

    @Test
    public void testCalcularMensalidade_masculina_SexoInvalido() {
        double mensalidade = Mensalidade_masculina.calcularMensalidade_masculina(30, "F");
        Assert.assertEquals(0.0, mensalidade, 0.01);
    }

}
