import java.util.Scanner;
import java.text.ParseException;

public class Aplicacao {
    /*
     * Crie uma classe principal chamada Aplicacao que conterá o menu interativo que
     * permita ao usuário realizar as seguintes ações:
     * 
     * Criar aluno, motorista, contrato, escola, veículo e ponto de parada
     * 
     * Criar uma nova rota, adicionando pontos de parada a ela.
     * 
     * Calcular a demanda de uma rota específica.
     * 
     * Exibir o número total de rotas criadas.
     * 
     * Exibir o número total de pontos de parada criados.
     * 
     * Sair do programa.
     */

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String resposta = "";
        while (resposta != "0") {
            System.out.println("""
                    ~~~~~ Bem-vindo a aplica\u00e7\u00e3o SchoolBus! ~~~~~
                       ~~~~~ Digite uma op\u00e7\u00e3o a baixo ~~~~~
                                 1-Criar Aluno
                                 2-Criar Motorista
                                 3-Criar Contrato
                                 4-Criar Escola
                                 5-Criar Veiculo
                                 6-Criar Ponto de parada
                                 7-Criar Rota
                                 8-Numero de rotas
                                 9-Total de pontos de paradas
                                 0-Sair
                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~""");
            resposta = sc.next();
            switch (resposta) {
                case "1":
                    CadastroAluno cadastroAluno = new CadastroAluno();
                    Aluno aluno = cadastroAluno.cadastrarAluno();
                    break;
                case "2":
                    CadastroMotorista cadastroMotorista = new CadastroMotorista();
                    Motorista motorista = cadastroMotorista.cadastrarMotorista();

                    break;
                case "3":
                    CadastroContrato cadastroContrato = new CadastroContrato();
                    Contrato contrato = cadastroContrato.cadastrarContrato();
                    break;
                case "4":
                    CadastroEscola cadastroEscola = new CadastroEscola();
                    Escola escola = cadastroEscola.cadastrarEscola();
                    break;
                case "5":
                    CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
                    Veiculo veiculo = cadastroVeiculo.cadastrarVeiculo();

                    break;
                case "6":
                    CadastroPontoDeParada cadastroPontoDeParada = new CadastroPontoDeParada();
                    PontoDeParada pontoDeParada = cadastroPontoDeParada.cadastrarPontoDeParada();
                    break;

                case "7":
                    CadastroRota cadastroRota = new CadastroRota();
                    Rota rota = cadastroRota.cadastrarRota();
                    break;
                case "8":
                    rota = new Rota();
                    rota.exibirTotalRotas();
                    break;
                case "9":
                    rota = new Rota();
                    System.out.println(rota.calcularDemandaTotal());
                    break;
                case "0":
                    System.out.println("~~~ Programa finalizado! ~~~");
                    resposta = "0";
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }

}
