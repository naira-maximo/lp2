package br.edu.fatec.factory;

class Circle implements Calculable {

    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }
}
