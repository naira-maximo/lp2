package br.edu.fatec.factory;

class Hexagon implements Calculable {

    private double lado;

    public Hexagon(double lado, double altura) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) / 2) * (lado * lado);
    }
}
