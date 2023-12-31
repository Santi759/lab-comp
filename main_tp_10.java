import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Perro p = new Perro();
        p.inicializar("Lucho", "Ratonero", 11);
        String atributos = p.datos();
        String ladrar = p.ladrar();
        System.out.println(atributos);
        System.out.println(ladrar);

        Circulo c = new Circulo();
        c.inicializar(3.5);
        double area = c.Cal_area();
        double circ = c.Cal_cir();
        System.out.println("El area de la circulo es: "+area);
        System.out.println("La circunferencia del circulo es: "+circ);

        Estudiantes e1 = new Estudiantes();
        e1.init("Santiago",20,1234567);
        Estudiantes e2 = new Estudiantes();
        e2.init("Martina",18,7654321);

        String estu1= e1.datosEstu();
        String estu2= e2.datosEstu();

        System.out.println(estu1);
        System.out.println(estu2);

        Libro l1 = new Libro();
        l1.init("Harry Potter y la Piedra Filosofal","J.K. Rowling",1997);
        Libro l2 = new Libro();
        l2.init("Sherlock Holmes","Arthur Doyle",1887);

        String book1= l1.datosLibro();
        String book2= l2.datosLibro();

        System.out.println(book1);
        System.out.println(book2);

        double ret;
        CuentaBancaria CB = new CuentaBancaria();
        CB.cuenta(15000,1234567);

        String Cuenta= CB.datosCuenta();
        System.out.println(Cuenta);

        System.out.println("Ingrese el retiro");
        double r= CB.ret();

        double newSaldo= CB.Saldo();
        System.out.println("Saldo Nuevo: "+newSaldo);

        Rectangulo rec = new Rectangulo();
        rec.init(3.5,6);

        double Area = rec.area();
        double Perimetro = rec.perimetro();
        System.out.println("Area del rectangulo: "+Area);
        System.out.println("Perimetro del Rectangulo: "+Perimetro);

        Coche co = new Coche();
        co.init("Chevrolet","Onix",2020);

        System.out.println("A cuanto Acelera el coche?");
        int aceleracion = co.aceleracion();
        System.out.println("Cuantos km frenara?");
        int frenos = co.frenos();
        System.out.println("El coche se encuentra ahora a una velocidad de "+frenos+" km");

        Pelicula peli= new Pelicula();
        peli.init("oppenheimer","Christopher Nolan", 180);
        String datos = peli.datosPeli();
        System.out.println(datos);
