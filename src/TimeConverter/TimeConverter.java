package TimeConverter;

public class TimeConverter {
	
	public static final int GIORNOSEC=86400;
	public static final int ORESEC=3600;
	public static final int MINUTISEC=60;
	
	private int s, m, h, d;

	public TimeConverter(int s, int m, int h, int d) {
		this.s = s;
		this.m = m;
		this.h = h;
		this.d = d;
	}
	
	public int getSecTot() {
		int sTot=d*GIORNOSEC+h*ORESEC+m*MINUTISEC+s;
		return sTot;
	}
	
	

}
