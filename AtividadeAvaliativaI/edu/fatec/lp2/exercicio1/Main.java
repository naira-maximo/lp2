import model.Contatinho;
import model.Mensagem;
import model.MsgTexto;
import service.Whatsapp;

public class Main {
    public static void main(String[] args) {

        Whatsapp whatsapp = new Whatsapp();

        Contatinho contato1 = new Contatinho("Ana", "998999988");
        Contatinho contato2 = new Contatinho("Maria", "998899889");

        whatsapp.addContato(contato1);
        whatsapp.addContato(contato2);

        whatsapp.listarContatos();

        Mensagem mensagem1 = new MsgTexto(contato1, "23:46", "Boa noite, Ana!", 9);
        Mensagem mensagem2 = new MsgTexto(contato2, "23:54", "Obrigada, Maria! Para você também", 8);

        whatsapp.addMensagem(mensagem1);
        whatsapp.addMensagem(mensagem2);

        whatsapp.listarMensagens();
    }
}