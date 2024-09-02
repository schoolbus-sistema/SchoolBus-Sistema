import java.util.Scanner;

public class CadastroEscola {
    Scanner sc = new Scanner(System.in);

    public Escola cadastrarEscola() {

        System.out.println("Digite o nome da Escola que deseja cadastrar: ");
        String nomeEscola = sc.next();
        System.out.println("Digite o nome oficial da Escola que deseja cadastrar: ");
        String nomeOficialEscola = sc.next();
        System.out.println("Digite o nome fantasia da Escola que deseja cadastrar: ");
        String nomeFantasiaEscola = sc.next();
        System.out.println("Digite o CNPJ da Escola que deseja cadastrar: ");
        String cnpjEscola = sc.next();
        System.out.println("Digite o numero do Funcionario da escola: ");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite o telefone da Escola que deseja cadastrar: ");
        String telefoneEscola = sc.next();
        System.out.println("Digite o bairro da Escola que deseja cadastrar: ");
        String bairroEscola = sc.next();
        System.out.println("Digite o complemento da Escola que deseja cadastrar: ");
        String complementoEscola = sc.next();
        System.out.println("Digite o numero da Escola que deseja cadastrar: ");
        int numeroEscola = sc.nextInt();
        System.out.println("Digite o nome da rua da Escola que deseja cadastrar: ");
        String ruaEscola = sc.next();
        Endereco endereco = new Endereco(bairroEscola, complementoEscola, numeroEscola, ruaEscola);
        Escola escola = new Escola(nomeEscola, nomeOficialEscola, cnpjEscola, telefoneEscola, nomeFantasiaEscola,
                numeroFuncionario, endereco);
        System.out.println("\n Escola " + nomeEscola +
                "\n localizada na rua " + ruaEscola + " presente no bairro " + bairroEscola
                + " com o complemento " + complementoEscola + " e o número " + numeroEscola +
                "\n inscrita no CNPJ " + cnpjEscola +
                "\n Foi cadastrada com sucesso!");
        return escola;
    }
}
