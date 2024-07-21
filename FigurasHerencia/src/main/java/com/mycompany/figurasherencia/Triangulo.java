package com.mycompany.figurasherencia;

public class Triangulo extends Forma {
    private double angulo;

    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
    }

    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }
}
