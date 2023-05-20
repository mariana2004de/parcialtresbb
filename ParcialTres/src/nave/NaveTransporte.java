package nave;

public class NaveTransporte extends NaveEspacialAbstracta {
    private int velocidadMaxima;

    public NaveTransporte(String propulsion, int capacidadCarga, int velocidadMaxima) {
        super("Transporte", propulsion, capacidadCarga);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public void volar() {
        System.out.println("La nave de transporte está volando.");
    }

    @Override
    public void despegar() {
        System.out.println("La nave de transporte ha despegado.");
    }

    @Override
    public void aterrizar() {
        System.out.println("La nave de transporte ha aterrizado.");
    }
    
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}
