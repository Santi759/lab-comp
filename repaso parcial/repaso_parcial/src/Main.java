
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner( System.in );
        //Ejercicio_A
        int num,num2,cif1,cif2;

        System.out.println("Ingrese un número de dos cifras: ");
        num = sc.nextInt();
        System.out.println("Ingrese un número de dos cifras: ");
        num2 = sc.nextInt();

        cif1 = num%10;
        cif2 = num2%10;
        
        if(cif1==cif2){
            System.out.println(num+ " y " +num2+ " Terminan con la misma cifra "+cif1+" "+cif2);
        }else{
            System.out.println(num+ " y " +num2+" No Terminan con la misma cifra "+cif1+" "+cif2);
        }
//Ejercicio_B

        System.out.println("Ingrese un número de tres cifras: ");
        num = sc.nextInt();

        cif1 = num/100;
        cif2 = num%10;

        if(cif1==cif2){
            System.out.println(num+ " Es capicúa ");
        }else{
            System.out.println(num+ " No es capicúa ");
        }
    }
}