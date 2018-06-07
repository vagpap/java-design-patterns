package gr.wackydevelopers.patterns.creational.factory;

public class AndroidPhone extends MobilePhone {

	private String screenSize;
	private String batterySize;
	
	public AndroidPhone(String screenSize, String batterySize) {
		this.screenSize = screenSize;
		this.batterySize = batterySize;
	}
	
	@Override
	public String getOSName() {
		return "Android";
	}

	@Override
	public String getScreenSize() {
		return this.screenSize;
	}

	@Override
	public String getBatterySize() {
		return this.batterySize;
	}
}
