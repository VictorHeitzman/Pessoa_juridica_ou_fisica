package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company() {

	}

	public Company(String name, double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnuallncome() * 14 / 100;  	
		} else {
			return getAnuallncome() * 16 / 100;
		}
	}

}
