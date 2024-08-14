// Crie a classe Carta, que possui um nome e um naipe. Crie os métodos GET e SET para os atributos
public class Carta {
    private String nome;
    private String naipe;

    public Carta(String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNaipe() {return naipe;}
    public void setNaipe(String naipe) {this.naipe = naipe;}

    // César, sei o método toString para imprimir as cartas na array
    @Override
    public String toString() {
        return nome + " de " + naipe;
    }
}