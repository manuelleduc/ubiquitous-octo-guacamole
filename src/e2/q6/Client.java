package e2.q6;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private Banque banque;
	
	private List<Compte> comptes = new ArrayList<Compte>();

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}
	
	private String adresse;
	private String nom;
	private String numeroClient;
	
	
}
