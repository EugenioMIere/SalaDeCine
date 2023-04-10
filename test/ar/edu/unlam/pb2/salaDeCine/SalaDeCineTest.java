package ar.edu.unlam.pb2.salaDeCine;



public class SalaDeCineTest {
	public static void main(String[] args) {
		SalaDeCine sala9 = new SalaDeCine(9, 3 ,"Sala 9");
		
		//4. Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada.
		
		sala9.ocuparButaca(0, 0);
		sala9.ocuparButaca(1, 0);
		sala9.ocuparButaca(1, 0);
//		sala9.ocuparButaca(2, 0);
		//5. Consultar la cantidad total de butacas ocupadas.
		System.out.println(sala9.informarButacasOcupadas());
		
		//3. Consultar si una butaca está ocupada (referida por fila y asiento).
		System.out.println(sala9.estadoButaca(1, 0));
		
//		6. Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila:
		
		System.out.println(sala9.hayEspacioPara(3));
		
		//2. Consultar si la sala está vacía.
		System.out.println(sala9.seEncuentraVacia());

	}
}
