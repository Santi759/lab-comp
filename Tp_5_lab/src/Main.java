import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner( System.in );
        //Ejercicio_1
        int a,b;
        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();

        if (a %2==0){
            System.out.println(+a+ " es par");
        }else {
            System.out.println(+a+ " es impar ");
        }
        System.out.println("-------------------------------");

        //Ejercicio_2
        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();

        if (a %10==0) {
            System.out.println(a + " es multiplo de 10");
        }else{
            System.out.println(a + " No es multiplo de 10");
        }
        System.out.println("-------------------------------");
        //Ejercicio_3
        char letra;
        System.out.println("Ingrese un cáracter: ");
        letra = (char) System.in.read();

        if (Character.isUpperCase(letra)){
            System.out.println("Cáracter ingresado es Mayúscula");
        }else{
            System.out.println("Cáracter ingresado es Minuscula");
        }
        System.out.println("-------------------------------");
        //Ejercicio_4
        System.out.println("Ingrese dos números para verificar si son iguales o no");

        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();
        System.out.println("Ingresar un número entero positivo: ");
        b= sc.nextInt();

        if (a==b){
            System.out.println(a+" y " +b+ " son iguales" );
        }else {
            System.out.println(a+ " y " +b+ " no son iguales");
        }
        System.out.println("-------------------------------");
        //Ejercicio_5
        System.out.println("Ingrese dos números para verificar si son iguales o cual es mayor");

        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();
        System.out.println("Ingresar un número entero positivo: ");
        b= sc.nextInt();

        if (a==b){
            System.out.println(a+" y " +b+ " son iguales" );
        }else if (a>b){
            System.out.println(a+" es mayor que " +b);
        } else {
            System.out.println(b+ " es mayor que " +a);
        }
        System.out.println("-------------------------------");

        //Ejercicio_6
        System.out.println("Ingrese dos números para verificar si terminan en la misma cifra");
        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();
        System.out.println("Ingresar un número entero positivo: ");
        b= sc.nextInt();

        if ( a%10  == b%10){
            System.out.println(+a+ " y " +b+ " terminan en la misma cifra");
        }else{
            System.out.println(+a+ " y " +b+ " no terminan en la misma cifra");
        }
        System.out.println("-------------------------------");

        //Ejercicio_7

        System.out.println("Ingrese dos números para verificar si son multiplos de 5 y 3 o de 5 o de 3");

        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();

        if (a %5==0 && a%3==0){
            System.out.println(+a+ " es multiplo de 5 y 3");
        } else if (a%5==0) {
            System.out.println(+a+ " es multiplo de 5 ");
        } else if (a%3==0) {
            System.out.println(+a+ " es multiplo de 3 ");
        }else {
            System.out.println(+a+ " no es multiplo de 3 ni de 5 ");
        }
        System.out.println("-------------------------------");

        //Ejercicio_8
        System.out.println("Ingrese dos números para verificar si son multiplos de 2 y 3 o de 2 o de 3");
        System.out.println("Ingresar un número entero positivo: ");
        a = sc.nextInt();

        if (a %3==0 && a%2==0){
            System.out.println(+a+ " es multiplo de 2 y 3");
        } else if (a%2==0) {
            System.out.println(+a+ " es multiplo de 2 ");
        } else if (a%3==0) {
            System.out.println(+a+ " es multiplo de 3 ");
        }else {
            System.out.println(+a+ " no es multiplo de 3 ni de 2 ");
        }
        System.out.println("-------------------------------");

        //Ejercicio_9
        System.out.println("Ingrese dos cácateres para verificar si son iguales");
        char car1, car2;
        System.out.println("Ingresar el primer cáracter: ");
        car1 = (char) System.in.read();
        System.out.println("Ingresar el primer cáracter: ");
        car2 = (char) System.in.read();

        if (car1==car2){
            System.out.println(" Los cáracteres ingresados son iguales ");
        }else {
            System.out.println(" Los cáracteres ingresados no son igual");
        }
        System.out.println("-------------------------------");

        //Ejercicio_10
        System.out.println("Ingrese dos cácateres para verificar si estan en min o may");
        System.out.println("Ingresar el primer cáracter: ");
        car1 = (char) System.in.read();
        System.out.println("Ingresar el primer cáracter: ");
        car2 = (char) System.in.read();

        if (Character.isLowerCase(car1)==Character.isLowerCase(car2) ){
            System.out.println("Los caracteres ingresados están en min");
        }else {
            System.out.println("Los caracteres ingresados están en may");
        }
        System.out.println("-------------------------------");

        //Ejercicio_11
        System.out.println("Ingrese un cáracter para saber si es un dígito o una letra");
        char car;
        System.out.println("Ingrese un carácter: ");
        car = (char) System.in.read();

        if (Character.isDigit(car)){
            System.out.println("Es un digito");
        }else {
            System.out.println("Es una letra");
        }
        System.out.println("-------------------------------");

        //Ejercicio_12
        System.out.println("Ingrese dos números para realizar una división");
        System.out.println("Ingrese un número: ");
        a = sc.nextInt();
        System.out.println("Ingrese un número: ");
        b = sc.nextInt();

        if (b==0){
            System.out.println("Math Error");
        }else {
            System.out.println(+a+"/"+b+" = "+a/b);
        }
        System.out.println("-------------------------------");

