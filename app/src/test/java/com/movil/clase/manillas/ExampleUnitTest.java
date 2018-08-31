package com.movil.clase.manillas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cuero_martillo_oro_peso_tresUnidades() {
        int cantidad = 3;
        int precio = 100;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioPeso(cantidad,precio), resultado);
    }
    @Test
    public void cuero_martillo_oroRosado_peso_cincoUnidades() {
        int cantidad = 5;
        int precio = 100;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioPeso(cantidad,precio), resultado);
    }
    @Test
    public void cuero_martillo_plata_peso_dosUnidades() {
        int cantidad = 2;
        int precio = 80;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioPeso(cantidad,precio), resultado);
    }
    @Test
    public void cuero_martillo_niquel_peso_nueveUnidades() {
        int cantidad = 9;
        int precio = 70;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuero_ancla_oro_peso_quinceUnidades() {
        int cantidad = 15;
        int precio = 120;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuero_ancla_oroRosado_peso_diezUnidades() {
        int cantidad = 10;
        int precio = 120;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuero_ancla_plata_peso_treceUnidades() {
        int cantidad = 13;
        int precio = 100;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuero_ancla_niquel_peso_sieteUnidades() {
        int cantidad = 7;
        int precio = 90;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuerda_martillo_oro_peso_unaUnidad() {
        int cantidad = 1;
        int precio = 90;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuerda_martillo_oroRosado_peso_dosUnidades() {
        int cantidad = 2;
        int precio = 90;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuerda_martillo_plata_peso_ochoUnidades() {
        int cantidad = 8;
        int precio = 70;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
    @Test
    public void cuerda_martillo_niquel_peso_cincoUnidades() {
        int cantidad = 5;
        int precio = 50;
        int resultado = cantidad*precio*3200;
        assertEquals(Metodos.precioDolar(cantidad,precio), resultado);
    }
}