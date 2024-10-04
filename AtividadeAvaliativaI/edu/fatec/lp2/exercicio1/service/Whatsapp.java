package service;
import java.util.ArrayList;
import model.Contatinho;
import model.Mensagem;

public class Whatsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public void listarContatos() {
        for (Contatinho contato : contatos) {
            System.out.println(contato);
        }
    }

    public void listarMensagens() {
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }

    public void addContato(Contatinho contato) {
        contatos.add(contato);
    }

    public void addMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public ArrayList<Contatinho> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contatinho> contatos) {
        this.contatos = contatos;
    }

    public ArrayList<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(ArrayList<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}
