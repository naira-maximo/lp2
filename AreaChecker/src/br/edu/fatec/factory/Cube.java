package br.edu.fatec.factory;

class Cube implements Calculable {

    private double aresta;

    public Cube(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * (aresta * aresta);
    }

}
