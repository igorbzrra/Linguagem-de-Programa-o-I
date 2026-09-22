package model;

public class Inscricao {

    public Participante participante;
    public Evento evento;
    public String dataInscricao;
    public String status;
    public String tipoInscricao;

    public Inscricao(Participante participante, Evento evento, String dataInscricao, String status, String tipoInscricao) {
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.status = status;
        this.tipoInscricao = tipoInscricao;
    }
}