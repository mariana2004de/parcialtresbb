package nave;

public class NaveTripulada extends NaveEspacial implements FuncionesAstronauta {
    private String moduloCapsula;
    private String estacionEspacial;
    private String[] funciones;

    // Constructor
    public NaveTripulada(String nombre, double peso, double potencia, double velocidad, String propulsion, String tipo, String moduloCapsula, String estacionEspacial, String[] funciones) {
        super(nombre, peso, potencia, velocidad, propulsion, tipo);
        this.moduloCapsula = moduloCapsula;
        this.estacionEspacial = estacionEspacial;
        this.funciones = funciones;
    }

    // Getters y setters
    public String getModuloCapsula() {
        return moduloCapsula;
    }

    public void setModuloCapsula(String moduloCapsula) {
        this.moduloCapsula = moduloCapsula;
    }

    public String getEstacionEspacial() {
        return estacionEspacial;
    }

    public void setEstacionEspacial(String estacionEspacial) {
        this.estacionEspacial = estacionEspacial;
    }

    public String[] getFunciones() {
        return funciones;
    }

    public void setFunciones(String[] funciones) {
        this.funciones = funciones;
    }

    // Métodos de la interfaz FuncionesAstronauta
    @Override
    public void repararEquipos() {
        // Implementación del método repararEquipos
    }

    @Override
    public void realizarExperimentos() {
        // Implementación del método realizarExperimentos
    }
}

// Interfaz FuncionesAstronauta
public interface FuncionesAstronauta {
    void repararEquipos();
    void realizarExperimentos();
}