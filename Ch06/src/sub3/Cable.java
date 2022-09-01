package sub3;

public class Cable implements Socket{

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchoff() {
		bulb.lightOff();
	}
	
}
