import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Ejercicio_4
        MayoryMenor listNum = new MayoryMenor();

        for (int i=0;i<20;i++){
            System.out.println("Ingrese el número de la posición: "+i);
            int num = sc.nextInt();
            listNum.agregarNum(num);
        }
        listNum.mostrarLista();
        System.out.println("El número mayor es: "+listNum.numMay());
        System.out.println("El número menor es: "+listNum.numMen());
        System.out.println("La distancia entre el mayor y el menor es: "+listNum.distancia());

        //Ejercicio_5
        listRandom list2 = new listRandom();
        Random random = new Random();
        for (int i=0;i<20;i++){
            int num = 2*random.nextInt(50)+2;
            list2.llenarLista(num);
        }
        list2.mostrarLista();
        System.out.println("Promedio Aritmetico: "+list2.promedioAritmetico());
        System.out.println("Cantidad de números mayor al promedio: "+list2.mayorPromedio());
        System.out.println("Cantidad de números menor al promedio: "+list2.menorPromedio());
        System.out.println("Cantidad de números igual al promedio: "+list2.igualPromedio());

    }
}
