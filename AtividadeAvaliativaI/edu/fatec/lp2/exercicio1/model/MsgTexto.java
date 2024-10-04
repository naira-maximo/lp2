package model;
public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String message) {
        setConteudo(message);
        return this;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public String toString() {
        return "MENSAGEM DE TEXTO\nDestinatário: " + getDestinatario() + "\nHora do Envio: " + getHoraEnvio() + "\nConteúdo: " + getConteudo() +
                "\nQuantidade de Caracteres: " + numChar;
    }
}
