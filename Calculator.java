import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.net.URL;

public class Calculator implements PostfixCalculator{
	private String[] operandos= {"1","2","3","4","5","6","7","8","9","0"};
	private String[] operadores={"+","-","/","*"};
	@Override
	public ArrayList<String> importText() {
		Class myClass =getClass();
		ClassLoader loader=myClass.getClassLoader();
		URL myURL = loader.getResource("datos.txt");
		assert myURL != null;
		String path=myURL.getPath();
		ArrayList<String> outputArray=new ArrayList<>();
		BufferedReader br = null;
		FileReader fr = null;
		String output;


		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);


			while ((output = br.readLine()) != null) {
				outputArray.add(output);
			}
			

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		return outputArray;
		
	}

	@Override
	public boolean validateText(String line) {
		String[] sep=line.split(" ");
		String itemType;
		boolean isStatementValid=true;
		int contador=0;
		//revisar que solamente se utilicen simbolos permitidos
		for (String s : sep) {
			itemType = "none";
			//revisar si es un operando
			for (String operando : operandos) {
				if (s.equals(operando)) {
					itemType = "operando";
					contador++;
					break;
				}
			}
			//revisar si es un operador
			if (!itemType.equals("operando")) {
				for (String operador : operadores) {
					if (s.equals(operador)) {
						itemType = "operador";
						contador--;
						break;
					}
				}
			}
			//si no es ninguno de los dos se invalida
			if (itemType.equals("none")) {
				isStatementValid = false;
				break;
			}
		}
		//revisar que contenga la cantidad correcta de operadores
		if (contador!=1) isStatementValid=false;
		return isStatementValid;
	}
	@Override
	public int calculate(String line,Pila<Integer> pila) {
		String[] sep=line.split(" ");
		int a;
		int b;
		int c;
		for (String s : sep) {
			switch (s) {
				case "+":
					a = pila.pop();
					b = pila.pop();
					c = a + b;
					pila.push(c);
					break;
				case "-":
					a = pila.pop();
					b = pila.pop();
					c = b - a;
					pila.push(c);
					break;
				case "*":
					a = pila.pop();
					b = pila.pop();
					c = a * b;
					pila.push(c);
					break;
				case "/":
					a = pila.pop();
					b = pila.pop();
					c = b / a;
					pila.push(c);
					break;
				default:
					pila.push(Integer.parseInt(s));
					break;
			}
		}
		return pila.pop();
	}

	
	
}

