package model;

public class Certificado {

    public Participante participante;
    public Evento evento;
    public int cargaHoraria;
    public String dataEmissao;
    public String codigoValidacao;

    public Certificado(Participante participante, Evento evento, int cargaHoraria, String dataEmissao, String codigoValidacao) {
        this.participante = participante;
        this.evento = evento;
        this.cargaHoraria = cargaHoraria;
        this.dataEmissao = dataEmissao;
        this.codigoValidacao = codigoValidacao;
    }
}