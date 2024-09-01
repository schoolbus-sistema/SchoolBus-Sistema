import java.util.Date;

// Classe PessoaFisica que herda de Pessoa
public class PessoaFisica extends Pessoa {
    // Atributos específicos de PessoaFisica
    protected String nome; // Nome social da pessoa
    protected String mae; // Nome da mãe da pessoa
    protected String pai; // Nome do pai da pessoa
    protected String naturalidade; // Cidade onde a pessoa nasceu
    protected Date dataNascimento; // Data de nascimento da pessoa

    // Construtor
    public PessoaFisica(String nomeOficial, String cpf, Endereco endereco, String telefone,
                        String nome, String mae, String pai, String naturalidade, Date dataNascimento) {
        super(nomeOficial, cpf, endereco, telefone); // Chamada ao construtor da classe base Pessoa
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
