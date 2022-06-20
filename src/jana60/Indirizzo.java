package jana60;

public class Indirizzo {

	// attributi
	private String via;
	private String numero;
	private String citta;

	// costruttori
	public Indirizzo(String via, String numero, String citta) {
		super();
		this.via = via;
		this.numero = numero;
		this.citta = citta;
	}

	// metodi getter e setter
	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

}
