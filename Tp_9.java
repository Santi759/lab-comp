import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio_1
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            listaEnteros.add(i);
        }

        //Ejercicio_2
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Santiago Andrez");
        listaNombres.add("Pepon Soler");
        listaNombres.add("DOn Satir");

        System.out.println(listaNombres);

        //Ejercicio_3
        System.out.println(listaEnteros);

        //Ejercicio_4
        ArrayList<Character> listaCaracter = new ArrayList<>();
        listaCaracter.add('A');
        listaCaracter.add('B');
        listaCaracter.add('C');
        listaCaracter.add('D');
        listaCaracter.add('E');
        listaCaracter.add('%');
        listaCaracter.add('&');
        System.out.println(listaCaracter.size());

        //Ejercicio_5
        listaNombres.remove(2);
        System.out.println(listaNombres);

        //Ejercicio_6
        ArrayList<Integer> listaEnteros1 = new ArrayList<>();
        ArrayList<Integer> listaEnteros2 = new ArrayList<>();

        listaEnteros1.add(3);

        if (listaEnteros1.isEmpty()) {
            System.out.println("La lista 1 esta vacia");
        }
        if (listaEnteros2.isEmpty()) {
            System.out.println("La lista 2 esta vacia");
        }

        //Ejercicio_7
        int mayor = 0;
        listaEnteros1.add(10);
        listaEnteros1.add(25);
        listaEnteros1.add(-3);
        listaEnteros1.add(6);

        for (int i = 0; i < listaEnteros1.size(); i++) {
            if (listaEnteros1.get(i) > mayor) {
                mayor = listaEnteros1.get(i);
            }
        }
        System.out.println("El número mayor de la lista es: " + mayor);

        //Ejercicio_8
        Random random = new Random();
        ArrayList<Integer> listaEnt = new ArrayList<>();
        ArrayList<Integer> listaEnterosCopia = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaEnt.add(random.nextInt(100));
        }
        listaEnterosCopia.addAll(listaEnt);
        // Tambien se puede usar {ArrayList<Integer> listaEnterosCopia = new ArrayList<>(listaEnt);} al crear la lista
        System.out.println("Lista original: " + listaEnt);
        System.out.println("Copia lista original: " + listaEnterosCopia);

        //Ejercicio_9

        Random random1 = new Random();
        ArrayList<Integer> listaEnt2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaEnteros.add(random.nextInt(100));
        }
        System.out.println(listaEnteros);
        Collections.reverse(listaEnteros);
        System.out.println(listaEnteros);

        //Ejercicio_10
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(40);
        list1.add(62);
        list1.add(26);
        list1.add(15);

        list2.add(12);
        list2.add(36);
        list2.add(55);
        list2.add(35);

        System.out.println("Lista 1 Original: " + list1);

        System.out.println("Lista 2 Original: " + list2);

        list1.addAll(list2);
        System.out.println("Lista Combinada: " + list1);

        //Ejercicio_11

        ArrayList<Integer> copylist = new ArrayList<>(list1);

        for (int i = 0; i < copylist.size(); i++) {
            if (copylist.get(i) % 2 == 0) {
                list1.remove(copylist.get(i));
            }
        }
        System.out.println("Lista sin numeros pares: " + list1);

        //Ejercicio_12

        ArrayList<Integer> listSearch = new ArrayList<>();

        int n, ind = 0;

        listSearch.add(1);
        listSearch.add(10);
        listSearch.add(20);
        listSearch.add(30);
        listSearch.add(100);

        System.out.println("Lista: " + listSearch);
        System.out.println("Ingrese el número del que desea saber el indice: ");
        n = sc.nextInt();

        for (int i = 0; i < listSearch.size(); i++) {
            if (listSearch.get(i) == n) {
                ind = i;
                break;
            }
        }
        System.out.println("El número " + n + " se encuentra en la posición " + ind);

        //Ejercicio_13

        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        int coinc = 0;

        listA.add(1);
        listA.add(2);
        listA.add(3);

        listB.add(1);
        listB.add(2);
        listB.add(3);

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (i == j) {
                    if (listA.get(i) == listB.get(j)) {
                        coinc += 1;
                    }
                }
            }
        }
        if (listA.size() != listB.size()) {
            System.out.println(listA + " y " + listB + " no son iguales");
        } else if (coinc == listA.size()) {
            System.out.println(listA + " y " + listB + " son iguales");
        } else {
            System.out.println(listA + " y " + listB + " no son iguales");
        }

        //Ejercicio_14
        ArrayList<Integer> listMin = new ArrayList<>();
        listMin.add(5);
        listMin.add(2);
        listMin.add(3);
        listMin.add(10);
        int min = listMin.get(0);

        for (int i = 1; i < listMin.size(); i++) {
            if (listMin.get(i) < min) {
                min = listMin.get(i);
            }
        }
        System.out.println("El elemnto menor de " + listMin + " es " + min);

        //Ejercicio_15

        int sum = 0;
        for (int i = 0; i < listMin.size(); i++) {
            sum += listMin.get(i);
        }
        System.out.println("La suma de " + listMin + " es " + sum);

        //Ejercicio_16

        ArrayList<String> listCad = new ArrayList<>();
        listCad.add("Hola");
        listCad.add(" ");
        listCad.add("Como");
        listCad.add(" ");
        listCad.add("Estas");
        listCad.add("?");

        StringBuilder builder = new StringBuilder();

        for (String cadena : listCad) {
            builder.append(cadena);
        }
        String resultado = builder.toString();
        System.out.println(resultado);

        //Ejercicio_17
        List<Integer> listDup = new ArrayList<>();

        listDup.add(5);
        listDup.add(2);
        listDup.add(2);
        listDup.add(5);
        listDup.add(1);

        Set<Integer> conjunto = new HashSet<>(listDup);
        List<Integer> listaSinDuplicados = new ArrayList<>(conjunto);
        System.out.println("Lista original: " + listDup);
        System.out.println("Lista sin duplicados: " + listaSinDuplicados);

        //Ejercicio_18
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(12);
        lista.add(25);
        lista.add(32);
        lista.add(45);
        lista.add(52);

        int sumaPares = 0;

        for (int i = 0; i < lista.size(); i += 2) {
            sumaPares += lista.get(i);
        }

        System.out.println("Suma de elementos en índices pares: " + sumaPares);

        //Ejercicio_19

        System.out.println("Que numero desea consultar si se encuentra en la lista?: ");
        n= sc.nextInt();
        boolean e=false;

        for (int i=0;i<lista.size();i++){
            if (lista.get(i)==n){
                e = true;
                break;
            }
        }
        if (e){
            System.out.println(n+" Se encuentra en la lista");
        }else {
            System.out.println(n+" No se encuentra en la lista");
        }

        //Ejercicio_20
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("manzana");
        listaCadenas.add("plátano");
        listaCadenas.add("fresa");
        listaCadenas.add("sandía");

        String cadenaMasLarga = "";

        for (String cadena : listaCadenas) {
            if (cadena.length() > cadenaMasLarga.length()) {
                cadenaMasLarga = cadena;
            }
        }

        System.out.println("La cadena más larga en la lista es: " + cadenaMasLarga);

        //Ejercicio_21

        ArrayList<Double> listProm = new ArrayList<>();
        listProm.add(5.0);
        listProm.add(10.0);
        listProm.add(7.0);
        listProm.add(9.0);
        double suma=0;

        for (int i=0;i<listProm.size();i++){
             suma +=listProm.get(i);
        }

        System.out.println("El promedio de "+listProm+ " es " +suma/listProm.size());

        //Ejercicio_22
        Collections.sort(copylist);

        System.out.println("Lista ordenada en forma ascendente: "+copylist);

        //Ejercicio_23

        System.out.println("Ingrese un número que se encuentre en la lista anterior");
        n= sc.nextInt();

        ArrayList<Integer> newList = new ArrayList<>(copylist);

        System.out.println("Valor Ingresado: "+n);

        System.out.println("Lista Original: "+copylist);

        for (int i=0;i<newList.size();i++){
            if (newList.get(i)>n){
                copylist.remove(newList.get(i));
            }
        }

        System.out.println("Lista nueva: "+copylist);
        //Ejercicio_24
        ArrayList<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("manzana");
        listaDeCadenas.add("pera");
        listaDeCadenas.add("manzana");
        listaDeCadenas.add("plátano");
        listaDeCadenas.add("manzana");

        String elementoBuscado = "manzana";
        int cantidadDeVeces = 0;

        for (String cadena : listaDeCadenas) {
            if (cadena.equals(elementoBuscado)) {
                cantidadDeVeces++;
            }
        }

        System.out.println("El elemento '" + elementoBuscado + "' aparece " + cantidadDeVeces + " veces en la lista.");

        //Ejercicio_25

        ArrayList<String> listaCadenas1 = new ArrayList<>();
        listaCadenas1.add("zorro");
        listaCadenas1.add("abeja");
        listaCadenas1.add("messi");
        listaCadenas1.add("futbol");
        listaCadenas1.add("casa");

        System.out.println("Lista Desordenada: "+listaCadenas1);

        Collections.sort(listaCadenas1);

        System.out.println("Lista ordenada en forma Ascendente: "+listaCadenas1);

            }
        }
