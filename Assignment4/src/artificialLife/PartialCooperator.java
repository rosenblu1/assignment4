package artificialLife;
import java.util.Random;

public class PartialCooperator extends Organism {

	public PartialCooperator() {}

	@Override
	public String getType() {
		return "PartialCooperator";
	}
	@Override
	public Organism reproduce() {
		return new PartialCooperator();
	}
	@Override
	public double getCooperationProbability() {
		return 0.5;
	}
	@Override 
	public boolean cooperates() {
		Random randnum = new Random();
		return randnum.nextBoolean();
	}

}
