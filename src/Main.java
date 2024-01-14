import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double rendacomsalario;
		double rendacomprestserviço;
		double rendacomganhocapital;
		double gastosmedicos;
		double gastoseducacionais;
		
	    Locale.setDefault(Locale.US);

	    // associa a entrada de dados ao teclado
		Scanner sc = new Scanner (System.in);
		
		//ler um numero doubble do teclado
		System.out.printf("Renda anual com salário => ");
		rendacomsalario = sc.nextDouble();
		
		System.out.printf("Renda anual com prestação de serviço => ");
		rendacomprestserviço = sc.nextDouble();
		
		System.out.printf("Renda anual com ganho de capital => ");
		rendacomganhocapital = sc.nextDouble();
		
		System.out.printf("Gastos médicos => ");
		gastosmedicos = sc.nextDouble();
		
		System.out.printf("Gastos educacionais => ");
		gastoseducacionais = sc.nextDouble();
		
		double salariomensal = rendacomsalario / 12;
		double impostoSalario = 0.0;
		
		if (salariomensal >= 3000 && salariomensal < 5000){
			impostoSalario = 0.10 * rendacomsalario;
		} else if (salariomensal > 5000 ) {
			impostoSalario = 0.20 * rendacomsalario;
		}
		
		double impostoPrestserv =  (rendacomprestserviço > 0) ? 0.15 * rendacomsalario : 0.0;
		double impostoCapital =  (rendacomganhocapital > 0) ? 0.20 * rendacomganhocapital : 0.0;
		double maxDedutivel = (impostoSalario + impostoPrestserv + impostoCapital) * 0.30;
		double gastosDedutiveis = (gastosmedicos + gastoseducacionais);
		
		double abatimentos = (gastosDedutiveis >  maxDedutivel) ? maxDedutivel : gastosDedutiveis ;
		
				
		System.out.println("\n RELATÓRIO DE IMPOSTO DE RENDA \n ");
		System.out.println("CONSOLIDADO DE RENDA: ");
				
		System.out.printf("Imposto sobre salário: %.2f \n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f \n",impostoPrestserv);
		System.out.printf("Imposto sobre ganho de capital: %.2f \n",impostoCapital);
		
		System.out.println("\n DEDUÇÕES: \n ");
		
		System.out.printf("Máximo dedutível: %.2f \n", maxDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f \n",gastosDedutiveis);
		
		System.out.println("\n RESUMO:  \n ");
		
		System.out.printf("Imposto bruto total: %.2f \n",impostoSalario+impostoPrestserv+impostoCapital);
		System.out.printf("Abatimento: %.2f  \n",abatimentos);
		System.out.printf("Imposto devido: %.2f  \n", (impostoSalario+impostoPrestserv+impostoCapital)- abatimentos );
		
		
		sc.close();
	

	}

}
