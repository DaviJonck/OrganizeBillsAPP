package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Contas;
import entities.GerenciadorDeContas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Contas> bills = new ArrayList<>();
		
		System.out.println("Bem vindo ao APP para Salvar contas do Mes");
		
		while(true) {
		System.out.println("Escolha uma opcao:");
		System.out.println("1 - Adicionar conta");
		System.out.println("2 - Ver todas as contas");
		System.out.println("0 - Sair");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("Nome da conta: ");
			String accountName = sc.next();
			


			
			System.out.println("Valor da conta: ");
			double accountValue = sc.nextDouble();
			
			System.out.println("Quantas vezes: ");
			int accountProducts = sc.nextInt();
			
			double totalAccount = accountValue * accountProducts;
			
			System.out.println("Data da compra (AAAA-MM-DD):");
			String dueDateStr = sc.next();
			LocalDate dueDate = LocalDate.parse(dueDateStr);
			
			Contas bill = new Contas(accountName,totalAccount,dueDate);
			GerenciadorDeContas.saveBillsToFile(String.valueOf(accountName), String.valueOf(totalAccount));	
			
			System.out.println("A sua conta foi adidionada ao sistema");
			break;
			
		case 2:
			
			if(bills.isEmpty()){
				System.out.println("Não há contas registradas.");
			}else {
				System.out.println("Contas registradas: ");
				for(Contas b : bills) {
					System.out.println(b.getAccountName() +"  - R$ " + b.getTotalAccount() + "Data da compra: " + b.getDueDate());
				}
			}
			break;
		case 0:
			System.out.println("Saindo do App. Ate Logo!");
			System.exit(0);
			sc.close();	
			default:
				System.out.println("Opção invalida tente novamente!");
				
		}
		
			
		}
	}
}	
