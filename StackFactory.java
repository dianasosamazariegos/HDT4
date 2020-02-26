import java.util.Scanner;

public class StackFactory<E> {
    public Pila<E> getStack(String tipo){
        if(tipo.equals("arraylist")){
            return new arraylistStack<E>();
        } else if(tipo.equals("vector")){
            return new vectorStack<E>();
        }else{
            Scanner input=new Scanner(System.in);
            System.out.println("Desea utilizar listas (s)imples, (d)obles o (c)irculares?\nIngrese su respuesta: ");
            String t=input.nextLine();
            String type;
            if(t=="s") type="simple";
            else if(t=="d") type="doble";
            else type="circular";
            return new listaStack<E>(type);
        }
    }
}
