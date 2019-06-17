package metier;

public enum ECivilite {
	mr("Monsieur"), mme("Madame"), na("Non-binaire");

	private String libele;

	private ECivilite(String libele) {
		this.libele = libele;
	}

	public String getLibele() {
		return libele;
	}
	
	public String toString(){
		return this.libele;
	}

}
