package org.example.ejercicios;

import java.util.List;

public class Facturacion1 {
	record Factura(String cliente,
				   String fechaDeLaFactura,
				   List<Double> precioTotalDeFacturacion) {
	}

	public static void main(String[] args) {
		Factura factura1 = new Factura("Maria Sanabria", "Julio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));

		double totalValorFact1 = calcularTotal(factura1);
		double totalValorFact2 = calcularTotal(factura2);

		mostrarFactura("Factura 1", factura1.cliente(), totalValorFact1);
		mostrarFactura("Factura 2", factura2.cliente(), totalValorFact2);
	}

	private static double calcularTotal(Factura factura) {
		List<Double> precios = factura.precioTotalDeFacturacion();
		double total = 0;
		for (Double precio : precios) {
			total += precio;
		}
		return total;
	}


	private static void mostrarFactura(String titulo, String cliente, double total) {
		System.out.println(titulo);
		System.out.println("Cliente: " + cliente);
		System.out.println("Total: " + total);
		System.out.println();
	}
}