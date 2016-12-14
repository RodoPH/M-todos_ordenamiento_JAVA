package metodosOrdenamientoTarea;

public class MetodosDeOrdenamiento {

	private int i, j, k, aux;
	private int[] arreglo = new int[20];

	// Constructor
	public MetodosDeOrdenamiento() {
		i = j = k = aux = 0;
	}
	//Método privado que realiza el intercambio. 
	private void intercambio(int a, int b){
		aux = arreglo[b];
		arreglo[b] = arreglo[a];
		arreglo[a] = aux;
	}
	
	private void intercambioSortOp(int a, int b){
		aux = arreglo[a];					// asigna a una variable auxiliar.
		arreglo[a] = arreglo[a + b]; 		//Realiza el cambio.
		arreglo[a + b] = aux;				//Posiciona el valor reservado en la Aux.
	}
	
	// Método burbuja. Recibe como parámetro la longitud del arreglo
	public void ordenarBurburja(int longitud) {

		for (int j = 0; j < longitud; j++) {
			for (int i = j + 1; i < longitud; i++) {
				if (arreglo[j] > arreglo[i]) {
					
					intercambio(i, j);		//Método privado
				} 							// Cierre if
			} 								// cierre for interno
		} 									// cierre de for externo

		imprimir(longitud);
	}

	// Método de ordenamiento shellSortOp
	public void shellSortOp(int longitud) {
		boolean bandera;
		k = longitud;
		while (k != 1) {
			k = k / 2;
			bandera = true;
			while (bandera) {
				bandera = false;
				i = 0;
				while (i < (longitud - k)) {
					if (arreglo[i] > arreglo[(i + longitud)]) {		//Comparación para encontrar al mayor
						intercambioSortOp(i, k);					//Método privado
						bandera = true;
					}												//Cierre de IF
					i = i + 1;
				}						//Cierre de WHILE núcle
			}							//Cierre de WHILE interno
		}								//Cierre de WHILE externo
		imprimir(longitud);				//Método privado para imprimir.

	}
	
	
	// Método Selección directa. Recibe como parámetro la longitud del arreglo
	public void ordenarSeleccionDirecta(int longitud) {
		i = 0;
		while (i < (longitud - 1)) {
			k = i;
			aux = arreglo[i];
			j = i + 1;

			while (j < longitud) {
				if (arreglo[j] < aux) {
					k = j;
					aux = arreglo[j];
				} 							// Cierre del ciclo if
				j = j + 1;
			} 								// cierrre del ciclo while (INTERNO)

			arreglo[k] = arreglo[i];
			arreglo[i] = aux;
			i = i + 1;

		} 					// cierrre del primer ciclo while (EXTERNO)
		imprimir(longitud);
	}

	// Método QuickSort Recursivo
	public void ordenarQuickSort(int i, int d){
		if(i >= d){
			imprimir(d);
		}
		
		int izq = i, der = d;
		
		if(izq != der ){
			int pivote;
			pivote = izq;
			System.out.println(pivote);
			while(izq != der){
				while(arreglo[der] >= arreglo[pivote] && izq < der){
					der--;
				}
				while(arreglo[izq] < arreglo[pivote] && izq < der){
					izq++;
				}
				if(der != izq){
					intercambio(izq, der);
				}
				if(izq == der){
					ordenarQuickSort( i, izq-1);
					ordenarQuickSort(izq + 1, d);
				}
			}
		}
		imprimir(d);
	}
	
	
	// Método de llenado e impresión del contenido del arreglo
	public void llenarAleatorio(int longitud) {
		if (longitud == 0) {
										// No es necesario :/
		} else {
			arreglo[longitud - 1] = (int) (Math.random() * 1000);
			llenarAleatorio(longitud - 1);
		} 								// cierre de else
		if (longitud == 20) {
			imprimir(longitud);			//Método privado para imprimir.
		} 								// cierre de if
	}

	// Método recursivo de impresión del contenido del arreglo
	private void imprimir(int longitud) {

		if (longitud > 0) {
			System.out.print(longitud + " [" + arreglo[longitud - 1] + "] \n");
			imprimir(longitud - 1);
		} 								// cierre de if
	}									// cierre de método

	// Método de un getter que retorna el tamaño del arreglo
	public int dameTamano() {
		return arreglo.length;
	}
}
