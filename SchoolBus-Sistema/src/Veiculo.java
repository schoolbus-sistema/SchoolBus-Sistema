public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private int capacidade;
    private String tipo;
    private Contrato contrato;

    public Veiculo(String placa, String modelo, int ano, int capacidade, String tipo, Contrato contrato) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.contrato = contrato;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Contrato getContrato() {
        return contrato;
    }
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

}
