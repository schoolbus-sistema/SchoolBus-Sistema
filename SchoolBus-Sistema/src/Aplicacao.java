import java.util.Scanner;

public class Aplicacao {
    /*Crie uma classe principal chamada Aplicacao que conterá o menu interativo que permita ao usuário realizar as seguintes ações:

    Criar aluno, motorista, contrato, escola, veículo e ponto de parada

    Criar uma nova rota, adicionando pontos de parada a ela.

    Calcular a demanda de uma rota específica.

    Exibir o número total de rotas criadas.

    Exibir o número total de pontos de parada criados.

    Sair do programa.*/

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String resposta="";
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
    switch (resposta){
        case "1":
            break;
        case "2":
            break;
        case "3":
            break;
        case "4":
            break;
        case "5":
            break;
        case "6":
            break;
        case "7":
            break;
        case "8":
            break;
        case "9":
            break;
        case "0":
            System.out.println("~~~ Programa finalizado! ~~~");
            resposta="0";
            break;

        default:
            System.out.println("Opção inválida!");
    }
    }
        
    }

}
