import java.util.Date;

public class Contrato {
    private int numContrato;
    private Date dataInicial;
    private Date dataFinal;

    public Contrato(int numContrato, Date dataInicial, Date dataFinal) {
        this.numContrato = numContrato;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;

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
}
