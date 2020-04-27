package com.company;

public class Losango extends Calculo {
    private double diag1,diag2;


    public Losango(double diag1, double diag2)
    {
        this.diag1 = diag1;
        this.diag2 = diag2;
    }



    @Override
    public double calcularArea()
    {
        return (diag1 * diag2)/2;
    }

}