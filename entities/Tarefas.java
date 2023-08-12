package entities;

public class Tarefas {
	private String titulo;
	private String descricao;
	private String data;
	private boolean concluida;
	
	public Tarefas(String titulo, String descricao, String data) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
		this.concluida = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getData() {
		return data;
	}

	public boolean isConcluida() {
		return concluida;
	}

	
	public void marcarConcluida() {
		concluida = true;
	}
	
}