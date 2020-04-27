package com.company;

public class Trapezio extends Calculo {
    private double B,b,h;

    public Trapezio(double B, double b,double h)
    {
        this.b = b;
        this.B = B;
        this.h = h;
    }

    @Override
    public double calcularArea()
    {
        return (b * B*h)/2;
    }
}
