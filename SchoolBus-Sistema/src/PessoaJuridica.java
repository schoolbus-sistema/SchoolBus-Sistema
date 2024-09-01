public class PessoaJuridica extends Pessoa {
    // Atributos específicos de PessoaJuridica
    protected String nomeFantasia;
    protected int numFuncionario;

    // Construtor
    public PessoaJuridica(String nomeOficial, String cpfCnpj, Endereco endereco, String telefone, String nomeFantasia, int numFuncionario) {
        super(nomeOficial, cpfCnpj, endereco, telefone);
        this.nomeFantasia = nomeFantasia;
        this.numFuncionario = numFuncionario;
    }

    // Getters e Setters
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getNumFuncionario() {
        return numFuncionario;
    }

    public void setNumFuncionario(int numFuncionario) {
        this.numFuncionario = numFuncionario;
    }

    @Override
    public void apresentarDados(){
        super.apresentarDados();
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Número de funcionarios: " + numFuncionario);
    }

}
