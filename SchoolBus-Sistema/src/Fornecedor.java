import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {
   
    private ArrayList<Contrato> contratos;

    
    public Fornecedor(String nomeOficial, String cpfCnpj, Endereco endereco, String telefone, 
                      String nomeFantasia, int numFuncionario) {
        super(nomeOficial, cpfCnpj, endereco, telefone, nomeFantasia, numFuncionario);
        this.contratos = new ArrayList<Contrato>();
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void adicionarContrato(Contrato contrato) {
        if (contrato != null) {
            contratos.add(contrato);
            System.out.println("Contrato adicionado com sucesso.");
        } else {
            throw new IllegalArgumentException("Contrato não pode ser nulo.");
        }
    }

    public void removerContrato(int numeroContrato) {
        boolean removed = contratos.removeIf(c -> c.getNumContrato() == numeroContrato);
        if (removed) {
            System.out.println("Contrato removido com sucesso.");
        } else {
            throw new IllegalArgumentException("Contrato não encontrado.");
        }
    }

    public void exibirContratos() {
        if (contratos.isEmpty()) {
            System.out.println("Não há contratos associados a este fornecedor.");
        } else {
            for (Contrato contrato : contratos) {
                System.out.println(contrato);
            }
        }
    }
    @Override
    public void apresentarDados() {
        super.apresentarDados(); 
        System.out.println("Contratos associados: ");
        exibirContratos();
    }

    @Override
    public String verificarTipo(){
        return "Fornecedor";
    }

}
