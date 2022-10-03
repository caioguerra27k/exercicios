package exercicios;

public class Programador extends Pessoa {

	private String computador;
	private String headset;
	private String teclado;
	
	public String getComputador() {
		return computador;
	}
	public void setComputador(String computador) {
		this.computador = computador;
	}
	public String getHeadset() {
		return headset;
	}
	public void setHeadset(String headset) {
		this.headset = headset;
	}
	public String getTeclado() {
		return teclado;
	}
	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}
	
	@Override
	public String toString() {
		return "nome: " + this.nome + " dia: " + this.dia + ", mes:" + this.mes +
				", ano " + this.ano +"altura:" + this.altura + ",idade: " + idade +
				 "programador [computador=" + computador + ", headset=" + headset + ", teclado=" + teclado + "]";
   }
}