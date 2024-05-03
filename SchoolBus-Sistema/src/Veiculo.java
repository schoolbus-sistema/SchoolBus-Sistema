// Alunos: Caique Menezes,William Gomes,Lucas Eduardo, João Phillipe Fernandes

public class Veiculo {
    private String placa;
    private String modelo;
    private Integer ano;
    private Integer capacidade;
    private Integer tipo;
    private Contrato contrato;
   

    public Veiculo(String placa, String modelo, Integer ano, Integer capacidade, Integer tipo, Contrato contrato) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.tipo = tipo;
        if (tipo == 1) {
           this.contrato = contrato;
        } else if (tipo != 0 && tipo != 1) {
            throw new IllegalArgumentException("Tipo de veículo inválido: " + tipo);
        }
    }


    public Veiculo(String placa, String modelo, Integer ano, Integer capacidade, Integer tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public int getCapacidade() {
        return this.capacidade;
    }
    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
    public int getTipo() {
        return this.tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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
            throw new IllegalArgumentException(" Veiculo não possui número de  contrato");
        }
        

    }
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void tipoVeiculo(){
        switch (this.tipo){
            case 1:
                System.out.print("Esse veículo é Alugado e possui o número de contrato: " + contrato.getNumContrato());
                break;
            case 0:
                System.out.print("Esse veículo é próprio");
                break;
            default:
                System.out.print("Tipo de veículo inválido");
        }
    }
    
        
    }

