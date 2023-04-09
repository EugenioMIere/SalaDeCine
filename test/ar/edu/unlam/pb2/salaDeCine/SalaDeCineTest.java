package ar.edu.unlam.pb2.salaDeCine;



public class SalaDeCineTest {
	public static void main(String[] args) {
		SalaDeCine sala9 = new SalaDeCine(9, 3 ,"Sala 9");
		//3. Consultar si una butaca está ocupada (referida por fila y asiento).
		sala9.ocuparButaca(0, 0);
		sala9.ocuparButaca(1, 0);
		sala9.ocuparButaca(2, 0);
		//5. Consultar la cantidad total de butacas ocupadas.
		System.out.println(sala9.informarButacasOcupadas());
		System.out.println(sala9.estadoButaca(1, 0));
		System.out.println(sala9.hayEspacioPara(3));

	}
}
