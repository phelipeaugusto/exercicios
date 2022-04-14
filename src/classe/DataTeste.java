package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
//para mudar o ano
		d1.ano = 2080;
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		
		
	}
}
