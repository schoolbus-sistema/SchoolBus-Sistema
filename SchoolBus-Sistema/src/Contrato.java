import java.util.Date;
import java.util.ArrayList;

public class Contrato {
    ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    ArrayList<Motorista> motoristas = new ArrayList<Motorista>();
    ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    private int numContrato;
    private Date dataInicial;
    private Date dataFinal;
    private Double valor;

    public Contrato(int numContrato, Date dataInicial, Date dataFinal, Double valor) {
        this.numContrato = numContrato;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.valor = valor;

    }

    @Override
    public String toString() {
        return "Numero de contrato: " + getNumContrato() + ", Data inicial: " + getDataInicial() + ", Data final: "
                + getDataFinal();
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void adicionarVeiculos(Veiculo veiculos) {
        if ((veiculos.getTipo()) == 1) {
            this.veiculos.add(veiculos);
        } else {
            throw new IllegalArgumentException(" Veiculo não é alugado");
        }

    }

    public void removerVeiculos(Veiculo veiculo) {
        this.veiculos.remove(veiculo);
    }

    public void adicionarMotorista(Motorista motorista) {
        if (motorista.getTipo() == 1) {
            this.motoristas.add(motorista);
            System.out.println("Motorista adicionado com sucesso");
        } else {
            throw new IllegalArgumentException("Esse motorista não é terceirizado");
        }
    }

    public void removerMotoristas(String cpfMotorista) {
        if (this.motoristas == null || this.motoristas.isEmpty()) {

            throw new IllegalArgumentException("Esse motorista não está vinculado a esse contrato");

        } else {
            for (int i = 0; i < this.motoristas.size(); i++) {
                if (this.motoristas.get(i).getCpfCnpj().equals(cpfMotorista)) {
                    this.motoristas.remove(i);
                    System.err.println("Motorista removiddo com sucesso");

                }

            }
        }

    }

    public void exibirMotoristas() {
        if (this.motoristas == null || this.motoristas.isEmpty()) {
            throw new IllegalArgumentException("Esse contrato não possui motoristas");

        }
        for (int i = 0; i < this.motoristas.size(); i++) {
            System.out.println(this.motoristas.get(i).toString());
        }
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        if (fornecedor.getClass() == Fornecedor.class) {
            this.fornecedores.add(fornecedor);
            System.out.println("Fornecedor adicionado");
        } else if (fornecedor.getClass().getSuperclass() == PessoaJuridica.class) {
            this.fornecedores.add(fornecedor);
        } else {
            throw new IllegalArgumentException("Não existe fornecedor cadastrado com esses dados");
        }
    }  
}
