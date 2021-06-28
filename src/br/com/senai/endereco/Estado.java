package br.com.senai.endereco;

public class Estado extends Pais {

	private String nomeDoEstado;
	private String siglaDoEstado;
	public String getNomeDoEstado() {
		return nomeDoEstado;
	}
	public void setNomeDoEstado(String nomeDoEstado) {
		this.nomeDoEstado = nomeDoEstado;
	}
	public String getSiglaDoEstado() {
		return siglaDoEstado;
	}
	public void setSiglaDoEstado(String siglaDoEstado) {
		this.siglaDoEstado = siglaDoEstado;
	}
}
