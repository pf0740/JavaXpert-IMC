import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// Declaração das variáveis
		
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		String nomeDoUsuario;
		
		// Lendo o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		System.out.print("Olá. Qual seu nome? ");
		nomeDoUsuario = leitor.nextLine();
		
		// Criando as variáveis para cálculo
		System.out.print("\nDigite seu peso: ");
		pesoDoUsuario = leitor.nextInt();
		System.out.print("\nDigite sua altura em metros (formato X,XX): ");
		alturaDoUsuario = leitor.nextDouble();
		leitor.close();
		//System.out.print(nomeDoUsuario);
		imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		System.out.print("\n" + nomeDoUsuario + ", seu IMC é: " + imc + "!");
		
		// Determinar a classificação do IMC
		
		if (imc < 18.4) {
			System.out.println("Você está abaixo do peso ideal.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Seu peso é considerado normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("No momento você está com sobrepeso.");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("No momento você está com obesidade grau I.");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("No momento você está com obesidade grau II.");
		} else if (imc >= 40) {
			System.out.println("Faça seu testamento URGENTE!");
		}
	}
}
