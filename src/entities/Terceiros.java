package entities;

public class Terceiros extends Funcionarios {
	
	private Double additionalCharge;
	
	public Terceiros() {
		super();
	}

	public Terceiros(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + additionalCharge * 1.1;
	}

}
