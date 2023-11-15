import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Redacion redacion1 = new Redacion(new ArrayList<Redactor>());
    static String response;
    static String competicion;
    static String club;
    static String jugador;
    static String tenista;
    static String escuderia;
    static String equipo;
    static int noticia;
    public static void main(String[] args) {
        int option;
        String redactorNombre;
        String DNI;

        do {
            showMenu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Introduzir redactor");
                    redactorNombre = input.next();
                    System.out.println("Introduzir el DNI del redactor");
                    DNI = input.next();
                    response = crearRedactor(redactorNombre, DNI);
                    break;
                case 2:
                    System.out.println("Introduzir el DNI del redactor");
                    DNI = input.next();
                    response = eliminarRedactor(DNI);
                    break;
                case 3:
                    System.out.println("Introduzir el DNI del redactor");
                    DNI = input.next();
                    showMenuNoticias();
                    noticia = input.nextInt();
                    switch (noticia) {
                        case 1:
                        System.out.println(" dime la competiciion");
                        competicion = input.next();
                        System.out.println(" dime la club");
                        club = input.next();
                        System.out.println(" dime el jugador");
                        jugador = input.next();
                        response = introducirNoticia(DNI, noticia);
                            break;
                        case 2:
                            System.out.println(" dime la competicion");
                            competicion = input.next();
                            System.out.println(" dime la club");
                            club = input.next();
                            response = introducirNoticia(DNI, noticia);
                            break;
                        case 3:
                            System.out.println(" dime la competiciion");
                            competicion = input.next();
                            System.out.println( " dime el nombre del tenista");
                            tenista = input.next();
                            response = introducirNoticia(DNI, noticia);
                            break;
                        case 4:
                            System.out.println(" dime el nombre de la escuderia");
                            escuderia = input.next();
                            response = introducirNoticia(DNI, noticia);
                            break;
                        case 5:
                            System.out.println(" dime el nombre del equipo");
                            equipo = input.next();
                            response = introducirNoticia(DNI, noticia);

                        default:
                           response= "opcion incorrecta";

                    }

                default:
                    break;
            }
            System.out.println(response);
        }while (option!= 0);
    }
    public static void showMenu() {
        System.out.println(" chosse onde option : \n"
                + "1. Introduir redactor. \n"
                + "2. Eliminar redactor. \n"
                + "3. Introduir notícia a un redactor. \n"
                + "4. Eliminar notícia (ha de demanar redactor i titular de la notícia). \n"
                + "5. Mostrar totes les notícies per redactor.  \n"
                + "6. Calcular puntuació de la notícia. \n"
                + "7. Calcular preu-notícia. \n"
                + "0. quit");
    }
    public static void showMenuNoticias() {
        System.out.println(" chosse onde option : \n"
                + "1. Football \n"
                + "2. Basketball. \n"
                + "3. Tenis \n"
                + "4. Formula1 \n"
                + "5. Motociclismo.");
    }
    public static String crearRedactor(String redactorNombre, String DNI) {
        Redactor redactor = new Redactor(redactorNombre, DNI);
        if(!Objects.equals(redactor.getDni(), "")){
            redacion1.redactores.add(redactor);
            response = "El redactor " + redactor.getNombre() + " ha sido creado correct";
        }else {
            response = "El redactor " + redactor.getNombre() + " no se ha creado correctamente";
        }
        return response;
    }
    public static String eliminarRedactor(String DNI){
        int indice = -1;
        boolean found = false;
        int size = redacion1.redactores.size();
        for (int i = 0; i < size; i++) {
            if (redacion1.redactores.get(i).getDni().equalsIgnoreCase(DNI)) {
                found = true;
                indice = i;
            }
            if (found) {
                response = "El redactor " + redacion1.redactores.get(indice).getNombre() + " ha sido eliminado correctamente";
                redacion1.redactores.remove(indice);
            }else {
                response = "El redactor no se ha eliminado correctamente";
            }
        }
        return response;
    }
    public static String introducirNoticia(String DNI, int noticia) {
        int indice = -1;
        boolean found = false;
        int size = redacion1.redactores.size();
        for (int i = 0; i < size; i++) {
            if (redacion1.redactores.get(i).getDni().equalsIgnoreCase(DNI)) {
                found = true;
                indice = i;
            }
            if (found) {
                if (noticia == 1) {
                    Noticia noticia1 = new Futbol(competicion, club, jugador);
                    redacion1.redactores.get(indice).noticias.add(noticia1);
                    response = "La noticia " + redacion1.redactores.get(indice).noticias.toString() + " ha sido intro";
                }
                if (noticia == 2) {
                    Noticia noticia2 = new Basketball(competicion, club);
                    redacion1.redactores.get(indice).noticias.add(noticia2);
                    response = "La noticia " + redacion1.redactores.get(indice).noticias.toString() + " ha sido intro";
                }
                if (noticia == 3) {
                    Noticia noticia3 = new Tenis(competicion, tenista);
                    redacion1.redactores.get(indice).noticias.add(noticia3);
                    response = "La noticia "+ redacion1.redactores.get(indice).noticias.toString() + " ha sido intro";
                }
                if (noticia == 4) {
                    Noticia noticia4 = new Formula1(escuderia);
                    redacion1.redactores.get(indice).noticias.add(noticia4);
                    response = "La noticia "+ redacion1.redactores.get(indice).noticias.toString() + " ha sido intro";
                }
                if (noticia == 5) {
                    Noticia noticia5 = new Motociclismo(equipo);
                    redacion1.redactores.get(indice).noticias.add(noticia5);
                    response = "La noticia "+ redacion1.redactores.get(indice).noticias.toString() + " ha sido intro";

                }
                else {
                    response = "La noticia no se ha introducido correctamente";
                }
            }
        }
        return response;
    }
}
