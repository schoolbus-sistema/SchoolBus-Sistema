import java.text.ParseException;
import java.util.Scanner;

public class CadastroVeiculo {
    Scanner sc = new Scanner(System.in);

    public Veiculo cadastrarVeiculo() throws ParseException {

        System.out.println("Digite o número da placa do veículo que deseja cadastrar: ");
        String placa = sc.next();
        System.out.println("Digite o modelo do veículo que deseja cadastrar: ");
        String modelo = sc.next();
        System.out.println("Digite o ano do veículo que deseja cadastrar: ");
        Integer ano = sc.nextInt();
        System.out.println("Digite a capacidade do veículo que deseja cadastrar: ");
        Integer capacidade = sc.nextInt();
        System.out.println("Digite o tipo de contrato do veículo 0 para próprio e 1 para alugado: ");
        Integer tipo = sc.nextInt();
        if (tipo == 0) {
            Veiculo veiculo = new Veiculo(placa, modelo, ano, capacidade, tipo);
            System.out.println("\n Veiculo cadastrado com placa" + placa + " no modelo: " + modelo
                    + " do ano " + ano + " com capacidade: " + capacidade
                    + " e cadastrado como carro próprio\n Foi cadastrado com sucesso!");
            return veiculo;
        } else if (tipo == 1) {
            CadastroContrato cadastroContrato = new CadastroContrato();
            Contrato contratoVeiculo = cadastroContrato.cadastrarContrato();
            Veiculo veiculo = new Veiculo(placa, modelo, ano, capacidade, tipo, contratoVeiculo);
            System.out.println("\n Veiculo cadastrado com placa" + placa + " no modelo: " + modelo
                    + " do ano " + ano + " com capacidade: " + capacidade +
                    "\n e cadastrado como carro alugado no numero de contrato" + contratoVeiculo.getNumContrato() +
                    "\n com data de início do contrato de" + contratoVeiculo.getDataInicial() +
                    "\n com data de início do contrato de" + contratoVeiculo.getDataFinal() +
                    "\n com valor de" + contratoVeiculo.getValor() +
                    "\n Foi cadastrado com sucesso!");
            return veiculo;
        } else {
            System.out.println("Tipo de contrato invalido digite 0 para veículo próprio e 1 para alugado ");
        }
        return null;
    }
}
