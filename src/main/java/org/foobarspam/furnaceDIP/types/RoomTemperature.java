package org.foobarspam.furnaceDIP.types;

public class RoomTemperature {
	private static Double temperature = null;
	private static RoomTemperature instance = null;

	private RoomTemperature(){

	}

	public static RoomTemperature getInstance() {
	    if (instance == null) {
	        instance = new RoomTemperature();
        }
        return instance;
    }

	public static double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {

		this.temperature = temperature;
	}

	public void incrementTemperature(double increment){

		this.temperature += increment;
	}

}
