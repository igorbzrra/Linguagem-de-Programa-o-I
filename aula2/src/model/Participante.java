package model;

public class Participante {

    public String nome;
    public String cpf;
    public String email;
    public String instituicaoEnsino;
    public String curso;
    public String tipoParticipacao;

    public Participante(String nome, String cpf, String email, String instituicaoEnsino, String curso, String tipoParticipacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.tipoParticipacao = tipoParticipacao;
    }
}
