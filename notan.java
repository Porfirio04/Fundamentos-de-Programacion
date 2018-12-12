import java.util.*;
import java.io.*;
public class notan{
public static void main(String[]args){
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Introduzca una nota entre 6 y 10: ");
num = sc.nextInt();
switch(num){
case 6:
System.out.println("seis");
break;
case 7:
System.out.println("siete");
break;
case 8:
System.out.println("ocho");
break;
case 9:
System.out.println("nueve");
break;
case 10:
System.out.println("diez");
break;
}}}
