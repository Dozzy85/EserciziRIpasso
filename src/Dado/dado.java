package Dado;
import java.util.*;
import java.lang.Math;

public class dado {
	
	private int numeroFacce=6;
	private Random gen=new Random();
	
	public int lancia() {
		int result = gen.nextInt(numeroFacce) + 1 ;
		return result;		
	}	
	
	public int lancia2() {
		return ((int) (Math.random()*numeroFacce)+1);		
	}	

}
