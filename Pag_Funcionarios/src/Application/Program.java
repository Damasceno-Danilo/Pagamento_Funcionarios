package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.FuncTerceiros;
import Entities.Funcionarios;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();

		System.out.println("Entre com a quantidade de funcionarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Funcionarios # " + i + " data: ");
			System.out.print("Funcionario é terceirizado (y/n) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int horas = sc.nextInt();
			System.out.print("valor por hora: ");
			double valorHora = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Despesa Adicional: ");
				double despAdicional = sc.nextDouble();
				list.add(new FuncTerceiros(name, horas, valorHora, despAdicional));
			}
			else {
				
				list.add(new Funcionarios(name, horas, valorHora));
			}

		}
			System.out.println();
			System.out.println("Pagamentos: ");
			for (Funcionarios func : list) {
				System.out.println(func.getName() + "- $ " + String.format("%.2f", func.pagamento()));
		}

		sc.close();

	}
}
