package gr.wackydevelopers.patterns.creational.factory;

public class MobilePhoneFactory {

	public static MobilePhone getMobilePhone(String type, String screenSize, String batterySize) {
		if ("Android".equalsIgnoreCase(type)) {
			return new AndroidPhone(screenSize, batterySize);
		} else if ("IOS".equalsIgnoreCase(type)) {
			return new IPhone(screenSize, batterySize);
		}
		return null;
	}
	
}
