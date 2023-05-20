import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainn {
    private static List<NaveEspacial> inventario = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean terminar = false;
        while (!terminar) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Crear una nueva nave");
            System.out.println("2. Buscar una nave");
            System.out.println("3. Terminar el programa");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearNave();
                    break;
                case 2:
                    buscarNave();
                    break;
                case 3:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    private static void crearNave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de nave (Transporte/Exploracion/Combate/Carga):");
        String tipo = scanner.nextLine();

        System.out.println("Ingrese la propulsión:");
        String propulsion = scanner.nextLine();

        System.out.println("Ingrese la capacidad de carga:");
        int capacidadCarga = scanner.nextInt();

        switch (tipo.toLowerCase()) {
            case "transporte":
                System.out.println("Ingrese la velocidad máxima:");
                int velocidadMaxima = scanner.nextInt();
                inventario.add(new NaveTransporte(propulsion, capacidadCarga, velocidadMaxima));
                break;
            case "exploracion":
                System.out.println("Ingrese la autonomía:");
                int autonomia = scanner.nextInt();
                inventario.add(new NaveExploracion(propulsion, capacidadCarga, autonomia));
                break;
            case "combate":
                System.out.println("Ingrese el armamento:");
                String armamento = scanner.next();
                inventario.add(new NaveCombate(propulsion, capacidadCarga, armamento));
                break;
            case "carga":
                System.out.println("Ingrese la capacidad de tripulación:");
                int capacidadTripulacion = scanner.nextInt();
                inventario.add(new NaveCarga(propulsion, capacidadCarga, capacidadTripulacion));
                break;
            default:
                System.out.println("Tipo de nave inválido");
                break;
        }
    }

    private static void buscarNave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de nave a buscar (Transporte/Exploracion/Combate/Carga):");
        String tipo = scanner.nextLine();

        List<NaveEspacial> navesEncontradas = new ArrayList<>();

        for (NaveEspacial nave : inventario) {
            if (nave.getTipo().equalsIgnoreCase(tipo)) {
                navesEncontradas.add(nave);
            }
        }

        if (navesEncontradas.isEmpty()) {
            System.out.println("No se encontraron naves del tipo especificado.");
        } else {
            System.out.println("Naves encontradas del tipo " + tipo + ":");
            for (NaveEspacial nave : navesEncontradas) {
                System.out.println("Tipo: " + nave.getTipo());
                System.out.println("Propulsión: " + nave.getPropulsion());
                System.out.println("Capacidad de carga: " + nave.getCapacidadCarga());
                System.out.println("------------------------");
            }
        }
    }
}