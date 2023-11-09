import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("2634522513: " + ValidarTel("2634522513"));
        System.out.println("1234567: " + ValidarTel("1234567"));
        System.out.println("12345678AS: " + ValidarTel("12345678AS"));
        System.out.println("2634: " + ValidarTel("2634"));

        System.out.println("Ingrese un CUIT");
        String CUIT = sc.nextLine();

        if (ValidarCUIT(CUIT)) {
            System.out.println(CUIT + " Valido");
        } else {
            System.out.println(CUIT + " Invalido");
        }


        System.out.println("Ingrese un email");
        String email = sc.nextLine();

        if (ValidarEmail(email)) {
            System.out.println(email + " Valido");
        } else {
            System.out.println(email + " Invalido");
        }
        System.out.println("Ingrese una nomencalatura de 22 caractéres");
        String nomenclatura = sc.nextLine();

        if (ValidarNomenclatura(nomenclatura)) {
            System.out.println(nomenclatura + " nomenclatura Valida");
        } else {
            System.out.println(nomenclatura + " nomenclatura Invalida");
        }

        System.out.println("Ingrese un nombre");
        String nombre = sc.nextLine();

        if (ValidarNombre(nombre)) {
            System.out.println(nombre + " nombre Valido");
        } else {
            System.out.println(nomenclatura + " nombre Invalido");
        }



        System.out.println("Ingrese un numero de telefono: ");
        String tel = sc.nextLine();

        System.out.println("Ingrese un CUIT");
         CUIT = sc.nextLine();

        System.out.println("Ingrese un email");
         email = sc.nextLine();

        if (ValidarTel(tel)) {
            System.out.println(tel + " telefono Valido");
        }else {
            System.out.println(tel + " telefono invalido");
        }

        if (ValidarCUIT(CUIT)) {
            System.out.println(CUIT + " CUIT Valido");
            }else {
            System.out.println(CUIT + " CUIT invalido");
        }
        if (ValidarEmail(email)){
            System.out.println(email + " email Valido");
            }else {
            System.out.println(email + " email invalido");
        }


        System.out.println("Ingrese una lista de correos electrónicos separados por comas:");
        String input = sc.nextLine();
        String[] correos = input.split(",");
        for (String correo : correos) {
            String trimmedCorreo = correo.trim();
            if (validarEmail(trimmedCorreo)) {
                System.out.println(trimmedCorreo + " es un correo electrónico válido.");
            } else {
                System.out.println(trimmedCorreo + " es un correo electrónico inválido.");
            }
        }
        System.out.println("Ingrese un número de teléfono internacional:");
        String telefono = sc.nextLine();

        if (validarTelefonoInternacional(telefono)) {
            System.out.println("Número de teléfono internacional válido.");
        } else {
            System.out.println("Número de teléfono internacional inválido.");
        }
        System.out.println("Ingrese una dirección de correo electrónico:");
        email = sc.nextLine();
        String dominioPermitido = "miempresa.com"; // Cambia esto al dominio deseado

        if (validarCorreoPersonalizado(email, dominioPermitido)) {
            System.out.println("Correo electrónico válido.");
        } else {
            System.out.println("Correo electrónico inválido o no pertenece al dominio permitido.");
        }
        System.out.println("Ingrese su código postal:");
        String codigoPostal = sc.nextLine();

        if (validarCodigoPostal(codigoPostal)) {
            System.out.println("Código postal válido.");
        } else {
            System.out.println("Código postal inválido.");
        }
        System.out.println("Ingrese un DNI: ");
        String DNI = sc.nextLine();

        if (validarDNI(DNI)) {
            System.out.println(DNI+" DNI válido");
        } else {
            System.out.println(DNI+" DNI inválido");
        }

        System.out.println("Ingrese una fecha en formato dd/mm/aaaa:");
        String fecha = sc.nextLine();

        if (validarFecha(fecha)) {
            System.out.println("Fecha válida.");
        } else {
            System.out.println("Fecha inválida o formato incorrecto.");
        }

        System.out.println("Ingrese un nombre de dominio web:");
        String dominio = sc.nextLine();

        if (validarDominioWeb(dominio)) {
            System.out.println("Dominio web válido.");
        } else {
            System.out.println("Dominio web inválido.");
        }

        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = sc.nextLine();

        if (validarNombreProducto(nombreProducto)) {
            System.out.println("Nombre del producto válido.");
        } else {
            System.out.println("Nombre del producto inválido. Debe contener solo letras y tener al menos 5 caracteres.");
        }

        System.out.println("Ingrese una contraseña:");
        String contrasena = sc.nextLine();

        if (validarContrasena(contrasena)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida. Debe tener al menos 8 caracteres y contener letras mayúsculas, letras minúsculas y números.");
        }

    }

    public static boolean ValidarTel(String numTel) {

        return numTel.matches("[0-9]{7,10}");
    }

    public static boolean ValidarCUIT(String CUIT) {
        return CUIT.matches("[0-9]{11}");
    }

    public static boolean ValidarEmail(String email) {
        return email.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+");
    }

    public static boolean ValidarNomenclatura(String nomenclatura) {
        return nomenclatura.matches("^[A-Za-z0-9]{22}$");
    }

    public static boolean ValidarNombre(String nombre) {
        return nombre.matches("^([A-Z]{1})[a-z]{6,9}$");
    }

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    public static boolean validarTelefonoInternacional(String telefono) {
        String telefonoRegex = "^\\+\\d+.*";
        return Pattern.compile(telefonoRegex).matcher(telefono).matches();
    }

    public static boolean validarCorreoPersonalizado(String email, String dominioPermitido) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+@(" + Pattern.quote(dominioPermitido) + ")$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
    public static boolean validarCodigoPostal(String codigoPostal) {
        String codigoPostalRegex = "^[A-Za-z0-9]{4,6}$";
        return Pattern.compile(codigoPostalRegex).matcher(codigoPostal).matches();
    }
    public static boolean validarDNI(String DNI){

        return DNI.matches("^[0-9]{8}$");
    }
    public static boolean validarFecha(String fecha) {
        String fechaRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return Pattern.compile(fechaRegex).matcher(fecha).matches();
    }
    public static boolean validarDominioWeb(String dominio) {
        String dominioRegex = "^[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,7}$";
        return Pattern.compile(dominioRegex).matcher(dominio).matches();
    }
    public static boolean validarNombreProducto(String nombreProducto) {
        return nombreProducto.matches("^[a-zA-Z]{5,}$");
    }
    public static boolean validarContrasena(String contrasena) {
        return contrasena.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$");
    }
}
