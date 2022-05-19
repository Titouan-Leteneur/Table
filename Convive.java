
enum civilite {M, MME};

public class Convive implements Comparable<Convive> {

	private String nom;
	private String prenom;
	private civilite civil;
	
	public Convive(civilite civil, String nom, String prenom) throws IllegalArgumentException {
		if(nom == null || prenom == null) {
			throw new IllegalArgumentException("Le nom et le prenom ne peuvent pas être nuls");
		}
		this.civil=civil;
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	@Override
	public String toString() {
		return "("+this.civil+") "+this.prenom+" "+this.nom;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(o instanceof Convive) {
			Convive c = (Convive)o;
			return this.toString().equals(c.toString());
		}
		return false;
	}
	
	public int hashcode() {
		return this.toString().hashCode();
	}

	@Override
	public int compareTo(Convive c) {
		return this.getNom().compareTo(c.getNom());
	}
	
}
