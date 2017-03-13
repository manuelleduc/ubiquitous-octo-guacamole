package e2.q6;

import java.util.ArrayList;
import java.util.List;

public class Banque {

	private ConvertisseurDollar convertisseur;

	private final List<Client> clients = new ArrayList<Client>();
	private List<Compte> comptes = new ArrayList<Compte>();

	public void consultation(String numCompte) {

	}

	public float conversionFromEuro(float montant) {
		return this.convertisseur.fromEuro(montant);
	}

	public float conversionToEuro(float montant) {
		return this.convertisseur.toEuro(montant);
	}

	public void depot(String numCompte, float montant) {

	}

	public void ouvertureCompte(String comClient) {

	}

	public void retrait(String numCompte, float montant) {

	}

	public ConvertisseurDollar getConvertisseur() {
		return convertisseur;
	}

	public void setConvertisseur(ConvertisseurDollar convertisseur) {
		this.convertisseur = convertisseur;
	}
}
