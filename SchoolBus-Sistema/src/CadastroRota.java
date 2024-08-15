import java.util.Scanner;
import java.text.ParseException;

public class CadastroRota {
    Scanner sc = new Scanner(System.in);

    public Rota cadastrarRota() throws ParseException {

        Rota rota = new Rota();
        System.out.println("Rota criada com sucesso deseja adicionar pontos de parada? S para sim N para não");
        String criar = sc.next();
        if (criar.equalsIgnoreCase("S")) {
            CadastroPontoDeParada cadastroPontoDeParada = new CadastroPontoDeParada();
            PontoDeParada pontoDeParada = cadastroPontoDeParada.cadastrarPontoDeParada();
            System.out.println("Deseja cadastrar algum aluno nesse ponto?S para sim N para não");
            String cadastrar = sc.next();
            if (cadastrar.equalsIgnoreCase("S")) {
                CadastroAluno cadastroAluno = new CadastroAluno();
                Aluno aluno = cadastroAluno.cadastrarAluno();
                pontoDeParada.cadastrarAluno(aluno);
                rota.adicionarPontoDeParada(pontoDeParada);
                System.out.println("Ponto adicionado e aluno cadastro com sucesso!");
            } else if (cadastrar.equalsIgnoreCase("N")) {
                rota.adicionarPontoDeParada(pontoDeParada);
                System.out.println("Ponto adicionado com sucesso!");
            } else {
                System.out.println("Opção inválida");
            }
        } else if (criar.equalsIgnoreCase("N")) {
            System.out.println("Certo, rota criada com o ID:" + rota.getId());

        } else {
            System.out.println("Resposta inválida");
        }
        return rota;
    }
}
