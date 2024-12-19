package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "amarela";
		
		switch(faixa.toLowerCase()) {
			case "preta":
				System.out.println("Sei o Bassai_Dai...");
			case "marrom":
				System.out.println("Sei o Tekki Shodan");
			case "roxa":
				System.out.println("Sei o Heian Godan");
			case "verde":
				System.err.println("Sei o Heian Yodan");
			case "laranja":
				System.err.println("Sei o Heian Sandan");
			case "vermelha":
				System.err.println("Sei o Heian Nidas");
			case "amarela":
				System.err.println("Sei o Heian Shodan");
			default:
				System.out.println("Não sei nada");
		}
		
	}
}
