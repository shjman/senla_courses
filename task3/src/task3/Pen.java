package task3;

public class Pen implements IProduct,IProductPart {

	@Override
	public void installFirstPart(IProductPart spring) {
		System.out.println("installed first part - spring");
	}

	@Override
	public void installSecondPart(IProductPart rod) {
		System.out.println("installed second part - rod");

	}

	@Override
	public void installThirdPart(IProductPart body) {
		System.out.println("installed third part - body");

	}

}
