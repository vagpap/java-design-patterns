package gr.wackydevelopers.patterns.creational.factory;

public class IPhone extends MobilePhone {

	private String screenSize;
	private String batterySize;
	
	public IPhone(String screenSize, String batterySize) {
		this.screenSize = screenSize;
		this.batterySize = batterySize;
	}
	
	@Override
	public String getOSName() {
		return "IOS";
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
