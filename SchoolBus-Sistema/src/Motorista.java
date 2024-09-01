import java.util.ArrayList;
import java.util.Date;
// Alunos: Caique Menezes,William Gomes
//,Lucas Eduardo, João Phillipe Fernandes
public class Motorista extends PessoaFisica {
    private String nomeCivil,nome,mae,pai,naturalidade,cpfCnpj,rua,complemento,bairro,telefone,numHabilitacao,tipoHabilitacao,numContrato;//Caso o nome social não seja informado, este deve ser preenchido com o nome civil. 
    private int numero,tipo;
    private Date dataDeNascimento;
    private Contrato contrato;
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
   

    public Motorista(String nomeCivil,String nomeOficial, String cpf, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade,String cpfCnpj,String rua,String complemento,String bairro, String numHabilitacao,String tipoHabilitacao,String numContrato, int numero,int tipo,Date dataDeNascimento, Contrato contrato) {
        super(nomeOficial, cpf, endereco, telefone, nome, mae, pai, naturalidade, dataDeNascimento);
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
    

    public Motorista(String nomeCivil,String nomeOficial, String cpf, Endereco endereco, String telefone, String nome, String mae, String pai, String naturalidade,String cpfCnpj,String rua,String complemento,String bairro,String numHabilitacao,String tipoHabilitacao, int numero,int tipo,Date dataDeNascimento) {
        super(nomeOficial, cpf, endereco, telefone);
        this.nomeCivil = nomeCivil;
        if (nome != null) {
           this.nome = nome;
        } else{
            this.nome = nomeCivil;
        }

        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numHabilitacao = numHabilitacao;
        this.tipoHabilitacao = tipoHabilitacao;
        this.numero = numero;
        this.tipo = tipo;
        this.dataDeNascimento = dataDeNascimento;

    }
    
    // GETTERS E SETTERS
    
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



    //METODOS PARA CONVETER AS SAIDAS EM STRING

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", CPF: " + getCpfCnpj();
    }



    // METODOS: 

    public Contrato getContrato() {
        if (this.contrato != null) {
            return this.contrato;
        } else {
            throw new IllegalArgumentException("Não possui contrato.");
        }
    }
    public int numContrato(){
        if(this. contrato != null){
            return contrato.getNumContrato();
        }
        else{
            throw new IllegalArgumentException(" Motorista não possui número de  contrato.");
        }
        

    }

    public void setContrato(){
        if(this. contrato != null){
            int x =Integer.parseInt(numContrato);
            contrato.setNumContrato(x);
        }
        else{
            throw new IllegalArgumentException(" Motorista não possui número de  contrato.");
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
                System.out.print("Esse motorista é servidor.");
                break;
            default:
                System.out.print("Tipo de motorista inválido.");
        }
    }
    
    public void adicionarContratos(Contrato contrato){
        if( this.tipo == 1){
            this.contratos.add(contrato);
            System.out.println("Contrato adicionado com sucesso.");
        }
        else{
            throw new IllegalArgumentException("Esse motorista não é terceirizado.");
        }
    }
    
    public void removerContrato(int numeroContrato){
        if(this.contratos == null || this.contratos.isEmpty()){

            throw new IllegalArgumentException("Esse contrato nao está vinculado a esse motorista.");
        }
        else{
            for ( int i = 0; i < this.contratos.size(); i++){
                if(this.contratos.get(i).getNumContrato()== numeroContrato){
                    this.contratos.remove(i);
                    System.out.println("Contrato removido com sucesso.");
                }
            }
        }
    }

    public void exibirContratos(){
        if(this.contratos == null || this.contratos.isEmpty()){
            for( int i = 0; i<this.contratos.size(); i++){
                System.out.println(this.contratos.get(i).toString());
            }
        }
        else{
            throw new IllegalArgumentException("Esse motorista não possui contratos.");
        }
        
    }
    @Override
    public void apresentarDados() {
        super.apresentarDados(); // Chama o método da classe Pessoa
        System.out.println("Nome Civil: " + nomeCivil);
        System.out.println("Nome Social: " + nome);
        System.out.println("Mãe: " + mae);
        System.out.println("Pai: " + pai);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("CPF/CNPJ: " + cpfCnpj);
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Telefone: " + telefone);
        System.out.println("Número de Habilitação: " + numHabilitacao);
        System.out.println("Tipo de Habilitação: " + tipoHabilitacao);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
        if (tipo == 1) {
            System.out.println("Número do Contrato: " + numContrato);
        }
        System.out.println("Tipo de Motorista: " + (tipo == 1 ? "Terceirizado" : "Servidor"));
  
    }
}