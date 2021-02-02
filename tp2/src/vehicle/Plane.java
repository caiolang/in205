package vehicle;

public class Plane extends Vehicle {

	protected int maxAltitude;
	
	public Plane(String model, int numPlaces, float weight, int maxAltitude) {
		super(model, numPlaces, weight);
		this.maxAltitude = maxAltitude;
	}
	
	@Override
	public String toString() {
		String out="PLANE: ";
		out += this.model;
		out += " | ";
		out += this.numPlaces;
		out += " places | ";
		out += this.weight;
		out += " kg | ";
		out += this.maxAltitude;
		out += " m of max altitude";
		return (out);
	}

	
}
