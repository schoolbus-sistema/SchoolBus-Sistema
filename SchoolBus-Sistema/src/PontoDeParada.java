import java.util.ArrayList;

public class PontoDeParada {
    // Atributos da classe
    private String nome;
    private double latitude;
    private double longitude;
    private int id;
    private ArrayList<Aluno> alunos;
    
    // Campo estático para contar o número total de pontos de parada
    private static int totalPontosDeParada = 0;

    // Construtor da classe
    public PontoDeParada(String nome, double latitude, double longitude, int id, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
        this.alunos = alunos;
        // Incrementa o total de pontos de parada ao criar um novo objeto
        totalPontosDeParada++;
    }

    public PontoDeParada(String nome, double latitude, double longitude, int id) {
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
        // Incrementa o total de pontos de parada ao criar um novo objeto
        totalPontosDeParada++;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    // Método estático para obter o número total de pontos de parada criados
    public static int getTotalPontosDeParada() {
        return totalPontosDeParada;
    }

    // Método estático para exibir o número total de pontos de parada criados
    public static void exibirTotalPontosDeParada() {
        System.out.println("Número total de pontos de parada criados: " + totalPontosDeParada);
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
