import java.util.ArrayList;
/*Crie a classe Escola com os seguintes atributos:

nome (nome da escola): tipo String

cnpj (CNPJ da escola): tipo String

telefone (telefone da escola): tipo String

endereco (instância da classe Endereco que representa o endereço da escola): tipo Endereco (você deve criar a classe Endereco)

Implemente um construtor para a classe Escola que permita inicializar todos os atributos exceto a instância da classe Endereco.
*/



class Escola {
    String nome;
    String cnpj;
    String telefone;
    Endereco endereco;
    ArrayList<Aluno> alunosMatriculados;
    


    public Escola(String nome, String cnpj, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.alunosMatriculados = new ArrayList<>();
    }

    
    public Escola(String nome, String cnpj, String telefone, String bairro, String complemento, int numero, String rua) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
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
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
}