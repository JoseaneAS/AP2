package Questao2;

public abstract class Instrumento {
	private int id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void tocar();
	
}
