import java.util.HashMap;
import java.util.Map;

public class Table {
	
	private int nbPlaces;
	private int nbPersonnesATable;
	private Convive [] tab;
	private Map<Convive,Integer> map = new HashMap<Convive,Integer>();

	public Table(int nbPlaces) throws IllegalArgumentException {
		if(nbPlaces < 1) {
			throw new IllegalArgumentException("Le nombre de places ne peut pas être nul ou négatif");
		}
		this.nbPlaces=nbPlaces;
		tab = new Convive[this.nbPlaces];
		this.nbPersonnesATable = 0;
	}
	
	public int nombreDeConvivesATable() {
		return this.nbPersonnesATable;
	}
	
	public void mettreATable(Convive c, int numPlace) throws IllegalArgumentException {
		if(numPlace > nbPlaces || numPlace < 1) {
			throw new IllegalArgumentException("Numéro de place invalide");
		}
		if(tab[numPlace-1] != null) {
			throw new IllegalArgumentException("Place déjà prise");
		}
		this.tab[numPlace] = c;
		this.map.put(c, numPlace);
		this.nbPersonnesATable++;
	}
	
	public int positionATable(Convive c) throws IllegalArgumentException {
		if(!map.containsKey(c)) {
			throw new IllegalArgumentException("Le convive n'est pas sur la table");
		}
		return this.map.get(c);
	}
	
	public String planDeTable() {
		String plan = "";
		for(int i = 0 ; i < this.nbPlaces-1 ; i++) {
			plan += (i+1)+" : "+tab[i];
		}
		return plan;
	}
	
	public String listeAlphaDesConvives() {
		Convive [] liste = new Convive[this.nombreDeConvivesATable()];
		String listeAlpha = "";
		//Trier la liste
		return listeAlpha;
	}
	
}
