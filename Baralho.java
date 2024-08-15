// Crie uma classe Baralho, que possui 56 cartas. No construtor de Baralho, inicialize as 56 cartas (juntamente com os 4 coringas, que devem se chamar “coringa” e o naipe é “coringa”).
public class Baralho {
    private String[] naipes = {"ouros", "copas", "espadas", "paus"};
    private String[] nomes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; // vamos usar "valete", "dama" e "reis" em vez de "J", "Q" e "K"?
    private Carta[] baralho = new Carta[56];

    // César, no enunciado, a inicialização das cartas deve ser feita no contrutor. Usei o exemplo de arrays com os índices de nomes e naipes. 
    public Baralho() {
        int index = 0;
        for (String naipeCarta : naipes) {
            for (String nomeCarta : nomes) {
                baralho[index++] = new Carta(nomeCarta, naipeCarta);
            }
        }
        // César, deixei a criação dos coringas separado e o nome e naipe fora das arrays. O que acha?
        for (int i = 0; i < 4; i++) {
            baralho[index++] = new Carta("coringa", "coringa");
        }
    }

    // César, deixei comentado o nosso método de construção de cartas.
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
    public void embaralhar(){

        for (int i = 0; i < baralho.length; i++) {
            int posicao1 = (int) (Math.random() * baralho.length);
            int posicao2 = (int) (Math.random() * baralho.length);

            Carta novaPosicao = baralho[posicao1];
            baralho[posicao1] = baralho[posicao2];
            baralho[posicao2] = novaPosicao;
            System.out.println(baralho[i]);
        }
    }

    // O método devolve uma carta, retirada do topo do baralho se não estiver vazio, ou null.
    public String distribuirCarta() {
        String resultado = "";
        int random = (int) (Math.random() * baralho.length);

        if (baralho.length != 0) {
            String nome = baralho[random].getNome();
            String naipe = baralho[random].getNaipe();
            resultado = nome + " de " + naipe;
        } else {
            resultado = "null";
        }
        return resultado;
    }

     // O método verifica se tem determinada carta no baralho, devolvendo true ou false.
     public void hasCarta(String nome, String naipe) {
        boolean a = false;
         for (Carta carta : baralho) {
             if (carta.getNome().equals(nome) && carta.getNaipe().equals(naipe)) {
                 a = true;
             }
         }
         System.out.println("Retorno:" + a);
     }

    // Esse método imprime as cartas para verificar como estão dispostas (se estão embaralhadas por exemplo).
    public void imprimirBaralho() {
        for (int index = 0; index < baralho.length; index++) {
            // Carta carta = baralho[index];
            System.out.println(baralho[index]);
        }
    }

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        // baralho.imprimirBaralho();
        // baralho.hasCarta("A", "paus");
        // baralho.hasCarta("naira", "teste");
        baralho.embaralhar();
        // System.out.println(baralho.distribuirCarta());
    }
}
