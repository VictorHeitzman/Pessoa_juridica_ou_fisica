package entities;

public class Individual extends TaxPayer {
	
	private double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, double anuallncome, double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		 if(getAnuallncome() < 20000) {
			 basicTax = (getAnuallncome() * 15 / 100 ) - healthExpenditures * 50 /100;
		}else{
			basicTax = (getAnuallncome() *25 /100) - healthExpenditures * 50 /100;
		} return basicTax;
	}
}
