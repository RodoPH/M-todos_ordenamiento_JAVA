package metodosOrdenamientoTarea;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class UsoMetodosDeOrdenamiento {

	public static void main(String[] args) {

		MetodosDeOrdenamiento objOrden = new MetodosDeOrdenamiento();
		int opcion;
		int longitud  = objOrden.dameTamano();//Tamaño del arreglo
		ImageIcon icono = new ImageIcon("src/metodosOrdenamientoTarea/Editar-48.png");
		ImageIcon salida = new ImageIcon("src/metodosOrdenamientoTarea/Exit.png");

		JOptionPane.showMessageDialog(null,"\t\t\t\tOrdenamiento",null, JOptionPane.INFORMATION_MESSAGE,icono);

		do{
			try {
				opcion = (Integer.parseInt(JOptionPane.showInputDialog(null,
						"Elige una opción:"
						+ "\n\n1: Llenar arreglo aleatoriamente. "
						+ "\n2: Ordenar por burbuja. "
						+ "\n3: Ordenar por selección directa. "
						+ "\n4: Ordenar por ShellSortOp."
						+ "\n5: Ordenar por QuickSort."
						+ "\n6: Salir. ","Menú",JOptionPane.QUESTION_MESSAGE)));

				switch (opcion) {
				case 1:
					System.out.println("ARREGLO");
					objOrden.llenarAleatorio(longitud);
					System.out.println(" ");
					break;
				case 2:
					System.out.println("ORDENAMIENTO BURBUJA");
					objOrden.ordenarBurburja(longitud);
					System.out.println(" ");
					break;
				case 3:
					System.out.println("ORDENAMIENTO DE SELECCIÓN DIRECTA");
					objOrden.ordenarSeleccionDirecta(longitud);
					System.out.println(" ");
					break;
				case 4:
					System.out.println("ORDENAMIENTO SHELLSORTOP");
					objOrden.shellSortOp(longitud-1);
					System.out.println(" ");
					break;
				case 5:
					System.out.println("ORDENAMIENTO QuickSort");
				objOrden.ordenarQuickSort(0,longitud);
					System.out.println(" ");
					break;
				
				case 6:
					JOptionPane.showMessageDialog(null,"Saliendo...",null,JOptionPane.INFORMATION_MESSAGE,salida);
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPCIÓN NO DISPONIBLE", "Error",
							JOptionPane.INFORMATION_MESSAGE);
					break;
				}

			} catch (Exception e) {
				System.out.println("error " + e.toString());
				e.printStackTrace();
				opcion = 0;

			}
		} while (opcion != 5);

	}

	}

