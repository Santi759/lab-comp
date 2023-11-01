import java.util.Scanner;
import java.util.Arrays;

public class SumaMatrices {
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] matrizTranspuesa(int[][] matriz1) {
        int rows = matriz1.length;
        int columns = matriz1[0].length;

        int[][] matrizTranspuesta = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrizTranspuesta[j][i] = matriz1[i][j];
            }
        }
        return matrizTranspuesta;
    }

    public static boolean esSimetrica(int[][] matriz1) {
        int rows = matriz1.length;
        int columns = matriz1[0].length;

        if (rows != columns) {
            return false;
        }
        int[][] transpuesta = matrizTranspuesa(matriz1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matriz1[i][j] != transpuesta[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatriz(int[][] matriz1) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static int[] productoEscalar(int[] vector, int numero) {
        int[] resultado = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * numero;
        }
        return resultado;
    }

    public static int[][] sumarMatriz(int[][] sumaMatriz) {
        int filas = sumaMatriz.length;
        int columnas = sumaMatriz[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = sumaMatriz[i][j] + sumaMatriz[i][j];
            }
        }
        return resultado;
    }

    public static int[] mayorMatriz(int[][] maxMatriz) {
        int maximo = maxMatriz[0][0];
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < maxMatriz.length; i++) {
            for (int j = 0; j < maxMatriz[i].length; j++) {
                if (maxMatriz[i][j] > maximo) {
                    maximo = maxMatriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        int[] posicion = {fila, columna};
        return posicion;
    }
    public static int sumaDeFilas(int[][] sumarFilas, int opc){
        int suma=0;
        for (int columna=0;columna<sumarFilas[opc].length;columna++){
            suma += sumarFilas[opc][columna];
        }
        return suma;
    }
    public static boolean EsDiagonal(int [][] diagonal){
        for (int i=0;i<diagonal.length;i++){
            for (int j=0;j< diagonal.length;j++){
                if (i!=j && diagonal[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] generarMatrizIdentidad(int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        return matriz;
    }
    public static int[] contarParesImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

        }
        int[] conteo = {pares, impares};
        return conteo;
    }
    public static int[][] rotarMatriz90Grados(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizRotada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }

    public static void imprimirMatriz(int[][] matrizInv) {
        for (int i = 0; i < matrizInv.length; i++) {
            for (int j = 0; j < matrizInv[i].length; j++) {
                System.out.print(matrizInv[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int contarValorEnMatriz(int[][] matrizConteo, int valor) {
        int conteo = 0;

        for (int i = 0; i < matrizConteo.length; i++) {
            for (int j = 0; j < matrizConteo[i].length; j++) {
                if (matrizConteo[i][j] == valor) {
                    conteo++;
                }
            }
        }
        return conteo;
    }
    public static int sumarDiagonales(int[][] matrizDiagonales) {
        int n = matrizDiagonales.length;
        int suma = 0;


        for (int i = 0; i < n; i++) {
            suma += matrizDiagonales[i][i];
        }


        for (int i = 0; i < n; i++) {
            suma += matrizDiagonales[i][n - 1 - i];
        }

        return suma;
    }

    public static int[][] invertirFilas(int[][] matrizInver) {
        int filas = matrizInver.length;
        int columnas = matrizInver[0].length;
        int[][] matrizInvertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[i][j] = matrizInver[filas - 1 - i][j];
            }
        }
        return matrizInvertida;
    }
    public static void impriMatriz(int[][] matrizInver) {
        for (int i = 0; i < matrizInver.length; i++) {
            for (int j = 0; j < matrizInver[i].length; j++) {
                System.out.print(matrizInver[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean esMatrizOrtogonal(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }
        double[][] matrizTranspuesta = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        double[][] matrizInversa = new double[filas][columnas];
        return Arrays.deepEquals(matrizTranspuesta, matrizInversa);
    }

    public static int[] encontrarMinimosPorFila(int[][] matriz) {
        int filas = matriz.length;
        int[] minimos = new int[filas];

        for (int i = 0; i < filas; i++) {
            int minimo = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] < minimo) {
                    minimo = matriz[i][j];
                }
            }
            minimos[i] = minimo;
        }

        return minimos;
    }
    public static int[][] multMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            return null;
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    public static void imprMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio_1

        System.out.println("Suma de matrices");
        int[][] matriz1 = {{1, 2, 3}, {3, 2, 1}, {5, 4, 6}};
        int[][] matriz2 = {{9, 8, 7}, {1, 3, 4}, {3, 4, 1}};
        int[][] resultado = sumarMatrices(matriz1, matriz2);
        mostrarMatriz(resultado);

        //Ejercicio_2
        System.out.println("Matriz multiplicada");

        int[][] resultadoMult = multiplicarMatrices(matriz1,matriz2);
        mostrarMatriz(resultadoMult);

        //Ejercicio_3
        int[][] transpuesta = matrizTranspuesa(matriz1);
        System.out.println("Matriz Original: ");
        printMatriz(matriz1);
        System.out.println("Matriz Transpuesta: ");
        printMatriz(transpuesta);

        //Ejercicio_4
        boolean esMatrizSimetrica=esSimetrica(matriz1);
        if (esMatrizSimetrica){
            System.out.println("La matriz es simétrica.");
        }else {
            System.out.println("La matriz no es simétrica.");
        }
        //Ejercicio_5
        int[] vector={1,2,3,4,5};
        int numero=2;
        int []producto=productoEscalar(vector,numero);
        System.out.println("Producto del vecto: ");
        for (int i=0; i<producto.length;i++){
            System.out.print(producto[i]+" ");
        }
        System.out.println("");
        //Ejercicio_6
        int[][] sumaMatriz ={{1,2,3},{50,20,30},{12,22,32}};
        int [][] resultadoSuma = sumarMatriz(sumaMatriz);
        System.out.println("Matriz original: ");
        printMatriz(sumaMatriz);
        System.out.println("Suma de la matriz: ");
        printMatriz(resultadoSuma);

        //Ejercicio_7

        int [][] maxMatriz = {{1,5,6},{7,10,8},{-6,-50,25}};
        int[] posicion = mayorMatriz(maxMatriz);
        int fila = posicion[0];
        int columna = posicion[1];
        int elementoMaximo = maxMatriz[fila][columna];

        System.out.println("Elemento máximo: " + elementoMaximo);
        System.out.println("Posición: Fila " + fila + ", Columna " + columna);

        //Ejercicio_8

        int[][] sumarFilas = {{5,8,9},{1,2,3},{10,20,30}};
        int opc;

        System.out.println("Ingrese la fila que desea sumar: ");
        opc = sc.nextInt();

        int suma = sumaDeFilas(sumarFilas,opc);

        System.out.println("La suma de la fila" +opc+ " es "+suma);

        //Ejercicio_9
        int [][] diagonal ={{1,0,0},{0,2,0},{0,0,3}};
        boolean esDiagonal = EsDiagonal(diagonal);
        for (int i=0;i< diagonal.length;i++){
            for (int j=0;j< diagonal.length;j++){
                System.out.print(diagonal[i][j]+" ");
            }
            System.out.println();
        }
        if (esDiagonal){
            System.out.println("La matriz es Diagonal");
        }else {
            System.out.println("La matriz no es Diagonal");
        }

        //Ejercicio_10
        int n = 3;

        int[][] matrizIdentidad = generarMatrizIdentidad(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidad[i][j] + " ");
            }
            System.out.println();
        }

        //Ejercicio_11
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        int[] conteo = contarParesImpares(matriz);

        int pares = conteo[0];
        int impares = conteo[1];

        System.out.println("Cantidad de elementos pares: " + pares);
        System.out.println("Cantidad de elementos impares: " + impares);

        //Ejercicio_12
        int[][] matrizInv = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matrizInv);

        int[][] matrizRotada = rotarMatriz90Grados(matrizInv);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        imprimirMatriz(matrizRotada);

        //Ejercicio_13

        int[][] matrizConteo = {
                {1, 2, 3, 1},
                {4, 5, 1, 6},
                {1, 7, 8, 9}
        };

        int valorBuscado = 1; // Cambia este valor al número que deseas contar
        int count = contarValorEnMatriz(matrizConteo, valorBuscado);

        System.out.println("El valor " + valorBuscado + " aparece " + count + " veces en la matriz.");

        //Ejercicio_14
        int[][] matrizInver = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matrizInver);

        int[][] matrizInvertida = invertirFilas(matrizInver);

        System.out.println("Matriz con filas invertidas:");
        impriMatriz(matrizInvertida);

        //Ejercicio_15
        int[][] matrizDiagonal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = sumarDiagonales(matrizDiagonal);

        System.out.println("La suma de todas las diagonales es: " + sum);

        //Ejercicio_16

        double[][] matrizOrto = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean esOrtogonal = esMatrizOrtogonal(matrizOrto);

        if (esOrtogonal) {
            System.out.println("La matriz es ortogonal.");
        } else {
            System.out.println("La matriz no es ortogonal.");
        }

        //Ejercicio_17
        int[][] matrizValorMin = {
                {5, 2, 8, 1},
                {4, 9, 2, 7},
                {6, 3, 1, 5}
        };

        int[] minimosPorFila = encontrarMinimosPorFila(matrizValorMin);

        System.out.println("Valores mínimos por fila:");
        for (int i = 0; i < minimosPorFila.length; i++) {
            System.out.println("Fila " + i + ": " + minimosPorFila[i]);
        }

        //Ejercicio_18
        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] resul = multMatrices(matrizA, matrizB);

        if (resul == null) {
            System.out.println("No es posible multiplicar las matrices debido a tamaños incorrectos.");
        } else {
            System.out.println("Resultado de la multiplicación:");
            imprMatriz(resultado);
        }
    }

    }
