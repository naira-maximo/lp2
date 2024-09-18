package br.edu.fatec.secretaria;
public class Prova {
    private double nota;
    private int peso;

    public Prova(double nota, int peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() {return nota;}

    public void setNota(double nota) {this.nota = nota;}

    public int getPeso() {return peso;}

    public void setPeso(int peso) {this.peso = peso;}

    @Override
    public String toString() {return "Nota: " + nota + ", Peso: " + peso;}
}
