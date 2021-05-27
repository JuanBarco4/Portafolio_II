package scl.edu.gt;

public class commandList {

	String command [] = new String [12];
	String information [] = new String [12];
	
	int cantidadDeComados;
	
	commandList() {
		
		command[0] = "suma";
		command[1] = "resta";
		command[2] = "division";
		command[3] = "multiplicacion";
		command[4] = "residuo";
		command[5] = "help";
		command[6] = "exit";
		command[7] = "kernel";
		command[8] = "CPU";
		command[9] = "almacenamiento";
		command[10] = "procesador";
		command[11] = "terminal";
		
		
		information[0] = " El comando puede realizar la suma de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[1] = " El comando puede realizar la resta de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[2] = " El comando puede realizar la división de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[3] = " El comando puede realizar la multiplicación de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[4] = " El comando puede realizar el residuo de dos \n números ya sean enteros o decimaeles, el valor \n a  retornar es un double.";
		information[5] = " El comando puede mostrar todos los comandos \n disponibles en el programa.";
		information[6] = " El comando puede finalizar el programa.";
		information[7] = " Es la parte central de un sistema operativo \n y es el que se encarga de realizar toda la \n comunicación segura entre el software y el \n hardware del ordenador.";
		information[8] = " Es la unidad central de procesamiento del \n hardware dentro de una computadora u otros \n dispositivos programables.";
		information[9] = " Es el componente de una computadora que \n permite almacenar y acceder a datos a largo plazo. \n Entre estos estan:  \n RAM: \n \n Es la memoria de acceso aleatorio que se utiliza como \n memoria de trabajo de computadoras y otros \n dispositivos para el sistema operativo. \n HDD: \n \n Sirve para almacenar de forma permanente los datos. \n SSD \n \n Sirve para alamcenar datos con la diferencia de que \n es más veloz que un HDD.";
		information[10] = " Es el cerebro del ordenador. Este se \n encarga de la ejecución de los programas.";
		information[11] = " Es un dispositivo electronico que se \n  utiliza para interactuar con un computador.";
	}
	
		
}
