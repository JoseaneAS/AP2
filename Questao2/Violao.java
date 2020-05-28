package Questao2;

public class Violao extends Instrumento {
	 
	public Violao(int id) {
		
		setId(id);
		
	}

	@Override
	public void tocar() {
		
		System.out.println("Do-Re-Mi");
	}
	
	
}
