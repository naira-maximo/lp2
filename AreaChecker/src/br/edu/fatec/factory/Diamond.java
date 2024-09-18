package br.edu.fatec.factory;

class Diamond implements Calculable {

    private double diagonalMaior;
    private double diagonalMenor;

    Diamond(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2; 
    }
}
