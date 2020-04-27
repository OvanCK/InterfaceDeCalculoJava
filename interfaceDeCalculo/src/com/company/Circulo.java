package com.company;

public class Circulo extends Calculo{

    private double raio;

    public Circulo(double raio)
    {
        this.raio = raio;
    }

    @Override
    public double calcularArea()
    {
        return raio* raio * Math.PI;
    }
}
