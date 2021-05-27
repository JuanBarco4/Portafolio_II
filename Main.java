package scl.edu.gt;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*MENSAJE INICIAL DEL PROGRAMA*/
		Img txtMensaje = new Img();
		txtMensaje.Mensaje();
		
		/*ESTADO DEL PROGRAMA*/
		boolean on = true;
		
		/*INICIO DEL PROGRAMA*/
		do {
			
		/*SOLICITANDO UN COMANDO*/
		Scanner inputCommand = new Scanner(System.in);
		System.out.println();
		System.out.print("~$ ");
		String output = inputCommand.nextLine();
		
		/*INSTANCIAS DE CLASES*/
		commandList dateCommand = new commandList();
		ArithmeticFunctions fa = new ArithmeticFunctions();
		Help help = new Help();
		Sistemas to = new Sistemas();
		
		
		if(output.equals(dateCommand.command[0])) {
			fa.sumar();
		}else if(output.equals(dateCommand.command[1])) {
			fa.restar();
		}else if(output.equals(dateCommand.command[2])) {
			fa.dividir();
		}else if(output.equals(dateCommand.command[3])) {
			fa.multiplicar();
		}else if(output.equals(dateCommand.command[4])) {
			fa.residuo();
		}else if(output.equals(dateCommand.command[5])) {
			help.listaComandos();
		}else if(output.equals(dateCommand.command[7])) {
			to.kernel();
		}else if(output.equals(dateCommand.command[8])) {
			to.CPU();;
		}else if(output.equals(dateCommand.command[9])) {
			to.almacenamiento();
		}else if(output.equals(dateCommand.command[10])) {
			to.procesador();
		}else if(output.equals(dateCommand.command[11])) {
			to.terminal();
		}else if(output.equals(dateCommand.command[6])) {
			on = false;
		}else {
			System.out.println("Comando no encontrado");
			System.out.println("Ingresa a help para encontrar los comandos disponibles");
		}
			
		}while(on);
		
		System.out.println("Programa finalizado");
		
	}
}
	
	
			
	
	
				
				
	
