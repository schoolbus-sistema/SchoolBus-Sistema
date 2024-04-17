public class Secretaria {
    int numero;
    String nome,cnpj,email;
    public Secretaria(int numero,String nome, String cnpj,String email){
        this.numero= numero;
        this.cnpj=cnpj;
        this.nome=nome;
        this.email=email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}