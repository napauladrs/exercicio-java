package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;
import entities.Terceiros;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Qual a quantidade de funcionários? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + ", dados: ");
			System.out.print("Terceirizado? (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHours = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Taxa adicional: ");
				double additionalCharge = sc.nextDouble();
				Funcionarios fun = new Terceiros(name, hours, valuePerHours, additionalCharge);
				list.add(fun);
			} 
			else {
				Funcionarios fun = new Funcionarios(name, hours, valuePerHours);
				list.add(fun);
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionarios fun : list) {
			System.out.println(fun.getName() + " - $ " + String.format("%.2f", fun.pagamento()));
		}
		
		sc.close();
	}

}
