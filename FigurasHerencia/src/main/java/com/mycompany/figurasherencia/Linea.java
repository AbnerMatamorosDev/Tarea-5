package com.mycompany.figurasherencia;

public class Linea extends Forma {
    private double largo;

    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando una línea.");
    }
}
