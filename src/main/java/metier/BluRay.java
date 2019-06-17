package metier;

@Entity

public class BluRay extends Article {
	
	private boolean troisD;
	
	public BluRay(){
	}

	public BluRay(boolean troisD) {
		super();
		this.troisD = troisD;
	}

	public boolean isTroisD() {
		return troisD;
	}

	public void setTroisS(boolean troisD) {
		this.troisD = troisD;
	}

	@Override
	public String toString() {
		return "BluRay [troisD=" + troisD + "]";
	}
	
	
	
	

}
