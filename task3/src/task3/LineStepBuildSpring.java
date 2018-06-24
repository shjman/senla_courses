package task3;

public class LineStepBuildSpring implements ILineStep {
	LineStepBuildSpring() {
		System.out.println("created LineStep for Build spring");
	}

	@Override
	public IProductPart buildProductPart() {
		return new Spring();
	}
}
