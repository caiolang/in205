package vehicle;

public class JetFighter extends Plane implements Motorized {

	private float power;
	
	public JetFighter (String model, int numPlaces, float weight, int maxAltitude, float power) {
		super(model, numPlaces, weight, maxAltitude);
		this.power = power;
	}
	
	@Override
	public float getConsumption() {
		return power/weight;
	}
	
	@Override
	public String toString() {
		String out="JET: ";
		out += this.model;
		out += " | ";
		out += this.numPlaces;
		out += " places | ";
		out += this.weight;
		out += " kg | ";
		out += this.maxAltitude;
		out += " m of max altitude | Power: ";
		out += this.power;
		out += " | Consumption: ";
		out += this.getConsumption();
		return (out);
	}

}
