public class Baralho {
    private String[] nomes = new String[13];
    private String[] naipes = new String[5];

    private String[] baralho = new String[56];
    
    private String nome;
    private String naipe;
    Carta cards = new Carta(nome, naipe);

    public String[] criarCarta(String nome, String naipe) {
        Carta carta = new Carta(nome, naipe);
        return baralho;
    }
    public String[] embaralhar(){
        //Math.random
        return baralho;
    }

    public String distribuirCarta() {
        String carta = null;
        return carta;
    }

    public boolean hasCarta(String nome, String naipe) {
       if () {
           return true;
       } else {return false;}
    }

    public void imprimirBaralho() {
        // System.out.println();
    }




}
