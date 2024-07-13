/*Crie a classe Escola com os seguintes atributos:

nome (nome da escola): tipo String

cnpj (CNPJ da escola): tipo String

telefone (telefone da escola): tipo String

endereco (instância da classe Endereco que representa o endereço da escola): tipo Endereco (você deve criar a classe Endereco)

Implemente um construtor para a classe Escola que permita inicializar todos os atributos exceto a instância da classe Endereco.
*/

class Escola{
    String aluno;
    String cnpj;
    String telefone;
    Endereco endereco;
    

    public Escola(String aluno, String cnpj, String telefone, Endereco endereco){
        this.aluno=aluno;
        this.cnpj=cnpj;
        this.telefone=telefone;
        this.endereco=endereco;
    }

    public Escola(String aluno, String cnpj, String telefone, String bairro, String complemento, int numero, String rua){
        this.aluno=aluno;
        this.cnpj=cnpj;
        this.telefone=telefone;
       	this.endereco=Endereco(bairro,complemento,numero,rua);
    }
    
    
    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
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

