package Entities;

public class Funcionarios {
	
	private String name;
	private Integer horas;
	private Double valorHora;
	
	public Funcionarios() {
		
	}

	public Funcionarios(String name, Integer horas, Double valorHora) {
		this.name = name;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return horas  * valorHora;
	}
	
}
