import model.Participante;

public class App {
    
    public static void main(String[] args) {
        
        Participante p1 = new Participante();
        p1.nome = "Fulano";
        p1.email = "teste@email.com";
        p1.curso = "Computação";
        p1.cpf = "123.456.789-00";
        p1.instituicaoEnsino = "IFBA";
        p1.tipoParticipacao = "Aluno";

    }
}
