package jana60;

public class Persona {

	// attributi
	private String nome;
	private String cognome;
	private Indirizzo indirizzo;

	// costruttori
	public Persona(String nome, String cognome, Indirizzo indirizzo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = new Indirizzo(indirizzo.getVia(), indirizzo.getNumero(), indirizzo.getCitta());
	}

	// metodi
	public void presentazione() {
		System.out.println("L'utente si chiama " + nome + " " + cognome + " e abita in via " + indirizzo.getVia() + " "
				+ indirizzo.getNumero() + " a " + indirizzo.getCitta());
	}

}
