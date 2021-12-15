
public abstract class Deporte {
	
	//ATRIBUTOS
	private String balon;
	private int piernas;
	
	//CONSTRUCTOR
	public Deporte(String balon, int piernas){
		this.balon=balon;
		this.piernas=piernas;
	}

	
	//SETTERS & GETTERS
	public void setBalon(String balon) {
		this.balon = balon;
	}
	public String getBalon() {
		return balon;
	}

	public void setPiernas(int piernas) {
		this.piernas = piernas;
	}
	public int getPiernas() {
		return piernas;
	}
	
	
	
}//cierra clase
