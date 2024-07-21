package com.mycompany.figurasherencia;

public class Circulo extends Forma {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double calcularRadio() {
        return radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}
