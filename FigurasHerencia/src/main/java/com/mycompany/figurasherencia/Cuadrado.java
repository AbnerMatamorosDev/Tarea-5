package com.mycompany.figurasherencia;

public class Cuadrado extends Forma {
    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }
}

