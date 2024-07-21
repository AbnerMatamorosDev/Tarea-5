package com.mycompany.figurasherencia;

import java.util.Scanner;

public class FigurasHerencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, introduzca los datos como en los ejemplos suministrados:");
            System.out.println("1. Circulo: color radio (Ejemplo: Rojo 5.0)");
            System.out.println("2. Linea: color largo (Ejemplo: Azul 10.0)");
            System.out.println("3. Triangulo: color angulo (Ejemplo: Verde 45.0)");
            System.out.println("4. Cuadrado: color lado (Ejemplo: Amarillo 4.0)");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer del scanner

            if (opcion == 5) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.print("Introduzca el color: ");
            String color = scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el radio: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(color, radio);
                    circulo.dibujar();
                    break;

                case 2:
                    System.out.print("Introduzca el largo: ");
                    double largo = scanner.nextDouble();
                    Linea linea = new Linea(color, largo);
                    linea.dibujar();
                    break;

                case 3:
                    System.out.print("Introduzca el angulo: ");
                    double angulo = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(color, angulo);
                    triangulo.dibujar();
                    break;

                case 4:
                    System.out.print("Introduzca el lado: ");
                    double lado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(color, lado);
                    cuadrado.dibujar();
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

            scanner.nextLine();  // Limpiar el buffer del scanner después de nextDouble
        }

        scanner.close();
    }
}

