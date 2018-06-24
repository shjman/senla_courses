package task3;

public class AssemblyLine implements IAssemblyLine {
	ILineStep iLineStepFirst;
	ILineStep iLineStepSecond;
	ILineStep iLineStepThird;

	public AssemblyLine(ILineStep lineStepBuildSpring, ILineStep lineStepBuildRod, ILineStep lineStepBuildBody) {
		System.out.println("created assemblyLine for assembly Pen");

		iLineStepFirst = lineStepBuildSpring;
		iLineStepSecond = lineStepBuildRod;
		iLineStepThird = lineStepBuildBody;
	}

	@Override
	public IProduct assembleProduct(IProduct iProduct) {
		iProduct.installFirstPart(iLineStepFirst.buildProductPart());
		iProduct.installSecondPart(iLineStepSecond.buildProductPart());
		iProduct.installThirdPart(iLineStepThird.buildProductPart());

		return iProduct;
	}
}
