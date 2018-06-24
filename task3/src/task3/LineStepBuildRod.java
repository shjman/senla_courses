package task3;

public class LineStepBuildRod implements ILineStep {
	LineStepBuildRod() {
		System.out.println("created LineStep for Build rod");
	}

	@Override
	public IProductPart buildProductPart() {
		return new Rod();
	}

}
