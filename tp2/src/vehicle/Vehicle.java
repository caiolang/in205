package vehicle;

public abstract class Vehicle {

	protected String model;
	protected int numPlaces;
	protected float weight;
	protected static int nbVehicles;

	public Vehicle(String model, int numberPlaces, float weight) {
		this.model=model;
		this.numPlaces=numberPlaces;
		this.weight=weight;
		this.nbVehicles ++;
	}
	
	@Override
	public String toString() {
		String out="VEHICLE: ";
		out += model;
		out += " | ";
		out += numPlaces;
		out += " places | ";
		out += weight;
		out += " kg";
		return (out);
	}
	
	public static int getNbVehicles() {
		return nbVehicles;
	}
	
	/* Getter and Setters */
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String newModel) {
		this.model = newModel;
	}
	
	public int getNumPlaces() {
		return this.numPlaces;
	}
	
	public void setNumberPlaces(int newNumber) {
		this.numPlaces = newNumber;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setModel(float newWeight) {
		this.weight = newWeight;
	}
	
	
	
}
