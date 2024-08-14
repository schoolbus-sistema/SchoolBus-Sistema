import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
public class Aplicacao {
    /*Crie uma classe principal chamada Aplicacao que conterá o menu interativo que permita ao usuário realizar as seguintes ações:

    Criar aluno, motorista, contrato, escola, veículo e ponto de parada

    Criar uma nova rota, adicionando pontos de parada a ela.

    Calcular a demanda de uma rota específica.

    Exibir o número total de rotas criadas.

    Exibir o número total de pontos de parada criados.

    Sair do programa.*/

    public static void main(String[] args) throws ParseException {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
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
            System.out.println("Digite o nome civil do aluno que deseja cadastrar: ");
            String nomeCivilAluno = sc.next();
            System.out.println("Digite o nome do aluno que deseja cadastrar: ");
            String nomeAluno = sc.next();
            System.out.println("Digite o nome da mãe do aluno que deseja cadastrar: ");
            String maeAluno = sc.next();
            System.out.println("Digite o nome do pai do aluno que deseja cadastrar: ");
            String paiAluno = sc.next();
            System.out.println("Digite a naturalidade do aluno que deseja cadastrar: ");
            String naturalidadeAluno = sc.next();
            System.out.println("Digite o CPF do aluno que deseja cadastrar: ");
            String cpfAluno = sc.next();
            System.out.println("Digite a data de nascimento do aluno que deseja cadastrar: ");
            String dataStr = sc.next();
            Date dataDeNascimentoAluno = sdf.parse(dataStr);
            System.out.println("Digite o nome da rua do aluno que deseja cadastrar: ");
            String ruaAluno = sc.next();
            System.out.println("Digite o número da casa do aluno que deseja cadastrar: ");
            int numeroCasaAluno = sc.nextInt();
            System.out.println("Digite o complemento do endereço do aluno que deseja cadastrar: ");
            String complementoAluno = sc.next();
            System.out.println("Digite o bairro do aluno que deseja cadastrar: ");
            String bairroAluno = sc.next();
            System.out.println("Digite o telefone do aluno que deseja cadastrar: ");
            String telefoneAluno = sc.next();
            System.out.println("Digite a matricula do aluno que deseja cadastrar: ");
            int matriculaAluno = sc.nextInt();
            System.out.println("Digite a serie do aluno que deseja cadastrar: ");
            String serieAluno = sc.next();
            Aluno aluno = new Aluno(nomeCivilAluno,nomeAluno,maeAluno,paiAluno,naturalidadeAluno,cpfAluno,dataDeNascimentoAluno,ruaAluno,numeroCasaAluno,complementoAluno,bairroAluno,telefoneAluno,matriculaAluno,serieAluno);
            System.out.println("\n Aluno " + nomeAluno +" filho de " +maeAluno +" e "+ paiAluno + "\n naturalidade "+naturalidadeAluno+", inscrito no CPF "+cpfAluno + "\n nascido em "+sdf.format(dataDeNascimentoAluno)+"\n reside na rua "+ruaAluno+", na casa de número "+numeroCasaAluno+", com o complemento "+complementoAluno+", no bairro "+bairroAluno+"\n com o telefone de contato "+telefoneAluno+", e com o numero de matricula "+matriculaAluno+", inscrito na serie "+serieAluno+"\n foi inscrito com sucesso! \n");
            break;
        case "2":
        System.out.println("Digite o nome civil do motorista que deseja cadastrar: ");
        String nomeCivilMotorista = sc.next();
        System.out.println("Digite o nome do motorista que deseja cadastrar: ");
        String nomeMotorista = sc.next();
        System.out.println("Digite o nome da mãe do motorista que deseja cadastrar: ");
        String maeMotorista = sc.next();
        System.out.println("Digite o nome do pai do motorista que deseja cadastrar: ");
        String paiMotorista = sc.next();
        System.out.println("Digite a naturalidade do motorista que deseja cadastrar: ");
        String naturalidadeMotorista = sc.next();
        System.out.println("Digite o CPF ou CNPJ do motorista que deseja cadastrar: ");
        String cpfMotorista = sc.next();
        System.out.println("Digite o nome da rua do motorista que deseja cadastrar: ");
        String ruaMotorista = sc.next();
        System.out.println("Digite o complemento do endereço do motorista que deseja cadastrar: ");
        String complementoMotorista = sc.next();
        System.out.println("Digite o bairro do motorista que deseja cadastrar: ");
        String bairroMotorista = sc.next();
        System.out.println("Digite o telefone do motorista que deseja cadastrar: ");
        String telefoneMotorista= sc.next();
        System.out.println("Digite o número da habilitação do motorista que deseja cadastrar: ");
        String habilitacaoMotorista = sc.next();
        System.out.println("Digite o tipo de habilitação do motorista que deseja cadastrar: ");
        String tipoHabilitacaoMotorista = sc.next();
        System.out.println("Digite o número da casa do motorista que deseja cadastrar: ");
        int numeroCasaMotorista = sc.nextInt();
        System.out.println("Digite o tipo de contrato do motorista 0 para funcionario 1 para terceirizado: ");
        int tipoMotorista = sc.nextInt();
        if(tipoMotorista == 0){
            System.out.println("Digite a data de nascimento do motorista que deseja cadastrar: ");
            dataStr = sc.next();
            Date dataDeNascimentoMotorista = sdf.parse(dataStr);

            Motorista motorista = new Motorista(nomeCivilMotorista,nomeMotorista,maeMotorista,paiMotorista,naturalidadeMotorista,cpfMotorista,
            ruaMotorista,complementoMotorista,bairroMotorista,telefoneMotorista,habilitacaoMotorista,tipoHabilitacaoMotorista,
            numeroCasaMotorista,tipoMotorista,dataDeNascimentoMotorista);

            System.out.println("\n motorista " + nomeMotorista +" filho de " +maeMotorista +" e "+ paiMotorista + "\n naturalidade "+naturalidadeMotorista+", inscrito no CPF "+cpfMotorista 
            + "\n nascido em "+sdf.format(dataDeNascimentoMotorista)+"\n reside na rua "+ruaMotorista+", na casa de número "+numeroCasaMotorista+", com o complemento "
            +complementoMotorista+", no bairro "+bairroMotorista+"\n com o telefone de contato "+telefoneMotorista+", e com a habilitacao de número "+habilitacaoMotorista+", do tipo "
            +tipoHabilitacaoMotorista+"\n foi inscrito com sucesso! \n");
        }else if(tipoMotorista==1){
            System.out.println("Digite o número de contrato do motorista que deseja cadastrar: ");
            Integer numContratoMotorista = sc.nextInt();
            System.out.println("Digite o data de início do contrato do motorista que deseja cadastrar: ");
            String dataInicioContrato = sc.next();
            System.out.println("Digite o data de terminio do contrato do motorista que deseja cadastrar: ");
            String dataFimContrato = sc.next();
            System.out.println("Digite o valor do contrato do motorista que deseja cadastrar: ");
            Double valorContrato = sc.nextDouble();
            System.out.println("Digite a data de nascimento do motorista que deseja cadastrar: ");
            dataStr = sc.next();
            Date dataDeNascimentoMotorista = sdf.parse(dataStr);

            Contrato contrato = new Contrato(numContratoMotorista,sdf.parse(dataInicioContrato),sdf.parse(dataFimContrato),valorContrato);
            
            Motorista motorista = new Motorista(nomeCivilMotorista,nomeMotorista,maeMotorista,paiMotorista,naturalidadeMotorista,cpfMotorista,
            ruaMotorista,complementoMotorista,bairroMotorista,telefoneMotorista,habilitacaoMotorista,tipoHabilitacaoMotorista,numContratoMotorista.toString(),
            numeroCasaMotorista,tipoMotorista,dataDeNascimentoMotorista,contrato);

            System.out.println("\n motorista " + nomeMotorista +" filho de " +maeMotorista +" e "+ paiMotorista +
             "\n naturalidade "+naturalidadeMotorista+", inscrito no CPF "+cpfMotorista+
              "\n nascido em "+sdf.format(dataDeNascimentoMotorista)+
            "\n reside na rua "+ruaMotorista+", na casa de número "+numeroCasaMotorista+", com o complemento "+complementoMotorista+", no bairro "+bairroMotorista+
            "\n com o telefone de contato "+telefoneMotorista+", e com a habilitacao de número "+habilitacaoMotorista+", do tipo "+tipoHabilitacaoMotorista+
            "\n motorista cadastrado como terceirizado com o número de contrato:"+numContratoMotorista+
            "\n com data de início em "+sdf.format(dataInicioContrato)+
            "\n e data de fim em " +sdf.format(dataFimContrato)+
            "\n e contrato no valor de: "+valorContrato+ 
            "\n motorista foi inscrito com sucesso! \n");
        }else{
            System.out.println("Tipo de contrato inválido! Deve ser 0 para funcionário ou 1 para terceirizado.");
            continue;
        }
        
            break;
        case "3":
            System.out.println("Digite o número de contrato que deseja cadastrar: ");
            Integer numContrato = sc.nextInt();
            System.out.println("Digite o data de início do contrato que deseja cadastrar: ");
            String dataInicio = sc.next();
            System.out.println("Digite o data de terminio do contrato que deseja cadastrar: ");
            String dataFim = sc.next();
            System.out.println("Digite o valor do contrato que deseja cadastrar: ");
            Double valorContrato = sc.nextDouble();
            Contrato contrato = new Contrato(numContrato,sdf.parse(dataInicio),sdf.parse(dataFim),valorContrato);
            System.out.println("\n Contrato cadastrado com o número de contrato "+numContrato+
            "\n com data de início em "+sdf.format(dataInicio)+
            "\n e data de fim em " + sdf.format(dataFim)+
            "\n e contrato no valor de: "+valorContrato+ 
            "\n Contrato foi cadastrado com sucesso! \n");
            break;
        case "4":
            System.out.println("Digite o nome da Escola que deseja cadastrar: ");
            String nomeEscola = sc.next();
            System.out.println("Digite o CNPJ da Escola que deseja cadastrar: ");
            String cnpjEscola=sc.next(); 
            System.out.println("Digite o telefone da Escola que deseja cadastrar: ");
            String telefoneEscola=sc.next();
            System.out.println("Digite o bairro da Escola que deseja cadastrar: ");
            String bairroEscola=sc.next();
            System.out.println("Digite o complemento da Escola que deseja cadastrar: ");
            String complementoEscola=sc.next();
            System.out.println("Digite o numero da Escola que deseja cadastrar: ");
            int numeroEscola=sc.nextInt(); 
            System.out.println("Digite o nome da rua da Escola que deseja cadastrar: ");
            String ruaEscola=sc.next();
            Escola escola =new Escola(nomeEscola, cnpjEscola, telefoneEscola,bairroEscola,complementoEscola,numeroEscola,ruaEscola);
            System.out.println("\n Escola "+nomeEscola+
            "\n localizada na rua "+ruaEscola+" presente no bairro "+bairroEscola+" com o complemento "+complementoEscola+" e o número "+numeroEscola+
            "\n inscrita no CNPJ "+cnpjEscola+
            "\n Foi cadastrada com sucesso!");
            break;
        case "5":
            System.out.println("Digite o número da placa do veículo que deseja cadastrar: ");
            String placa = sc.next();
            System.out.println("Digite o modelo do veículo que deseja cadastrar: ");
            String modelo= sc.next();
            System.out.println("Digite o ano do veículo que deseja cadastrar: ");
            Integer ano = sc.nextInt();
            System.out.println("Digite a capacidade do veículo que deseja cadastrar: ");
            Integer capacidade= sc.nextInt();
            System.out.println("Digite o tipo de contrato do veículo 0 para próprio e 1 para alugado: ");
            Integer tipo= sc.nextInt();
            if(tipo == 0){
                Veiculo veiculo = new Veiculo(placa, modelo, ano, capacidade, tipo);
                System.out.println("\n Veiculo cadastrado com placa"+placa+" no modelo: "+modelo+" do ano "+ano+" com capacidade: "+capacidade+" e cadastrado como carro próprio\n Foi cadastrado com sucesso!");
            }else if(tipo == 1){
                System.out.println("Digite o número de contrato que deseja cadastrar: ");
                Integer numContratoVeiculo = sc.nextInt();
                System.out.println("Digite o data de início do contrato que deseja cadastrar: ");
                String dataInicioContratoVeiculo = sc.next();
                System.out.println("Digite o data de terminio do contrato que deseja cadastrar: ");
                String dataFimContratoVeiculo = sc.next();
                System.out.println("Digite o valor do contrato que deseja cadastrar: ");
                Double valorContratoVeiculo = sc.nextDouble();
                Contrato contratoVeiculo = new Contrato(numContratoVeiculo,sdf.parse(dataInicioContratoVeiculo),sdf.parse(dataFimContratoVeiculo),valorContratoVeiculo);
                 Veiculo veiculo = new Veiculo(placa, modelo, ano, capacidade, tipo,contratoVeiculo);
                 System.out.println("\n Veiculo cadastrado com placa"+placa+" no modelo: "+modelo+" do ano "+ano+" com capacidade: "+capacidade+
                 "\n e cadastrado como carro alugado no numero de contrato"+numContratoVeiculo+ 
                 "\n com data de início do contrato de"+dataInicioContratoVeiculo+
                 "\n com data de início do contrato de"+dataFimContratoVeiculo+
                 "\n com valor de"+valorContratoVeiculo+
                 "\n Foi cadastrado com sucesso!");
            }else{
                System.out.println("Tipo de contrato invalido digite 0 para veículo próprio e 1 para alugado ");
            }
           
            break;
        case "6":
        System.out.println("Digite o nome do ponto de parada que deseja cadastrar: ");
        String nomePonto = sc.next();
        System.out.println("Digite a latitude do ponto de parada: ");
        double latitude = sc.nextDouble();
        System.out.println("Digite a longitude do ponto de parada: ");
        double longitude = sc.nextDouble();
        System.out.println("Digite o id do ponto de parada: ");
        int idPontoDeParad = sc.nextInt();
        PontoDeParada ponto = new PontoDeParada(nomePonto,latitude,longitude,idPontoDeParad);
        System.out.println("Ponto de parada criado com sucesso!");
        break;

        case "7":
                Rota rota = new Rota();
                System.out.println("Rota criada com sucesso deseja adicionar pontos de parada? S para sim N para não");
                String criar = sc.next();
                if(criar.equalsIgnoreCase("S")){
                    System.out.println("Digite o nome do ponto de parada que deseja cadastrar: ");
                    nomePonto = sc.next();
                    System.out.println("Digite a latitude do ponto de parada: ");
                    latitude = sc.nextDouble();
                    System.out.println("Digite a longitude do ponto de parada: ");
                    longitude = sc.nextDouble();
                    System.out.println("Digite o id do ponto de parada: ");
                    idPontoDeParad = sc.nextInt();
                    ponto = new PontoDeParada(nomePonto,latitude,longitude,idPontoDeParad);
                    System.out.println("Deseja cadastrar algum aluno nesse ponto?S para sim N para não");
                    String cadastrar = sc.next();
                        if (cadastrar.equalsIgnoreCase("S")){
                            break;
                        }else if(cadastrar.equalsIgnoreCase("N")){
                            rota.adicionarPontoDeParada(ponto);
                            System.out.println("Ponto adicionado com sucesso!");
                            break;
                        }else{
                            System.out.println("Opção inválida");
                            continue;
                        }
                }else if (criar.equalsIgnoreCase("N")) {
                    System.out.println("Certo, rota criada com o ID:"+rota.getId());
                    
                }else{
                    System.out.println("Resposta inválida");
                }
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
