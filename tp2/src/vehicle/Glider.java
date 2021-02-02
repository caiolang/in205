package vehicle;

public class Glider extends Plane {

	private float lift;
	
	public Glider (String model, int numPlaces, float weight, int maxAltitude) {
		super(model, numPlaces, weight, maxAltitude);
		this.lift = 100; // Standard
	}
	
	public Glider (String model, int numPlaces, float weight, int maxAltitude, float lift) {
		this(model, numPlaces, weight, maxAltitude);
		this.lift = lift;
	}
	
	
	@Override
	public String toString() {
		String out="GLIDER: ";
		out += this.model;
		out += " | ";
		out += this.numPlaces;
		out += " places | ";
		out += this.weight;
		out += " kg | ";
		out += this.maxAltitude;
		out += " m of max altitude | Lift: ";
		out += this.lift;
		return (out);
	}
}
