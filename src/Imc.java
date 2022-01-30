import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		// Declara��o das vari�veis
		
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		String nomeDoUsuario;
		
		// Lendo o teclado do usu�rio
		Scanner leitor = new Scanner(System.in);
		System.out.print("Ol�. Qual seu nome? ");
		nomeDoUsuario = leitor.nextLine();
		
		// Criando as vari�veis para c�lculo
		System.out.print("\nDigite seu peso: ");
		pesoDoUsuario = leitor.nextInt();
		System.out.print("\nDigite sua altura em metros (formato X,XX): ");
		alturaDoUsuario = leitor.nextDouble();
		leitor.close();
		//System.out.print(nomeDoUsuario);
		imc = pesoDoUsuario / (alturaDoUsuario * alturaDoUsuario);
		System.out.print("\n" + nomeDoUsuario + ", seu IMC �: " + imc + "!");
		
		// Determinar a classifica��o do IMC
		
		if (imc < 18.4) {
			System.out.println("Voc� est� abaixo do peso ideal.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Seu peso � considerado normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("No momento voc� est� com sobrepeso.");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("No momento voc� est� com obesidade grau I.");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("No momento voc� est� com obesidade grau II.");
		} else if (imc >= 40) {
			System.out.println("Fa�a seu testamento URGENTE!");
		}
	}
}
