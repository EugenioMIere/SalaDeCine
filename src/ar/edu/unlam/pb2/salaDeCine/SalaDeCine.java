package ar.edu.unlam.pb2.salaDeCine;

public class SalaDeCine {
	private Boolean butacas[][];
	private String nombreSala;
	private Integer butacasOcupadas = 0;
	private Integer cantidadDeFilas = 0;
	private Integer cantidadDeColumnas = 0;

	/**
	 * 
	 * @param cantidadDeButacas
	 * @param cantidadDeFilas
	 * @param sala
	 */
	public SalaDeCine(Integer cantidadDeButacas, Integer cantidadDeFilas, String sala) {

		this.cantidadDeFilas = cantidadDeFilas;
		this.cantidadDeColumnas = (cantidadDeButacas / cantidadDeFilas);

		this.butacas = new Boolean[cantidadDeFilas][cantidadDeColumnas];

		this.nombreSala = sala;
		
		//inicializa el array multidimensional de butacas libres
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[0].length; j++) {
				this.butacas[i][j] = false;
			}
		}
	}

	/**
	 * 2. Consultar si la sala está vacía.
	 * 
	 * @return Boolean
	 */
	public Boolean seEncuentraVacia() {
		informarButacasOcupadas();
		return this.butacasOcupadas == 0;
	}

	/**
	 * 3. Consultar si una butaca está ocupada (referida por fila y asiento).
	 * 
	 * @param fila
	 * @param columna
	 * @return String Ocupado/Libre
	 */
	public String estadoButaca(Integer fila, Integer columna) {
		String estadoDeButaca = "Libre";

		if (this.butacas[fila][columna] == true) {
			estadoDeButaca = "Ocupado";
		}
		return estadoDeButaca;
	}

	/**
	 * 4-Ocupar una butaca determinada, siempre que ésta no esté previamente
	 * ocupada.
	 * 
	 * @param fila
	 * @param columna
	 */
	public void ocuparButaca(Integer fila, Integer columna) {
		if (this.butacas[fila][columna] == false) {
			this.butacas[fila][columna] = true;
		}
	}

	/**
	 * 5. Consultar la cantidad total de butacas ocupadas.
	 * 
	 * @return
	 */
	public Integer informarButacasOcupadas() {
		this.butacasOcupadas = 0;
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[0].length; j++) {
				if (this.butacas[i][j] == true) {
					this.butacasOcupadas++;
				}
			}
		}
		return this.butacasOcupadas;
	}

	/**
	 * 6. Consultar si es posible acomodar a un grupo de X personas, en forma
	 * contigua, en la misma fila
	 * 
	 * @param cantidadDePersonas
	 * @return
	 */
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {

		Integer butacasDisponiblesContiguas = 0;
		Boolean siHayEspacio = false;

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[0].length; j++) {
				if (this.butacas[i][j] == false) {

					butacasDisponiblesContiguas++;

					if (butacasDisponiblesContiguas == cantidadDePersonas) {
						siHayEspacio = true;
					}
				} else {
					butacasDisponiblesContiguas = 0;
				}

			}
		}
		return siHayEspacio;
	}
}
