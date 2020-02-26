import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		StackFactory<Integer> sFactory=new StackFactory<>();
		Scanner input=new Scanner(System.in);
		System.out.println("Desea utilizar un stack con (a)rrayList, (v)ector o (l)ista?\nIngrese su decision: ");
		String t=input.nextLine();
		String tipo;
		if(t.equals("a")) tipo="arraylist";
		else if(t.equals("v")) tipo="vector";
		else tipo="lista";
		Pila<Integer> pila=sFactory.getStack(tipo);
		int resultado;
		String linea= c.importText().get(0);
		if (c.validateText(linea)){
			resultado = c.calculate(linea,pila);
			System.out.println("El resultado para:\""+linea+"\" es:"+resultado);
		}else System.out.println("La expresion ingresada no es valida.");
	}
}
