import java.util.Scanner;

public class CadastroPontoDeParada {
    Scanner sc = new Scanner(System.in);

    public PontoDeParada cadastrarPontoDeParada() {

        System.out.println("Digite o nome do ponto de parada que deseja cadastrar: ");
        String nomePonto = sc.next();
        System.out.println("Digite a latitude do ponto de parada: ");
        double latitude = sc.nextDouble();
        System.out.println("Digite a longitude do ponto de parada: ");
        double longitude = sc.nextDouble();
        System.out.println("Digite o id do ponto de parada: ");
        int idPontoDeParad = sc.nextInt();
        PontoDeParada ponto = new PontoDeParada(nomePonto, latitude, longitude, idPontoDeParad);
        System.out.println("Ponto de parada criado com sucesso!");
        return ponto;
    }
}
