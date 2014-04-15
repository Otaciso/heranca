package Heranca;

public class Quadrado implements AreaCalculavel{

	double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}

	public double calculaArea() {		
		return lado * lado;
	}

	
	public double caculaArea() {
		
		return 0;
	}

}