//Ejercicio_13
        int year;
        System.out.println("Ingrese un año para saber si es bisiesto: ");
        year = sc.nextInt();

        if (year %4==0 && year %100!=0 || year %400==0){
            System.out.println(+year+ " Es un año bisiesto");
        }else{
            System.out.println(+year+ " No es un año bisiesto");
        }
        System.out.println("-------------------------------");

//Ejercicio_14

        int num,dig1,dig2;
        System.out.println("Ingrese un número de tres cifras para saber si es capicúa: ");
        num = sc.nextInt();
        dig1 =(num/100)%10;
        dig2 = num%10;


        if (num<100){
            System.out.println("Debe ingresar un número de tres cifras ");
        } else if (dig1==dig2) {
            System.out.println(+num+ " es un número capicúa");
        }else {
            System.out.println(+num+ " no es un número capicúa");
        }
        System.out.println("-------------------------------");

//Ejercicio_15

        int H,M,S;
        System.out.println("Ingrese la hora (00 a 24): ");
        H = sc.nextInt();
        System.out.println("Ingrese los minutos (00 a 59): ");
        M = sc.nextInt();
        System.out.println("Ingrese los segundos (00 a 59): ");
        S = sc.nextInt();

        if (H<00 || H>24){
            System.out.println(+H+ " no es un dato válido");
        } else if (M<00 || M>59) {
            System.out.println(+M+ " no es un dato válido");
        }else if (S<00 || S>59){
            System.out.println(+S+ " no es un dato válido");
        }else {
            System.out.println(+H+":"+M+":"+S);
        }
        System.out.println("-------------------------------");

//Ejercicio_16
        int mes;
        System.out.println("Ingrese un número del 1 a 12 según el mes q desea consultar: ");
        mes = sc.nextInt();

        switch (mes){
            case 1:System.out.println("Enero---Tiene 31 días");
                break;
            case 2:System.out.println("Febrero---Tiene 28 días");
                break;
            case 3:System.out.println("Marzo---Tiene 31 días");
                break;
            case 4:System.out.println("Abril---Tiene 30 días");
                break;
            case 5:System.out.println("Mayo---Tiene 31 días");
                break;
            case 6:System.out.println("Junio---Tiene 30 días");
                break;
            case 7:System.out.println("Julio---Tiene 31 días");
                break;
            case 8:System.out.println("Agosto---Tiene 31 días");
                break;
            case 9:System.out.println("Septiembre---Tiene 30 días");
                break;
            case 10:System.out.println("Octubre---Tiene 31 días");
                break;
            case 11:System.out.println("Noviembre---Tiene 30 días");
                break;
            case 12:System.out.println("Diciembre---Tiene 31 días");
                break;
            default:System.out.println("Mes no válido");
        }
        System.out.println("-------------------------------");

//Ejercicio_17

        int calificacion;
        System.out.println("Ingrese su calificación númerica: ");
        calificacion = sc.nextInt();

        switch (calificacion){
            case 0:System.out.println("Insuficiente");
                break;
            case 1:System.out.println("Insuficiente");
                break;
            case 2:System.out.println("Insuficiente");
                break;
            case 3:System.out.println("Insuficiente");
                break;
            case 4:System.out.println("Insuficiente");
                break;
            case 5:System.out.println("Suficiente");
                break;
            case 6:System.out.println("Bien");
                break;
            case 7:System.out.println("Notable");
                break;
            case 8:System.out.println("Notable");
                break;
            case 9:System.out.println("Sobresaliente");
                break;
            case 10:System.out.println("Sobresaliente");
                break;
            default:System.out.println("Dato ingresado no válido");
        }
        System.out.println("-------------------------------");

//Ejercicio_18
        System.out.println("Contar del 0 al 100");
        int i;
        i=0;
        while (i<=100){
            System.out.println(i+"--");
            i=i+1;
        }

        System.out.println("-------------------------------");

//Ejercicio_19
        System.out.println("Contar del 0 al 100");
        int j;
        j=0;
        do{
            System.out.println(j+"--");
            j=j+1;
        }while (j<=100);
        System.out.println("-------------------------------");

