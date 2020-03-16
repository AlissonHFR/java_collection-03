package br.com.collection;

public abstract class Animal {

	public void som() {
		System.out.println("Este é o som padrão do animal: zzzzz ");
	}
	
	public void dizerMeuNome() {
		System.out.println("O nome do animal é: xxxx");
	}
	
	private void dizerMinhaIdade() {
		System.out.println("Minha idade é: xxx");
	}
	
	private String cor = "preto";
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	private int idade = 5;
	private String nome = "não definido";
}
