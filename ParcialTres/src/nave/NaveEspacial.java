package nave;

public class NaveEspacial {
    private String nombre;
    private double peso;
    private double potencia;
    private double velocidad;
    private String propulsión;
    private String tipo;
    
    // Constructor
    public NaveEspacial(String nombre, double peso, double potencia, double velocidad, String propulsión, String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.potencia = potencia;
        this.velocidad = velocidad;
        this.propulsión = propulsión;
        this.tipo = tipo;
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPotencia() {
        return potencia;
    }
    
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public String getPropulsión() {
        return propulsión;
    }
    
    public void setPropulsión(String propulsión) {
        this.propulsión = propulsión;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

	public void volar() {
		// TODO Auto-generated method stub
		
	}
}

	


