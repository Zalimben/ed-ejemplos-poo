
package edatos.ejemplosPOO.Personales.usoInterfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Adaptación de la clase de ejemplo POO publicada por el Prof. Claudio Barua en
 * el aula virtual de Est. de Datos, FP-UNA
 * 
 * @author dezeta
 * @author szalimben
 */
public class TestEmpleados {

	public TestEmpleados() {
		prueba1();
		prueba2();
		prueba3();
	}

	public static void main(String[] args) {
		new TestEmpleados();
	}

	private void prueba1() {
		Empleado[] emps = new Empleado[3];

		emps[0] = new Jefe(1234567, "Juan", "Vera", (byte) 30, 3000000);
		emps[1] = new Vendedor(456456, "Luisa", "Cantero", (byte) 32, 1500000, 50000000, 2.75f);
		emps[2] = new EmpleadoHora(412312, "Carlos", "Aquino", (byte) 22, 30000, 159);
		for (Empleado e : emps) { // for each
			System.out.println(e.toString());
			System.out.println("Salario: " + e.calcularSalario());
		}
	}

	private void prueba2() {
		Empleado e = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese 1. Jefe 2. Vendedor 3. EmpHora->");
		int opc = 0;
		try {
			opc = sc.nextInt();
		} catch (InputMismatchException er) {
			System.out.println("Solo numero 1, 2 ó 3");
			System.exit(0);
		}
		switch (opc) {
		case 1:
			Jefe j = new Jefe(99999, "Carlos", "Acosta", (byte) 24, 3000000);
			e = j;
			break;
		case 2:
			e = new Vendedor(555555, "Angel", "No tal angel", (byte) 34, 1500000, 50000000, 3);
			break;
		case 3:
			e = new EmpleadoHora(444444, "Luisa", "Vera", (byte) 30, 18000, 192);
			break;
		default:
			System.out.println("Solo numero 1, 2 ó 3");
		}
		if (e != null) {
			System.out.println(e.toString());
			System.out.println("Salario: " + e.calcularSalario());

		}
	}

	private void prueba3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese 1. Jefe 2. Vendedor 3. EmpHora->");
		int opc = 0;
		try {
			opc = sc.nextInt();
		} catch (InputMismatchException er) {
			System.out.println("Solo numero 1, 2 ó 3");
			System.exit(0);
		}
		switch (opc) {
		case 1:
			Jefe j = new Jefe(99999, "Carlos", "Acosta", (byte) 24, 3000000);
			procesar(j);
			break;
		case 2:
			Vendedor v = new Vendedor(555555, "Angel", "No tal angel", (byte) 34, 1500000, 50000000, 3);
			procesar(v);
			break;
		case 3:
			EmpleadoHora e = new EmpleadoHora(444444, "Luisa", "Vera", (byte) 30, 18000, 192);
			procesar(e);
			break;
		default:
			System.out.println("Solo numero 1, 2 ó 3");
		}
	}

	private void procesar(Empleado e) {
		if (e != null) {
			System.out.println(e.toString());
			System.out.println("Salario: " + e.calcularSalario());
			if (e instanceof Vendedor) {
				Vendedor v = (Vendedor) e;
				System.out.println(v.getComision());
			}

		} else {
			System.out.println("opcion no valida");
		}
	}

}
