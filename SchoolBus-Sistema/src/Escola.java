import java.util.ArrayList;
/*Crie a classe Escola com os seguintes atributos:

nome (nome da escola): tipo String

cnpj (CNPJ da escola): tipo String

telefone (telefone da escola): tipo String

endereco (instância da classe Endereco que representa o endereço da escola): tipo Endereco (você deve criar a classe Endereco)

Implemente um construtor para a classe Escola que permita inicializar todos os atributos exceto a instância da classe Endereco.
*/



class Escola extends PessoaJuridica{
    private String nome;
    ArrayList<Aluno> alunosMatriculados;
    


    public Escola(String nome, String nomeOficial, String cpfCnpj, String telefone, String nomeFantasia, int numFuncionario, Endereco endereco) {
        super(nomeOficial, cpfCnpj, endereco, telefone, nomeFantasia, numFuncionario);
        this.nome = nome;
        this.alunosMatriculados = new ArrayList<>();
    }

    
    public Escola(String nome, String nomeFantasia,String nomeOficial, String cpfCnpj, String telefone, int numFuncionario, String bairro, String complemento, int numero, String rua) {
        super(nomeOficial, cpfCnpj, endereco, telefone, nomeFantasia, numFuncionario);
        this.nome = nome;
        this.endereco = new Endereco(bairro, complemento, numero, rua);
        this.alunosMatriculados = new ArrayList<>();
    }

     
    public void matricularAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    
    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cpfCnpj;
    }

    public void setCnpj(String cnpj) {
        this.cpfCnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
    @Override
    public void apresentarDados() {
        super.apresentarDados(); 
        System.out.println("Nome da Escola: " + nome);
        System.out.println("Alunos Matriculados: ");
        if (alunosMatriculados.isEmpty()) {
            System.out.println("Nenhum aluno matriculado.");
        } else {
            for (Aluno aluno : alunosMatriculados) {
                System.out.println(aluno.toString());
            }
        }
    }
    
    @Override
    public String verificarTipo() {
        return "Escola";
    }
}