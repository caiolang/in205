package vehicle;

public class Car extends Vehicle implements Motorized {

	private int numDoors;
	private Propulsion propulsion;
	private float power;
	
	public Car(String model, int numPlaces, float weight, int numDoors) {
		super(model, numPlaces, weight);
		this.numDoors = numDoors;
		this.propulsion = Propulsion.OIL; // Standard
		this.power = 1500; // Standard
	}
	
	public Car(String model, int numPlaces, float weight, int numDoors, Propulsion prop, float power) {
		this(model, numPlaces, weight, numDoors);
		this.propulsion = prop;
		this.power = power;
	}
	
	@Override
	public String toString() {
		String out="CAR: ";
		out += this.model;
		out += " | ";
		out += this.numPlaces;
		out += " places | ";
		out += this.weight;
		out += " kg | ";
		out += this.numDoors;
		out += " doors | Propulsion: ";
		out += this.propulsion;
		out += " | Power: ";
		out += this.power;
		out += " | Consumption: ";
		out += this.getConsumption();
		return (out);
	}

	@Override
	public float getConsumption() {
		float cons=0;
		
		if(this.propulsion==Propulsion.OIL) {
			cons=(power*5)/weight;
		} else if (this.propulsion==Propulsion.DIESEL) {
			cons=(power*3)/weight;
		}
		return cons;
	}

	
}
