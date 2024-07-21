package com.mycompany.figurasherencia;

public class Forma {
    private String color;

    public Forma(String color) {
        this.color = color;
    }

    public void dibujar() {
        System.out.println("Dibujando una forma.");
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

