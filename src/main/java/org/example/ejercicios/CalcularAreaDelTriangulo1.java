package org.example.ejercicios;

import java.util.List;

public class CalcularAreaDelTriangulo1 {

	record Triangulo(String Color,
					 double Base,
					 double Altura) {

	}

	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo("rojo", 5.0, 4.0);
		Triangulo triangulo1 = new Triangulo("verde", 6.0, 6.0);
		double valorAreaTriangulo = calculoAreaDelTriangulo(triangulo);
		double valorAreaTriangulo1 = calculoAreaDelTriangulo(triangulo1);
		mostrarResultados(triangulo.Color(),triangulo.Altura(),triangulo.Base(),valorAreaTriangulo);
		mostrarResultados(triangulo1.Color(),triangulo1.Altura(),triangulo1.Base(),valorAreaTriangulo1);

	}

	public static double calculoAreaDelTriangulo(Triangulo triangulo) {

		Double area = triangulo.Base * triangulo.Altura / 2;
		return area;
	}
	public static void mostrarResultados (String color, double base, double altura,double area){
		System.out.println("Color del triángulo: " + color);
		System.out.println("Altura del triángulo: " + altura);
		System.out.println("Base del triángulo: " + base);
		System.out.println("Área del triángulo: " + area );
		System.out.println("---------------------------------------------------------------\n");

	}
}


