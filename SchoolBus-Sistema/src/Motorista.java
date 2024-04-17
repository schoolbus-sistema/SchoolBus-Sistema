import java.util.Date;

public class Motorista {
    private String nomeCivil,nome,mae,pai,naturalidade,cpfCnpj,rua,complemento,bairro,telefone,numHabilitacao,tipoHabilitacao,numContrato;//Caso o nome social não seja informado, este deve ser preenchido com o nome civil. 
    private Integer numero,tipo;
    private Date dataDeNascimento;
    private Contrato contrato;
   

    public Motorista(String nomeCivil, String nome, String mae, String pai, String naturalidade,String cpfCnpj,String rua,String complemento,String bairro,String telefone,String numHabilitacao,String tipoHabilitacao,String numContrato, Integer numero,Integer tipo,Date dataDeNascimento, Contrato contrato) {
        this.nomeCivil = nomeCivil;
        if (nome != null) {
           this.nome = nome;
        } else{
            this.nome = nomeCivil;
        }
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.cpfCnpj = cpfCnpj;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.numHabilitacao = numHabilitacao;
        this.tipoHabilitacao = tipoHabilitacao;
        this.numero = numero;
        this.tipo = tipo;
        this.dataDeNascimento = dataDeNascimento;
        if (tipo == 1) {
           this.contrato = contrato;
           this.numContrato = numContrato;
        } else if (tipo != 0 && tipo != 1) {
            throw new IllegalArgumentException("Tipo de motorista inválido: " + tipo);
        }
    }
    

    public Motorista(String nomeCivil, String nome, String mae, String pai, String naturalidade,String cpfCnpj,String rua,String complemento,String bairro,String telefone,String numHabilitacao,String tipoHabilitacao, Integer numero,Integer tipo,Date dataDeNascimento) {
        this.nomeCivil = nomeCivil;
        if (nome != null) {
           this.nome = nome;
        } else{
            this.nome = nomeCivil;
        }
        this.mae = mae;
        this.pai = pai;
        this.naturalidade = naturalidade;
        this.cpfCnpj = cpfCnpj;
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.numHabilitacao = numHabilitacao;
        this.tipoHabilitacao = tipoHabilitacao;
        this.numero = numero;
        this.tipo = tipo;
        this.dataDeNascimento = dataDeNascimento;

    }
    
    
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


    public String getCpfCnpj() {
        return cpfCnpj;
    }


    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
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


    public String getNumHabilitacao() {
        return numHabilitacao;
    }


    public void setNumHabilitacao(String numHabilitacao) {
        this.numHabilitacao = numHabilitacao;
    }


    public String getTipoHabilitacao() {
        return tipoHabilitacao;
    }


    public void setTipoHabilitacao(String tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }


    public Integer getNumero() {
        return numero;
    }


    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public Integer getTipo() {
        return tipo;
    }


    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }


    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }


    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


    public Contrato getContrato() {
        if (this.contrato != null) {
            return this.contrato;
        } else {
            throw new IllegalArgumentException(" Não possui contrato");
        }
    }
    public int numContrato(){
        if(this. contrato != null){
            return contrato.getNumContrato();
        }
        else{
            throw new IllegalArgumentException(" Motorista não possui número de  contrato");
        }
        

    }

    public void setContrato(){
        if(this. contrato != null){
            int x =Integer.parseInt(numContrato);
            contrato.setNumContrato(x);
        }
        else{
            throw new IllegalArgumentException(" Motorista não possui número de  contrato");
        }
        

    }
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void tipoMotorista(){
        switch (this.tipo){
            case 1:
                System.out.print("Esse motorista é terceirizado e possui o número de contrato: " + contrato.getNumContrato());
                break;
            case 0:
                System.out.print("Esse motorista é servidor ");
                break;
            default:
                System.out.print("Tipo de motorista inválido");
        }
    }
    
        
    }