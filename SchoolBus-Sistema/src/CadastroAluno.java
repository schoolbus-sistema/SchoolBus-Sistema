import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class CadastroAluno {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Aluno cadastrarAluno() throws ParseException {

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
        Endereco endereco = new Endereco(bairroAluno, complementoAluno, numeroCasaAluno, ruaAluno);
        Aluno aluno = new Aluno(nomeCivilAluno, nomeAluno, cpfAluno, endereco, telefoneAluno, nomeAluno, maeAluno,
                paiAluno, naturalidadeAluno,
                dataDeNascimentoAluno, ruaAluno, numeroCasaAluno, complementoAluno, bairroAluno, matriculaAluno,
                serieAluno);
        System.out.println("\n Aluno " + nomeAluno + " filho de " + maeAluno + " e " + paiAluno + "\n naturalidade "
                + naturalidadeAluno + ", inscrito no CPF " + cpfAluno + "\n nascido em "
                + sdf.format(dataDeNascimentoAluno) + "\n reside na rua " + ruaAluno + ", na casa de número "
                + numeroCasaAluno + ", com o complemento " + complementoAluno + ", no bairro " + bairroAluno
                + "\n com o telefone de contato " + telefoneAluno + ", e com o numero de matricula " + matriculaAluno
                + ", inscrito na serie " + serieAluno + "\n foi inscrito com sucesso! \n");
        return aluno;
    }
}
