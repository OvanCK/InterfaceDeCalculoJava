package com.company;

public class Quadrado extends Calculo{

    private double lado;

    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double calcularArea()
    {
        return lado * lado;
    }

}
