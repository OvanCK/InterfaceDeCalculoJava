package com.company;

public class Retangulo extends Calculo {
    private double lado,lado2;


    public Retangulo(double lado, double lado2)
    {
        this.lado = lado;
        this.lado2 = lado2;
    }



    @Override
    public double calcularArea()
    {
        return lado * lado2;
    }

}
