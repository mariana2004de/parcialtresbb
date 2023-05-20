package nave;

public class NaveCombate extends NaveEspacialAbstracta {
    private String armamento;

    public NaveCombate(String propulsion, int capacidadCarga, String armamento) {
        super("Combate", propulsion, capacidadCarga);
        this.armamento = armamento;
    }

    @Override
    public void volar() {
        System.out.println("La nave de combate está volando.");
    }

    @Override
    public void despegar() {
    	System.out.println("La nave de combate ha despegado.");
    	}
    public void aterrizar() {
        System.out.println("La nave de combate ha aterrizado.");
    }

    public String getArmamento() {
        return armamento;
    }

}
