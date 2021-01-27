package Model;

public class ModelCalculadora {

	public double calculate(double numero1 , double numero2, String operador) {
		switch(operador) {
		case "+": return (numero1 + numero2);
		case "-": return (numero1 - numero2);
		case "x": return (numero1 * numero2);
		case "/": return (numero1 / numero2);
		}
		
		System.out.println("Operador desconhecido: "+operador);
		return 0;
	}
}
