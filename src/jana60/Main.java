package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// apro lo scanner
		Scanner scan = new Scanner(System.in);

		// chiedo all'utente di inserire i suoi dati
		System.out.println("Prego inserisci i tuoi dati");
		System.out.print("Nome: ");
		String inputNome = scan.nextLine();
		System.out.print("Cognome: ");
		String inputCognome = scan.nextLine();
		System.out.print("Via: ");
		String inputVia = scan.nextLine();
		System.out.print("Numero: ");
		String inputNumero = scan.nextLine();
		System.out.print("Citta: ");
		String inputCitta = scan.nextLine();

		Indirizzo indirizzo1 = new Indirizzo(inputVia, inputNumero, inputCitta);

		Persona utente1 = new Persona(inputNome, inputCognome, indirizzo1);

		utente1.presentazione();

		// chiudo lo scanner
		scan.close();

	}

}
