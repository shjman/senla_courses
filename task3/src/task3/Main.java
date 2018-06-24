package task3;

public class Main {
	public static void main(String[] args) {
		LineStepBuildSpring lineStepBuildSpring = new LineStepBuildSpring();
		LineStepBuildRod lineStepBuildRod = new LineStepBuildRod();
		LineStepBuildBody lineStepBuildBody = new LineStepBuildBody();

		AssemblyLine iAssemblyLineImpl = new AssemblyLine(lineStepBuildSpring, lineStepBuildRod, lineStepBuildBody);
		Pen pen = new Pen();
		Pen finishedPen = (Pen) iAssemblyLineImpl.assembleProduct(pen);
	}
}
