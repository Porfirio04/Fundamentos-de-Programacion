import java.util.Scanner;
public class solicitarxnumeros{
public static void main(String[] args){
Scanner n= new Scanner(System.in);
int num, suma, numintro;//numintro es la cantidad de numeros ingresados
float promedio;
System.out.print("Introduzca un numero: ");
num= n.nextInt();
suma= 0;
numintro= 0;
while(num>=0) 
{
suma+=num;
numintro++;
System.out.print("Introduzca otro numero: ");
num= n.nextInt();}
if (numintro>0) {
promedio= (float)suma/numintro;
System.out.println("El promedio es de: " + promedio);
}
}
}