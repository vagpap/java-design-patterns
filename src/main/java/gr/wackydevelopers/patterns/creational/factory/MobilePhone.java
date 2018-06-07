package gr.wackydevelopers.patterns.creational.factory;

public abstract class MobilePhone {

	public abstract String getOSName();
	public abstract String getScreenSize();
	public abstract String getBatterySize();

	@Override
	public String toString() {
		return "OSName: " + getOSName() + ", ScreenSize: "  + getScreenSize() + ", BatterySize: " + getBatterySize();
	}
	
}
