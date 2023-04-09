package ar.edu.unlam.pb2.salaDeCine;

public class SalaDeCine {
	private Boolean butaca[][];
	private String sala;
	private Integer butacasOcupadas = 0;
	
	public SalaDeCine(Integer cantidadDeButacas, Integer cantidadDeFilas, String sala){
		
		Integer cantidadDeColumnas=(cantidadDeButacas/cantidadDeFilas);
		
		this.butaca = new Boolean[cantidadDeFilas][cantidadDeColumnas];
		
		this.sala = sala;
		for (int i = 0; i < butaca.length; i++) {
			for (int j = 0; j < butaca[0].length; j++) {
				this.butaca[i][j]= false;
				
			}
		}
		
	}
	
	
	
	//2. Consultar si la sala está vacía.
	
		public Boolean seEncuentraVacia(){
			
			Boolean estadoDeSala = false;
			
			if (this.butacasOcupadas==0) {
				estadoDeSala = true;
			}
			return estadoDeSala;
		}
		
		
	//3. Consultar si una butaca está ocupada (referida por fila y asiento).
	
	public String estadoButaca(Integer fila,Integer columna){
		String estadoDeButaca="";
		
		if (this.butaca[fila][columna]== true) {
			estadoDeButaca = "Ocupado";
		}else {
			estadoDeButaca = "Libre";
		}
		return estadoDeButaca;
	}
	
	
	//4-Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada.
	
		public void ocuparButaca(Integer fila, Integer columna) {
			
			if (this.butaca[fila][columna] == false) {
				this.butaca[fila][columna] = true;
			}
			
			
		}
	

	//5. Consultar la cantidad total de butacas ocupadas.
		public Integer informarButacasOcupadas() {
			
			for (int i = 0; i < butaca.length; i++) {
				for (int j = 0; j < butaca[0].length; j++) {
					if (this.butaca[i][j]== true) {
						this.butacasOcupadas++;
					}
					
				}
			}
			return this.butacasOcupadas;
		}
		
	//6. Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila
		
		public Boolean hayEspacioPara(Integer cantidadDePersonas){
			
			Integer butacasDisponiblesContiguas = 0;
			Boolean siHayEspacio = false;
			
			for (int i = 0; i < butaca.length; i++) {
				for (int j = 0; j < butaca[0].length; j++) {
					if (this.butaca[i][j]== false) {
						
						butacasDisponiblesContiguas++;
						
						if(butacasDisponiblesContiguas == cantidadDePersonas) {
							siHayEspacio = true;
						}
					}else {
						butacasDisponiblesContiguas = 0;
					}
					
				}
			}
			return siHayEspacio;
		}
}
