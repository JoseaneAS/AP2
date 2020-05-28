package Questao1;

public class Chave {
	
	private int idChave;
	private int senha;
	
	public int getIdChave() {
		return idChave;
	}
	
	public void setIdChave(int idChave){
		this.idChave = idChave;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
public void Abrir() {
		System.out.println("Acesso Autorizado");
	}

}

