package mx.edu.ittlahuac.www.Archivo;


/* Estructura de datos
 * Menu principal de la aplicacion 
 * */
public class Menu 
{

	public static void main(String[] args) 
	{
		String pathEdades = "C:\\Users\\LAP KRUMAN\\Documents\\Archivo/ArchivoLectura.txt";
          ListaS ptr = new ListaS();
          ptr.inserta(pathEdades);
          ptr.tamano();
          ptr.muestra();
       
	}//main
}//menu
