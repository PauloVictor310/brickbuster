package model.vo;

public class UsuarioVO {
	private String login;
	private String senha;
	private String nome;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		if(login == null) {
			
		}
		else {
			if(login.equals("")) {
				
			}
			else {
				this.login = login;
			}
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
