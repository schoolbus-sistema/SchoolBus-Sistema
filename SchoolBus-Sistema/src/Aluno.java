import java.util.Date;

public class Aluno extends PessoaFisica {
    private String nomeCivil;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private int matricula;
    private String serie;
    private Escola escola;
    private PontoDeParada pontoDeParada;
    private String cpf;

    public Aluno(String nomeCivil, String nomeOficial, String cpf, Endereco endereco, String telefone, String nome,
            String mae, String pai, String naturalidade,
            Date dataNascimento, String rua, int numero, String complemento, String bairro,
            int matricula, String serie) {
        super(nomeOficial, cpf, endereco, telefone, nome, mae, pai, naturalidade, dataNascimento);
        this.nomeCivil = nomeCivil;
        this.nome = nome;
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.matricula = matricula;
        this.serie = serie;
    }

    // Getters e Setters

    public String getNomeCivil() {
        return nomeCivil;
    }

    public void setNomeCivil(String nomeCivil) {
        this.nomeCivil = nomeCivil;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados(); // Chama o método apresentarDados() da classe Pessoa
        System.out.println("Nome Civil: " + nomeCivil);
        System.out.println("Mãe: " + mae);
        System.out.println("Pai: " + pai);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Série: " + serie);
        System.out.println("Escola: " + (escola != null ? escola.toString() : "Não informado"));
        System.out.println("Ponto de Parada: " + (pontoDeParada != null ? pontoDeParada.toString() : "Não informado"));
    }
    @Override
    public String verificarTipo() {
        return "Aluno";
    }
}