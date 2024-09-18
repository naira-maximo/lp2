package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {

    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        Calculable calculo = null;
        switch (type) {
            case Circle:
                calculo = new Circle(values[0]);
                break;
            case Cube:
                calculo = new Cube(values[0]);
                break;
            case Diamond:
                calculo = new Diamond(values[0], values[1]);
                break;
            case Hexagon:
                calculo = new Hexagon(values[0], values[1]);
                break;
            case Parallelogram:
                calculo = new Parallelogram(values[0], values[1]);
                break;
            case Rectangle:
                calculo = new Rectangle(values[0], values[1]);
                break;
            case Square:
                calculo = new Square(values[0]);
                break;
            case Trapezo:
                calculo = new Trapezo(values[0], values[1], values[2]);
                break;
            case Triangle:
                calculo = new Triangle(values[0], values[1]);
                break;
        }
        return calculo;
    }
}