package Car;

public class Car {
	
	private double litri;
	private double resa;
	
	public Car(double kmL) {
		this.litri = 0;
		this.resa =kmL;
	}
	
	public double drive(double kilometri) {
		return litri=litri-(kilometri/resa);
	}
	
	public double getlitri() {
		return litri;
	}
	
	public double addGas(double rifornimeto) {
		return litri=(litri+rifornimeto);
	}
	

}
