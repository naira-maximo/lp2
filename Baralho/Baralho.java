package Baralho;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Baralho {
    private List<String> naipes = new ArrayList<>();
    private List<String> nomes = new ArrayList<>();
    private List<Carta> baralho = new ArrayList<>();
    private int indexAtual;

    public Baralho() {
        naipes.add("ouros");
        naipes.add("copas");
        naipes.add("espadas");
        naipes.add("paus");

        nomes.add("A");
        nomes.add("2");
        nomes.add("3");
        nomes.add("4");
        nomes.add("5");
        nomes.add("6");
        nomes.add("7");
        nomes.add("8");
        nomes.add("9");
        nomes.add("10");
        nomes.add("J");
        nomes.add("Q");
        nomes.add("K");

        for (String naipeCarta : naipes) {
            for (String nomeCarta : nomes) {
                baralho.add(new Carta(nomeCarta, naipeCarta));
            }
        }
        for (int i = 0; i < 4; i++) {
            baralho.add(new Carta("coringa", "coringa"));
        }
        indexAtual = baralho.size() - 1;
    }

    public void embaralhar() {
        Collections.shuffle(baralho);
    }

    public Carta distribuirCarta() {
        if (indexAtual >= 0) {
            return baralho.get(indexAtual--);
        } else {
            return null;
        }
    }

    public boolean hasCarta() {
        return indexAtual >= 0;
    }

    public int cartasRestantes() {
        return indexAtual + 1;
    }

    public boolean temCarta(String nome, String naipe) {
        for (int i = 0; i <= indexAtual; i++) {
            if (baralho.get(i).getNome().equals(nome) && baralho.get(i).getNaipe().equals(naipe)) {
                return true;
            }
        }
        return false;
    }

    public void imprimirBaralho() {
        for (int i = 0; i <= indexAtual; i++) {
            System.out.println(baralho.get(i));
        }
    }

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.embaralhar();
        baralho.imprimirBaralho();
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Retorno: " + baralho.hasCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        System.out.println("Distribuindo: " + baralho.distribuirCarta());
        baralho.embaralhar();
        baralho.imprimirBaralho();
        System.out.println(baralho.cartasRestantes());
    }
}