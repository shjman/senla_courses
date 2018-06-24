package task3;

public class LineStepBuildBody implements ILineStep {
	LineStepBuildBody() {
		System.out.println("created LineStep for Build Body");
	}

	@Override
	public IProductPart buildProductPart() {
		return new Body();
	}
}
