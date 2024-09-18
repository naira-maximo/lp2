package br.edu.fatec.main;

import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        Calculable circle = factory.getShape(ShapeType.Circle, new Double[]{6.0});
        System.out.println("Área do Círculo: " + circle.calcularArea());

        Calculable cube = factory.getShape(ShapeType.Cube, new Double[]{10.0});
        System.out.println("Área do Cubo: " + cube.calcularArea());

        Calculable diamond = factory.getShape(ShapeType.Diamond, new Double[]{10.0, 4.0});
        System.out.println("Área do Diamante: " + diamond.calcularArea());

        Calculable hexagon = factory.getShape(ShapeType.Hexagon, new Double[]{5.0, 5.0});
        System.out.println("Área do Hexágono: " + hexagon.calcularArea());

        Calculable parallelogram = factory.getShape(ShapeType.Parallelogram, new Double[]{15.0, 7.0});
        System.out.println("Área do Paralelograma: " + parallelogram.calcularArea());

        Calculable rectangle = factory.getShape(ShapeType.Rectangle, new Double[]{5.0, 6.0});
        System.out.println("Área do Retângulo: " + rectangle.calcularArea());

        Calculable square = factory.getShape(ShapeType.Square, new Double[]{10.0});
        System.out.println("Área do Quadrado: " + square.calcularArea());

        Calculable trapezo = factory.getShape(ShapeType.Trapezo, new Double[]{10.0, 4.0, 5.0});
        System.out.println("Área do Trapézio: " + trapezo.calcularArea());

        Calculable triangle = factory.getShape(ShapeType.Triangle, new Double[]{9.0, 7.0});
        System.out.println("Área do Triângulo: " + triangle.calcularArea());
    }
}