package entities;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import application.Program;

public class GerenciadorDeContas extends Program{
	public static void saveBillsToFile(String accountName, String totalAccount) {
		
	
		Scanner sc = new Scanner(System.in);
		
		String sourceFileStr = "D:\\contas.txt";
		
	
		try(FileWriter writer = new FileWriter(sourceFileStr, true)){
			writer.append(accountName);
			writer.append(" , ");
			writer.append(totalAccount);
			writer.append(System.lineSeparator());
			System.out.println("CONTA SALVA");
			
		} catch(IOException e) {
			System.out.println("Erro salvando a conta ");
			
			sourceFileStr = sc.nextLine();
			
		}
	}
	}
