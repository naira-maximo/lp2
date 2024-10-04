package model;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String message) {
        setConteudo(message);
        return this;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "MENSAGEM DE FOTO\nDestinatário=" + getDestinatario() + "\nHora do Envio: " + getHoraEnvio() + "\nConteúdo: " + getConteudo() + "\nTamanho: " + tamanho;
    }
}
