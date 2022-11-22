package Entities;

public class FuncTerceiros extends Funcionarios {
	
	private Double despAdicional;

	public FuncTerceiros() {
		super();
	}

	public FuncTerceiros(String name, Integer horas, Double valorHora, Double despAdicional) {
		super(name, horas, valorHora);
		this.despAdicional = despAdicional;
	}

	public Double getDespAdicional() {
		return despAdicional;
	}

	public void setDespAdicional(Double despAdicional) {
		this.despAdicional = despAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despAdicional * 1.1;
	
	}

}
