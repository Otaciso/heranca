package Heranca;

public class Cubo implements VolumeCalculavel, AreaCalculavel{
	
	double lado;
	public Cubo(double lado){
		this.lado = lado;
	}
	
	public double calculaVolume() {
		return 6*lado*lado;
	}

	
	public double calculaArea() {		
		return lado*lado*lado;
	}

	
	public double caculaArea() { 
		return 0;
	}	

}
