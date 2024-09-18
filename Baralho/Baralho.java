package Baralho;
// Crie uma classe Baralho, que possui 56 cartas. No construtor de Baralho, inicialize as 56 cartas (juntamente com os 4 coringas, que devem se chamar “coringa” e o naipe é “coringa”).
public class Baralho {
    private String[] naipes = {"ouros", "copas", "espadas", "paus"};
    private String[] nomes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
    private Carta[] baralho = new Carta[56];
    private int indexAtual = baralho.length - 1;

    public Baralho() {
        int index = 0;
        for (String naipeCarta : naipes) {
            for (String nomeCarta : nomes) {
                baralho[index++] = new Carta(nomeCarta, naipeCarta);
            }
        }
        for (int i = 0; i < 4; i++) {
            baralho[index++] = new Carta("coringa", "coringa");
        }
    }

    // public Carta[] criarCarta() {
    //     int index = 0;
    //     for (String naipeCarta : naipes) {
    //         for (String nomeCarta : nomes) {
    //             baralho[index++] = new Carta(nomeCarta, naipeCarta);
    //         }
    //     }
    //     for (int i = 0; i < 4; i++) {
    //         baralho[index++] = new Carta("coringa", "coringa");
    //     }
    //     return baralho;
    // }

    // O método usa o math.random para trocar as cartas dentro do baralho, misturando-as (sorteie duas posições e troque-as. Repita este processo diversas vezes).
    public void embaralhar() {
        for (int i = 0; i < indexAtual; i++) {
            int posicao1 = (int) (Math.random() * (indexAtual));
            int posicao2 = (int) (Math.random() * (indexAtual));
    
            Carta novaPosicao = baralho[posicao1];
            baralho[posicao1] = baralho[posicao2];
            baralho[posicao2] = novaPosicao;
        }
    }

    // O método devolve uma carta, retirada do topo do baralho se não estiver vazio, ou null.
    public Carta distribuirCarta() {
        if (indexAtual >= 0) {
            return baralho[indexAtual--];
        } else {return null;}
    }

    // O método verifica se tem carta no baralho, devolvendo true ou false.
    public boolean hasCarta() {
        return indexAtual >= 0;
    }
    public int cartasRestantes() {
        return indexAtual + 1;
    }

    public boolean temCarta(String nome, String naipe) {
        boolean a = false;
        for (int i = 0; i <= indexAtual; i++) {
            if (baralho[i].getNome().equals(nome) && baralho[i].getNaipe().equals(naipe)) {
                a = true;
            }
        }
        return a;
    }

    // O método imprime as cartas para verificar como estão dispostas (se estão embaralhadas por exemplo).
    public void imprimirBaralho() {
        for (int i = 0; i <= indexAtual; i++) {
            System.out.println(baralho[i]);
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
