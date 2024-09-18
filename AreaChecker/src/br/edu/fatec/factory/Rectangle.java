package br.edu.fatec.factory;

class Rectangle implements Calculable {

    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }  

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
