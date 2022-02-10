package com.generation;

public class Triangulo extends FiguraGeometrica{

	public Triangulo() {
		super("Triangulo");
		
	}
	
	//override Pra indica polimorfismo
	@Override
	public float calcularArea() {
		return (getAlto()*getLargo())/2;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
}
