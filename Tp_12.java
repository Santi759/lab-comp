import java.util.ArrayList;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("correo@example.com");
        datos.add("123-456-7890");
        datos.add("01-234-567");
        datos.add("A1B2C3D4E5");

        String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+";
        String phoneRegex = "\\d{3}-\\d{3}-\\d{4}";
        String dniRegex = "\\d{2}-\\d{3}-\\d{3}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);
        Pattern dniPattern = Pattern.compile(dniRegex);

        for (String dato : datos) {
            if (emailPattern.matcher(dato).matches()) {
                System.out.println(dato + " es una dirección de correo válida.");
            } else if (phonePattern.matcher(dato).matches()) {
                System.out.println(dato + " es un número de teléfono válido.");
            } else if (dniPattern.matcher(dato).matches()) {
                System.out.println(dato + " es un DNI válido.");
            } else {
                System.out.println(dato + " no coincide con ningún patrón conocido.");
            }
        }
        
        String cadena = "Santiago";
        boolean noTerminaConDigito = !cadena.matches(".*\\d$");
        if (noTerminaConDigito) {
            System.out.println(cadena + " no termina con un digito");
        } else {
            System.out.println(cadena + "  termina con un digito");

        }


        boolean noEmpiezaConDigito = !cadena.matches("^\\d.*");

        if (noEmpiezaConDigito) {
            System.out.println(cadena + " empieza con un digito");
        } else {
            System.out.println(cadena + "  no empieza con un digito");
        }

        boolean tieneEntre5y10Letras = cadena.matches("[a-zA-Z]{5,10}");

        if (tieneEntre5y10Letras) {
            System.out.println(cadena + "Esta formado por un minimo de 5 letras y un maximo de 10 letras");
        } else {
            System.out.println(cadena + "No esta formado por un minimo de 5 letras y un maximo de 10 letras");
        }

        String dni = "12345678";
        boolean esDNIValido = dni.matches("[0-9]{7,8}");

        if (esDNIValido) {
            System.out.println(dni + " Es válido");
        } else {
            System.out.println(dni + " No es válido");
        }

        ArrayList<String> listaCorreos = new ArrayList<>();
        listaCorreos.add("santiago@gmail.com");
        listaCorreos.add("holamundo@gmail.com");
        listaCorreos.add("messigmail.com");

        ArrayList<String> correosValidos = new ArrayList<>();


        for (String correo : listaCorreos) {
            if (correo.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+")) {
                correosValidos.add(correo);
            }
        }
        System.out.println(" lista de correos: ");
        System.out.println(listaCorreos);
        System.out.println(" lista de correos válidos: ");
        System.out.println(correosValidos);

        boolean contieneABC = cadena.contains("abc");

        if (contieneABC) {
            System.out.println(cadena + " Contiene abc ");
        } else {
            System.out.println(cadena + " No contiene abc ");
        }
    }
}
