
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio_1
        ArrayList <String> marcasAutos = new ArrayList<>();

        while (true){
            System.out.println("Ingrese una marca de auto: ");
            String marca = sc.nextLine();
            marcasAutos.add(marca);
            System.out.println("Desea ingresar otra marca? (s/n): ");
            String opc = sc.nextLine();
            if (opc.equalsIgnoreCase("n")){
                break;
            }
        }
        System.out.println("Marcas ingresadas: "+marcasAutos);

        //Ejercicio_2

        equipoFutbol equipo = new equipoFutbol();
        while (true){
            System.out.println("Que desea realizar?");
            System.out.println("1. Ingresar jugador ");
            System.out.println("2. Eliminar jugador ");
            System.out.println("3. Listar lista de jugadores ");
            System.out.println("4. Salir");
            String opc;
            opc = sc.nextLine();
            if (opc.equalsIgnoreCase("1")){
                System.out.println("Ingrese nombre del jugador: ");
                String jugador = sc.nextLine();
                equipo.agregarJugador(jugador);
            } else if (opc.equalsIgnoreCase("2")) {
                System.out.println("Ingrese nombre del jugador que no estara más en el equipo: ");
                String jugador = sc.nextLine();
                equipo.eliminarJugador(jugador);
            } else if (opc.equalsIgnoreCase("3")) {
                equipo.listarPlantilla();
            } else if (opc.equalsIgnoreCase("4")) {
                break;
            }else {
                System.out.println("Opción incorrecta: ");
            }
        }

        //Ejercicio_3
        Factura factura = new Factura(1, new Date(), "Lionel Messi");
        factura.agregarArticulo("Pelota", 50.0, 2);
        factura.agregarArticulo("Balon D´or", 30.0, 3);

        factura.calcularSubtotal();
        factura.calcularIVA(0.21);
        factura.calcularTotal();

        factura.imprimirFactura();

        }
    }
