import java.util.Scanner;

public class CadastroFornecedor {
    Scanner sc = new Scanner(System.in);

    public Fornecedor cadastrarFornecedor() {
        System.out.println("Digite o nome oficial do fornecedor");
        String nomeOficial = sc.next();
        System.out.println("Digite o CNPJ do fornecedor");
        String cnpj = sc.next();
        System.out.println("Digite a rua do fornecedor");
        String rua = sc.next();
        System.out.println("Digite o complemento do endereço do fornecedor que deseja cadastrar: ");
        String complementoFornecedor = sc.next();
        System.out.println("Digite o bairro do fornecedor que deseja cadastrar: ");
        String bairroFornecedor = sc.next();
        System.out.println("Digite o número da casa do fornecedor que deseja cadastrar: ");
        int numeroCasaFornecedor = sc.nextInt();
        System.out.println("Digite o telefone do fornecedor que deseja cadastrar: ");
        String telefoneFornecedor = sc.next();
        System.out.println("Digite o nome fantasieso do fornecedor que deseja cadastrar");
        String nomeFantasia = sc.next();
        System.out.println("Digite o numero de funcionario");
        int numeroFuncionarios = sc.nextInt();
        Endereco endereco = new Endereco(bairroFornecedor, complementoFornecedor, numeroFuncionarios, rua);
        Fornecedor fornecedor = new Fornecedor(nomeOficial, cnpj, endereco, telefoneFornecedor, nomeFantasia,
                numeroFuncionarios);
        return fornecedor;
    }
}