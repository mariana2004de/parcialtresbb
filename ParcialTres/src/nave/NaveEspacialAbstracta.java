package nave;

public abstract class NaveEspacialAbstracta {
	 protected String tipo;
	    protected String propulsion;
	    protected int capacidadCarga;

	    public NaveEspacialAbstracta(String tipo, String propulsion, int capacidadCarga) {
	        this.tipo = tipo;
	        this.propulsion = propulsion;
	        this.capacidadCarga = capacidadCarga;
	    }

	    public abstract void volar();

	    public String getTipo() {
	        return tipo;
	    }

	    public String getPropulsion() {
	        return propulsion;
	    }

	    public int getCapacidadCarga() {
	        return capacidadCarga;
	    }

		public void despegar() {
			// TODO Auto-generated method stub
			
		}

		public void aterrizar() {
			// TODO Auto-generated method stub
			
		}
	}


