import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // chamada das instancias e metodos.
       Contrato contratoMotorista = new Contrato(1222,new Date(2025,05,03),new Date(2024,05,03),1350.00);
       Contrato contratoVeiculo = new Contrato(1212,new Date(2025,05,03),new Date(2024,05,03),1350.00);
       Motorista marcos = new Motorista("Marcos", "Marcos", "Ana", "Jose", "Brasileiro", "00100200304", "Rua dos gansos", "Casa", "Cajazeiras", "91919191", "010101", "AB","1222", 10, 1, new Date(1998,05,12),contratoMotorista);
       Motorista gabriel = new Motorista("Gabriel", "Gabriel", "Maria", "Pedro", "Brasileiro", "00200300405", "Rua dos patos", "Casa", "Brotas", "92929292", "020202", "AB","1222", 507, 1, new Date(1990,07,22),contratoMotorista);
       Veiculo gol = new Veiculo("ABC-1234", "Gol", 2019, 4, 1, contratoVeiculo);
       Veiculo fusca = new Veiculo("DEF-5678", "Fusca", 1997, 4, 0, null);

       //Marcos
       System.out.println(marcos.getNomeCivil());
       System.out.println(marcos.getNome());
       System.out.println(marcos.getMae());
       System.out.println(marcos.getPai());
       System.out.println(marcos.getRua());
       System.out.println(marcos.getNumero());
       System.out.println(marcos.getBairro());
       System.out.println(marcos.getNaturalidade());
       System.out.println(marcos.getCpfCnpj());
       System.out.println(marcos.getTelefone());
       System.out.println(marcos.getNumHabilitacao());
       System.out.println(marcos.getTipoHabilitacao());

       //Gabriel
       System.out.println(gabriel.getNomeCivil());
       System.out.println(gabriel.getNome());
       System.out.println(gabriel.getMae());
       System.out.println(gabriel.getPai());
       System.out.println(gabriel.getRua());
       System.out.println(gabriel.getNumero());
       System.out.println(gabriel.getBairro());
       System.out.println(gabriel.getNaturalidade());
       System.out.println(gabriel.getCpfCnpj());
       System.out.println(gabriel.getTelefone());
       System.out.println(gabriel.getNumHabilitacao());
       System.out.println(gabriel.getTipoHabilitacao());

       //Gol
       System.out.println(gol.getPlaca());
       System.out.println(gol.getModelo());
       System.out.println(gol.getAno());
       System.out.println(gol.getCapacidade());
       System.out.println(gol.getTipo());

       //Fusca
       System.out.println(fusca.getPlaca());
       System.out.println(fusca.getModelo());
       System.out.println(fusca.getAno());
       System.out.println(fusca.getCapacidade());
       System.out.println(fusca.getTipo());

       //Contratos
       System.out.println(marcos.getContrato());
       System.out.println(gabriel.getContrato());
       System.out.println(gol.getContrato());
       System.out.println(marcos.numContrato());
       System.out.println(gabriel.numContrato());

       //metodos
     contratoVeiculo.adicionarVeiculos(gol);
















    }
}
