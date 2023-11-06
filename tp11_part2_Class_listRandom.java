import java.util.ArrayList;
public class listRandom {
    private ArrayList<Integer> listaNums;

    public listRandom() {
        listaNums = new ArrayList<>();
    }

    public void llenarLista(int num) {
        listaNums.add(num);
    }

    public void mostrarLista() {
        for (int i = 0; i < listaNums.size(); i++) {
            System.out.print(listaNums.get(i) + "--");
        }
        System.out.println(" ");
    }

    public double promedioAritmetico() {
        int suma = 0;
        for (int i = 0; i < listaNums.size(); i++) {
            suma += listaNums.get(i);
        }
        return suma / listaNums.size();
    }

    public int mayorPromedio() {
        int contadorMayor = 0;
        for (int i = 0; i < listaNums.size(); i++) {
            if (listaNums.get(i) > promedioAritmetico()) {
                contadorMayor += 1;
            }
        }
        return contadorMayor;
    }

    public int menorPromedio() {
        int contadormenor = 0;
        for (int i = 0; i < listaNums.size(); i++) {
            if (listaNums.get(i) < promedioAritmetico()) {
                contadormenor += 1;
            }
        }
        return contadormenor;
    }

    public int igualPromedio() {
        int contadorigual = 0;
        for (int i = 0; i < listaNums.size(); i++) {
            if (listaNums.get(i) == promedioAritmetico()) {
                contadorigual += 1;
            }
        }
        return contadorigual;
    }
}
