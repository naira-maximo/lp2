package br.edu.fatec.factory;

class Trapezo implements Calculable {

    private double baseMaior;
    private double baseMenor;
    private double altura;

    Trapezo(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (baseMaior + baseMenor) * altura / 2;
    }

}
