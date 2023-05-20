package nave;

public class NaveCarga extends NaveEspacialAbstracta {
private int capacidadTripulacion;
public NaveCarga(String propulsion, int capacidadCarga, int capacidadTripulacion) {
    super("Carga", propulsion, capacidadCarga);
    this.capacidadTripulacion = capacidadTripulacion;
}

@Override
public void volar() {
    System.out.println("La nave de carga está volando.");
}

@Override
public void despegar() {
    System.out.println("La nave de carga ha despegado.");
}

@Override
public void aterrizar() {
    System.out.println("La nave de carga ha aterrizado.");
}

public int getCapacidadTripulacion() {
    return capacidadTripulacion;
}
}
