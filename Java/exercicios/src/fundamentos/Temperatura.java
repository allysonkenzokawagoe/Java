package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double f = 86;
		final int AJUSTE = 32;
		final double FAOTR = 5.0/9.0;
		double celsius = (f - AJUSTE) * FAOTR;
		
		System.out.println("O resultado é: " + celsius + "°C");
	}
}
