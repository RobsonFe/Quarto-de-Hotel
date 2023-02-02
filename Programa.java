package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluguel[] vect = new Aluguel[10];
		// Fazendo o vetor dessa forma, é colocado 10 espaços na memoria em um vetor com objeto.
		
		System.out.println("Quantos quartos serao alugados ? ");
		int n = leia.nextInt();
		
		for(int i= 0; i<n; i++) {
			System.out.println();
			System.out.println(" Aluguel #"+ i + ":");
			System.out.println("Nome: ");
			leia.nextLine();
			String nome = leia.nextLine();
			System.out.println("Email: ");
			String email = leia.nextLine();
			System.out.println("Quarto: ");
			int numeroQuarto = leia.nextInt();
			
			
			vect[numeroQuarto] = new Aluguel(nome, email);
			//instanciando o objeto e atribuindo a referencia dele para o vetor na posição numeroQuarto.
		}
	System.out.println("\tQuartos Ocupados\n");
		for (int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			
			System.out.println(i + ": " + vect[i]);
			
			}
			// Quando eu coloco esse codigo "!= null" eu quero imprimir na tela apenas os espaços que tem dados no vetor.
		}	

		leia.close();
	}

}
