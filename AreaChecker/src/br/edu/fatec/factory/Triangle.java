package br.edu.fatec.factory;

class Triangle implements Calculable {

    private double base;
    private double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
