package model;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String message) {
        setConteudo(message);
        return this;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "MENSAGEM DE ÁUDIO\nDestinatário: " + getDestinatario() + "\nHora do Envio: " + getHoraEnvio() + "\nConteúdo: " + getConteudo() + "\nDuração: " + duracao;
    }
}
