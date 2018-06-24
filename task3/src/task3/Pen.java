package task3;

public class Pen implements IProduct, IProductPart {

	@Override
	public void installFirstPart(IProductPart spring) {
		System.out.println("installed first part in pen - spring");
	}

	@Override
	public void installSecondPart(IProductPart rod) {
		System.out.println("installed second part in pen- rod");

	}

	@Override
	public void installThirdPart(IProductPart body) {
		System.out.println("installed third part in pen- body");

	}

}
