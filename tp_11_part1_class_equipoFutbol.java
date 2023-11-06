import java.util.ArrayList;
public class equipoFutbol {
    private ArrayList <String> jugadores;


    public equipoFutbol() {
        jugadores = new ArrayList<>();
    }
    public void agregarJugador(String jugador) {
        jugadores.add(jugador);
        System.out.println(jugador+" ha sido incorporado al equipo ");
    }

    public void eliminarJugador(String jugador) {
        if (jugadores.contains(jugador)) {
            jugadores.remove(jugador);
            System.out.println(jugador+" ha sido eliminado del equipo ");
        }else {
            System.out.println(jugador+" no pertenece al equipo ");
        }
    }

    public void listarPlantilla(){
        if (jugadores.isEmpty()){
            System.out.println("El equipo no contiene jugadores");
        }else {
            System.out.println("Plantilla del equipo:");
            for (String jugador : jugadores) {
                System.out.println(jugador);
            }
        }
    }

}
