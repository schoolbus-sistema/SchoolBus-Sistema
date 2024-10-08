import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class CadastroContrato {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner sc = new Scanner(System.in);

    public Contrato cadastrarContrato() throws ParseException {

        System.out.println("Digite o número de contrato que deseja cadastrar: ");
        Integer numContrato = sc.nextInt();
        System.out.println("Digite o data de início do contrato que deseja cadastrar: ");
        String dataStr = sc.next();
        Date dataInicio = sdf.parse(dataStr);
        System.out.println("Digite o data de terminio do contrato que deseja cadastrar: ");
        dataStr = sc.next();
        Date dataFim = sdf.parse(dataStr);
        System.out.println("Digite o valor do contrato que deseja cadastrar: ");
        Double valorContrato = sc.nextDouble();
        Contrato contrato = new Contrato(numContrato, dataInicio, dataFim, valorContrato);
        System.out.println("\n Contrato cadastrado com o número de contrato " + numContrato +
                "\n com data de início em " + sdf.format(dataInicio) +
                "\n e data de fim em " + sdf.format(dataFim) +
                "\n e contrato no valor de: " + valorContrato +
                "\n Contrato foi cadastrado com sucesso! \n");
        return contrato;
    }
}
