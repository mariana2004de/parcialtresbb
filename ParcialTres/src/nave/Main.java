package nave;

public class Main {
	public static void main(String[] args) {
        NaveTransporte naveTransporte = new NaveTransporte("Motor cohete", 500, 1000);
        NaveExploracion naveExploracion = new NaveExploracion("Motor de plasma", 200, 500);
        NaveCombate naveCombate = new NaveCombate("Motor iónico", 100, "Láseres");
        NaveCarga naveCarga = new NaveCarga("Motor cohete", 1000, 50);
        
        System.out.println("Tipo de nave: " + naveTransporte.getTipo());
        System.out.println("Propulsión: " + naveTransporte.getPropulsion());
        System.out.println("Capacidad de carga: " + naveTransporte.getCapacidadCarga());
        System.out.println("Velocidad máxima: " + naveTransporte.getVelocidadMaxima());
        
        naveTransporte.despegar();
        naveTransporte.volar();
        naveTransporte.aterrizar();
        
        System.out.println();
        
        System.out.println("Tipo de nave: " + naveExploracion.getTipo());
        System.out.println("Propulsión: " + naveExploracion.getPropulsion());
        System.out.println("Capacidad de carga: " + naveExploracion.getCapacidadCarga());
        System.out.println("Autonomía: " + naveExploracion.getAutonomia());
        
        naveExploracion.despegar();
        naveExploracion.volar();
        naveExploracion.aterrizar();
        
        System.out.println();
        
        System.out.println("Tipo de nave: " + naveCombate.getTipo());
        System.out.println("Propulsión: " + naveCombate.getPropulsion());
        System.out.println("Capacidad de carga: " + naveCombate.getCapacidadCarga());
        System.out.println("Armamento: " + naveCombate.getArmamento());
        
        naveCombate.despegar();
        naveCombate.volar();
        naveCombate.aterrizar();
        
        System.out.println();
        
        System.out.println("Tipo de nave: " + naveCarga.getTipo());
        System.out.println("Propulsión: " + naveCarga.getPropulsion());
        System.out.println("Capacidad de carga: " + naveCarga.getCapacidadCarga());
        System.out.println("Capacidad de tripulación: " + naveCarga.getCapacidadTripulacion());
        
        naveCarga.despegar();
        naveCarga.volar();
        naveCarga.aterrizar();
    }
}


