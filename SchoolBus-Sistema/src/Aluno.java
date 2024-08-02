import java.util.Date;

public class Aluno {
    private String nomeCivil;
    private String nome;
    private String mae;
    private String pai;
    private String naturalidade;
    private String cpf;
    private Date dataNascimento;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String telefone;
    private int matricula;
    private String serie;
    private Escola escola;
    private Rota rota;
    
    public Aluno(String nomeCivil, String nome, String mae, String pai, String naturalidade, String cpf,
                 Date dataNascimento, String rua, int numero, String complemento, String bairro,
                 String telefone, int matricula, String serie) {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
}