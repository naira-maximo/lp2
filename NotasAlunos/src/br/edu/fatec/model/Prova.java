package br.edu.fatec.model;

public class Prova {
    private final double nota;
    private final int peso;

    public Prova(double nota, int peso) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser um valor positivo.");
        }
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() { return nota; }

    public int getPeso() { return peso; }

    @Override
    public String toString() { return "Nota: " + nota + ", Peso: " + peso; }
}