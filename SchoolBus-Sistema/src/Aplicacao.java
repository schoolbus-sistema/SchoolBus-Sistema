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
        Aluno aluno=null;
        Motorista motorista=null;
        Escola escola=null;
        Fornecedor fornecedor=null;

        while (resposta != "0") {
            System.out.println("""
                    ~~~~~ Bem-vindo a aplicacao SchoolBus! ~~~~~
                       ~~~~~ Digite uma opcao a baixo ~~~~~
                                 1-Criar Aluno
                                 2-Criar Motorista
                                 3-Criar Contrato
                                 4-Criar Escola
                                 5-Criar Veiculo
                                 6-Criar Ponto de parada
                                 7-Criar Rota
                                 8-Numero de rotas
                                 9-Total de pontos de paradas
                                 10-Exibir informações detalhadas de Aluno
                                 11-Exibir informações detalhadas de Motorista
                                 12-
                                 13-
                                 14-Exibir o tipo de uma Pessoa
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
                case "10":
                    if (aluno != null){
                        aluno.apresentarDados();
                    }
                    else{
                        System.out.println("Nenhum aluno cadastrado.");
                    }  
                    break;
                case "11":
                    if (motorista != null){
                        motorista.apresentarDados();
                    }
                    else{
                        System.out.println("Nenhum motorista cadastrado");
                    }
                    break;
                case "12":
                case "13":
                case "14":
                    System.out.println("Selecione uma pessoa para exibir o tipo: \n1 - Aluno n\2 - Motorista n\3 - Escola n\4 - Fornecedor");
                    String tipoPessoa = sc.next();
                    if (tipoPessoa.equals("1") && aluno != null){
                        System.out.println("Tipo: "+ aluno.verificarTipo());
                    }
                    else if(tipoPessoa.equals("2") && motorista !=null){
                        System.out.println("Tipo: " + motorista.verificarTipo());
                    }
                    else if(tipoPessoa.equals("3") && escola !=null){
                        System.out.println("Tipo: " + escola.verificarTipo());
                    }
                    else if(tipoPessoa.equals("4") && fornecedor !=null){
                        System.out.println("Tipo: " + fornecedor.verificarTipo());
                    }
                    else{
                        System.out.println("Pessoa não cadastrada.");
                    }
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
