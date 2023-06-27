class RBI {
	protected float rateOfInterest = 6.7f;
}

class SBI extends RBI {
	public void roi() {
		System.out.println("SBi's roi: " + (rateOfInterest+2));
	}
}

class ICICI extends RBI {
	public void roi() {
		System.out.println("ICICI's roi: " + (rateOfInterest+3));
	}
}

class AXIS extends RBI {
	public void roi() {
		System.out.println("AXIS's roi: " + (rateOfInterest+4));
	}
}

class Hierarchical {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		AXIS axis = new AXIS();
		
		sbi.roi();
		icici.roi();
		axis.roi();
	}
}