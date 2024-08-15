import java.util.*;
import java.util.ArrayList;

class Rota {
    private static int totalRotas = 0; // Contador estático
    private int id;
    private ArrayList<PontoDeParada> pontosDeParada;

    public Rota() {
        this.id = ++totalRotas; // Atribuição automática do ID
        this.pontosDeParada = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<PontoDeParada> getPontosDeParada() {
        return pontosDeParada;
    }

    public void setPontosDeParada(ArrayList<PontoDeParada> pontosDeParada) {
        this.pontosDeParada = pontosDeParada;
    }

    public void adicionarPontoDeParada(PontoDeParada ponto) {
        pontosDeParada.add(ponto);
    }

    public int calcularDemandaTotal() {
        int demandaTotal = 0;
        for (PontoDeParada ponto : pontosDeParada) {
            demandaTotal = ponto.getTotalPontosDeParada();
        }
        return demandaTotal;
    }

    public static void exibirTotalRotas() {
        System.out.println("Total de rotas: " + totalRotas);
    }
}