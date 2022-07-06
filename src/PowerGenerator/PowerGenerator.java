package PowerGenerator;
import java.lang.Math;

public class PowerGenerator {
	
	private double base=0;
	private int exp=0;
	
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double nextPow() {
		double result=Math.pow(base, exp);
		exp=exp+1;
		return result;
	}
	
	
	
	

}
