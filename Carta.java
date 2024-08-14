public class Carta {
    // Atributos
    private String nome;
    private String naipe;
    // Construtor
    public Carta (String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }
    // Métodos de acesso
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getNaipe() {return naipe;}
    public void setNaipe(String naipe) {this.naipe = naipe;}
}
