package com.company;

public class Triangulo extends Calculo {
        private double base,altura;


        public Triangulo(double base, double altura)
        {
            this.base = base;
            this.altura = altura;
        }



        @Override
        public double calcularArea()
        {
            return (base * altura)/2;
        }

    }
