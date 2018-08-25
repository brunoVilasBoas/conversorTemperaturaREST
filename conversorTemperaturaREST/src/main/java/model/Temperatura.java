package model;

public class Temperatura {
	
	private double celsius;
	private double fahrenheit;
	
	public Temperatura(double celsius, double fahrenheit) {
		super();
		this.celsius = celsius;
		this.fahrenheit = fahrenheit;
	}
	
	public Temperatura() {
		
	}

	public double getCelsius() {
		return celsius;
	}
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getFahrenheit() {
		return fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
	
}
