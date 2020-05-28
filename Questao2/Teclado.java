package Questao2;

public class Teclado extends Instrumento {
	 
	 
		public Teclado(int id) {
			
			setId(id);
			
		}

		@Override
		public void tocar() {
			
			System.out.println("Fa-Sol-La");
		}
		
}
