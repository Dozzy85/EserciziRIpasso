package Rettangolo;

public class Rettangolo {
	
	private int base;
	private int altezza;
	private int ascissa;
	private int ordinata;
	private int perimetro;
	private int area;
	
	public Rettangolo() {
		base=1;
		altezza=1;
		ascissa=0;
		ordinata=0;
	}

	public Rettangolo(int base, int altezza, int ascissa, int ordinata) {
		super();
		this.base = base;
		this.altezza = altezza;
		this.ascissa = ascissa;
		this.ordinata = ordinata;
	}
	
	

	public int getPerimetro() {
		return (base + altezza)*2;
	}

	public int getArea() {
		return (base*altezza);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getAscissa() {
		return ascissa;
	}

	public void setAscissa(int ascissa) {
		this.ascissa = ascissa;
	}

	public int getOrdinata() {
		return ordinata;
	}

	public void setOrdinata(int ordinata) {
		this.ordinata = ordinata;
	}
	
	
	

}
