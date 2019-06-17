package metier;

@Entity

public class DVD extends Article{
	
	private boolean bonus;
	
	public DVD(){
	}

	public DVD(boolean bonus) {
		super();
		this.bonus = bonus;
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "DVD [bonus=" + bonus + "]";
	}
	
	

}
