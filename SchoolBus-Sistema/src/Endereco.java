/*Crie a classe Endereco com os seguintes atributos:

rua (nome da rua): tipo String

numero (número): tipo Integer

complemento (complemento do endereço): tipo String

bairro (bairro): tipo String

Implemente um construtor para a classe Endereco que permita inicializar todos os atributos.
*/

class Endereco {
    String rua;
    int numero;
    String complemento;
    String bairro;

    public Endereco(String bairro, String complemento, int numero, String rua) {
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.rua = rua;
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

    public void setNumero(int numero) {
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


}