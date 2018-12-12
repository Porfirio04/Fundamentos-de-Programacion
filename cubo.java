import java.util.*;
public class cubo{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int num, cubo;
System.out.println("Introduzca un numero: ");
num=sc.nextInt();
while(num>0){
cubo=num*num*num;
System.out.println(num + " es igual a "+ cubo);
num= sc.nextInt();
}
}
}
