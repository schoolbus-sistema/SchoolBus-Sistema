import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class CadastroMotorista {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Motorista cadastrarMotorista() throws ParseException {

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
        String telefoneMotorista = sc.next();
        System.out.println("Digite o número da habilitação do motorista que deseja cadastrar: ");
        String habilitacaoMotorista = sc.next();
        System.out.println("Digite o tipo de habilitação do motorista que deseja cadastrar: ");
        String tipoHabilitacaoMotorista = sc.next();
        System.out.println("Digite o número da casa do motorista que deseja cadastrar: ");
        int numeroCasaMotorista = sc.nextInt();
        System.out.println("Digite o tipo de contrato do motorista 0 para funcionario 1 para terceirizado: ");
        int tipoMotorista = sc.nextInt();
        if (tipoMotorista == 0) {
            System.out.println("Digite a data de nascimento do motorista que deseja cadastrar: ");
            String dataStr = sc.next();
            Date dataDeNascimentoMotorista = sdf.parse(dataStr);

            Motorista motorista = new Motorista(nomeCivilMotorista, nomeMotorista, maeMotorista,
                    null, paiMotorista, naturalidadeMotorista, cpfMotorista,
                    ruaMotorista, complementoMotorista, bairroMotorista, telefoneMotorista,
                    habilitacaoMotorista, tipoHabilitacaoMotorista,
                    dataStr, dataStr, numeroCasaMotorista, tipoMotorista, dataDeNascimentoMotorista);

            System.out.println("\n motorista " + nomeMotorista + " filho de " + maeMotorista + " e "
                    + paiMotorista + "\n naturalidade " + naturalidadeMotorista + ", inscrito no CPF "
                    + cpfMotorista
                    + "\n nascido em " + sdf.format(dataDeNascimentoMotorista) + "\n reside na rua "
                    + ruaMotorista + ", na casa de número " + numeroCasaMotorista + ", com o complemento "
                    + complementoMotorista + ", no bairro " + bairroMotorista
                    + "\n com o telefone de contato " + telefoneMotorista
                    + ", e com a habilitacao de número " + habilitacaoMotorista + ", do tipo "
                    + tipoHabilitacaoMotorista + "\n foi inscrito com sucesso! \n");
            return motorista;
        } else if (tipoMotorista == 1) {
            System.out.println("Digite o número de contrato do motorista que deseja cadastrar: ");
            Integer numContratoMotorista = sc.nextInt();
            System.out.println("Digite o data de início do contrato do motorista que deseja cadastrar: ");
            String dataInicioContrato = sc.next();
            System.out.println("Digite o data de terminio do contrato do motorista que deseja cadastrar: ");
            String dataFimContrato = sc.next();
            System.out.println("Digite o valor do contrato do motorista que deseja cadastrar: ");
            Double valorContrato = sc.nextDouble();
            System.out.println("Digite a data de nascimento do motorista que deseja cadastrar: ");
            String dataStr = sc.next();
            Date dataDeNascimentoMotorista = sdf.parse(dataStr);

            Contrato contrato = new Contrato(numContratoMotorista, sdf.parse(dataInicioContrato),
                    sdf.parse(dataFimContrato), valorContrato);

            Motorista motorista = new Motorista(nomeCivilMotorista, nomeMotorista, maeMotorista,
                    paiMotorista, naturalidadeMotorista, cpfMotorista,
                    ruaMotorista, complementoMotorista, bairroMotorista, telefoneMotorista,
                    habilitacaoMotorista, tipoHabilitacaoMotorista, numContratoMotorista.toString(),
                    numeroCasaMotorista, tipoMotorista, dataDeNascimentoMotorista, contrato);

            System.out.println("\n motorista " + nomeMotorista + " filho de " + maeMotorista + " e "
                    + paiMotorista +
                    "\n naturalidade " + naturalidadeMotorista + ", inscrito no CPF " + cpfMotorista +
                    "\n nascido em " + sdf.format(dataDeNascimentoMotorista) +
                    "\n reside na rua " + ruaMotorista + ", na casa de número " + numeroCasaMotorista
                    + ", com o complemento " + complementoMotorista + ", no bairro " + bairroMotorista +
                    "\n com o telefone de contato " + telefoneMotorista + ", e com a habilitacao de número "
                    + habilitacaoMotorista + ", do tipo " + tipoHabilitacaoMotorista +
                    "\n motorista cadastrado como terceirizado com o número de contrato:"
                    + numContratoMotorista +
                    "\n com data de início em " + sdf.format(dataInicioContrato) +
                    "\n e data de fim em " + sdf.format(dataFimContrato) +
                    "\n e contrato no valor de: " + valorContrato +
                    "\n motorista foi inscrito com sucesso! \n");
            return motorista;
        } else {
            System.out.println(
                    "Tipo de contrato inválido! Deve ser 0 para funcionário ou 1 para terceirizado.");
            return null;
        }
    }
}