//Ejercicio_20
        System.out.println("Contar del 0 al 100");
        for (i=1; i<=100; i++){
            System.out.println(i + " ");
        }
        System.out.println("-------------------------------");

//Ejercicio_21

        System.out.println("Contar del 100 al 1");
        i=100;
        while (i>=1) {
            System.out.println(i + " ");
            i = i - 1;
        }
        System.out.println("-------------------------------");

//Ejercicio_22

        System.out.println("Contar del 100 al 1");
        j=100;
        do{
            System.out.println(j+" ");
            j=j-1;
        }while (j>=1);
        System.out.println("-------------------------------");

//Ejercicio_23


        System.out.println("Contar del 100 al 1");
        for (i=100; i>=1; i--){
            System.out.println(i + " ");
        }
        System.out.println("-------------------------------");

//Ejercicio_24
        System.out.println("Contar del número 1 al núm ingresado por el usuario");
        int N;

        System.out.println("Ingrese el valor de N:");
        N = sc.nextInt();


        for (i=1; i<=N; i++){
            System.out.print(i+ " ");
        }

        System.out.println(" ");

        i=1;
        while (i<=N){
            System.out.print(i+ " ");
            i=i+1;
        }

        System.out.println(" ");

        i=1;
        do{
            System.out.print(i+" ");
            i=i+1;
        }while (i<=N);
        System.out.println("-------------------------------");

//Ejercicio_25

        System.out.println("Contar del número  ingresado por el usuario hasta 1");

        System.out.println("Ingrese el valor de N:");
        N = sc.nextInt();


        for (i=N; i>=1; i--){
            System.out.print(i+ " ");
        }

        System.out.println(" ");

        i=N;

        while (N>=1){
            System.out.print(N+ " ");
            N=N-1;
        }

        System.out.println(" ");

        do{
            System.out.print(i+" ");
            i=i-1;
        }while (i>=1);
        System.out.println(" ");
        System.out.print("-------------------------------");

//Ejercicio_26

        System.out.println("Mostrar los números entre los núm ingresados");
        int numA, numB,numMay,numMen;

        System.out.println("Introduzca el primer número: ");
        numA = sc.nextInt();
        System.out.println("Introduzca el primer número: ");
        numB = sc.nextInt();


        if (numA == numB){
            while (numA==numB){
                System.out.println("Los valores de A y B no pueden ser iguales: ");
                System.out.println("Introduzca el primer número: ");
                numA = sc.nextInt();
                System.out.println("Introduzca el primer número: ");
                numB = sc.nextInt();
            }
        }

        if (numA>numB){
            numMay=numA;
            numMen=numB;
        }else {
            numMay=numB;
            numMen=numA;
        }
        for (i=numMen; i<=numMay; i++){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        System.out.println("-------------------------------");

//Ejercicio_27

        System.out.println("Mostrar los números pares entre los num ingresados");
        System.out.println("El primer valor debe ser menor que el segundo: ");
        System.out.println("Introduzca el primer número: ");
        numA = sc.nextInt();
        System.out.println("Introduzca el primer número: ");
        numB = sc.nextInt();


        if (numA > numB){
            while (numA>numB){
                System.out.println("El valor de A debe ser mayor que B: ");
                System.out.println("Introduzca el primer número: ");
                numA = sc.nextInt();
                System.out.println("Introduzca el primer número: ");
                numB = sc.nextInt();
            }
        }


        for (i=numA; i<=numB; i++){
            if (i %2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
        System.out.println("-------------------------------");

//Ejercicio_28

        int numN, numM;
        System.out.println("mostrar multiplos de N");
        System.out.println("El primer valor debe ser menor que el segundo: ");
        System.out.println("Introduzca el primer número: ");
        numN = sc.nextInt();
        System.out.println("Introduzca el primer número: ");
        numM = sc.nextInt();


        if (numN > numM){
            while (numN>numM){
                System.out.println("El valor de N debe ser mayor que M: ");
                System.out.println("Introduzca el primer número: ");
                numN = sc.nextInt();
                System.out.println("Introduzca el primer número: ");
                numM = sc.nextInt();
            }
        }


        for (i=numN; i<=numM; i++){
            if (i %numN==0){
                System.out.print(i + " ");

            }
        }
        System.out.println(" ");
        System.out.println("-------------------------------");

//Ejercicio_29

        double millas, km;
        System.out.println("Ingrese las millas a convertir: ");
        millas= sc.nextDouble();

        while (millas!=0){
            km = millas*1.6093;
            System.out.println(millas+ " millas son "+km+" km");
            System.out.println("Quiere convertir otro valor? Si desea salir ingrese 0: ");
            millas= sc.nextDouble();
        }

    }
}