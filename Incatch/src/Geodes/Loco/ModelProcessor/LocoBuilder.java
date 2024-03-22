package Geodes.Loco.ModelProcessor;

public class LocoBuilder {

	public static ILocoBuilder getBuilder(LocoName locoName) {
		switch (locoName) {
		case OutSystems:
			return new OutSystemsTraceModelBuilder();
			
		case Loco:
			return new LocoDataSetTraceModelBuilder();
			
		case ReLiS:
			return new RelisTraceModelBuilder();

		case Mendix:
		case PowerApps:
		default:
			throw new UnsupportedOperationException("Builder not found...!");
		}
	}

	public enum LocoName {
		OutSystems, Mendix, PowerApps, Loco, ReLiS
	}

	LocoBuilder() {
	}
}
