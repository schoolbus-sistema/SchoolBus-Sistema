

    public class Pessoa {
        // Atributos comuns
        protected String nomeOficial;
        protected String cpfCnpj;
        protected static Endereco endereco;
        protected String telefone;
    
        // Construtor
        public Pessoa(String nomeOficial, String cpfCnpj, Endereco endereco, String telefone) {
            this.nomeOficial = nomeOficial;
            this.cpfCnpj = cpfCnpj;
            this.endereco = endereco;
            this.telefone = telefone;
        }
    
        protected String getNomeOficial() {
            return nomeOficial;
        }
    
        protected String getCPFCNPJ() {
            return cpfCnpj;
        }
    
        public Endereco getEndereco() {
            return endereco;
        }
    
        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }
    
        public String getTelefone() {
            return telefone;
        }
    
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    
        // Método apresentarDados
        public void apresentarDados() {
            System.out.println("Nome Oficial: " + nomeOficial);
            System.out.println("CPF/CNPJ: " + cpfCnpj);
            System.out.println("Telefone: " + telefone);
            System.out.println("Endereço: " + (endereco != null ? endereco.toString() : "Não informado"));
        }
       
    }
    

 

