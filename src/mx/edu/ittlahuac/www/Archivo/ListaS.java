package mx.edu.ittlahuac.www.Archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/* Estructura de datos
 * metodos de la lista ligada
 */




public class ListaS 
{
	
	    private Nodo lista;
	    private Nodo ultimo;
	    private int tam;
	    static List<Integer> datosUtiles = new ArrayList<>();
	    //constructor
	    public ListaS() 
	    {
	        this.lista = null;
	        this.ultimo = null;
	        this.tam = 0;
	    }//listaS

	    
	    //agrega al final 
	    public ListaS inserta(String valor) 
	    {
	        if(esVacio()) 
	        {
	            Nodo nuevo = new Nodo(valor);
	            lista = nuevo;
	            ultimo = nuevo;
	            nuevo.sig = nuevo;
	        }
	        else
	        {
	            Nodo nuevo = new Nodo(valor);
	            nuevo.sig = null;
	            ultimo.sig = nuevo;
	            ultimo = nuevo;
	        }
	        this.tam++;
	        return this;
	    }//inserta



	    //imprime el tamanio dela lista
	    public void tamano() 
	    {
	    	System.out.println("tamaño: "+this.tam);
	    }

	    public void muestra() {
	    		//throws FileNotFoundException, IOException, NumberFormatException {
	        //String cadena;
	        {
		        if(tam != 0) {
		            Nodo temp = lista;
		            String str = "";
		            for(int i = 0; i < this.tam; i++) 
		            {
		            	str = str + temp.valor + "\n";
	                    temp = temp.sig;
	                    }
		            System.out.println("valor\n "+str);
	                
		        }
	        //ArrayList<String> listaStringEdades = new ArrayList<>();

	       // FileReader f = new FileReader(pathEdades);

	       // try (BufferedReader b = new BufferedReader(f)) {
	           // while ((cadena = b.readLine()) != null) {
	                //datosUtiles.add(Integer.parseInt(cadena.trim().replaceAll(" ", "")));
	           // }
	       // }
	        //for (int indx = 0; indx < datosUtiles.size(); indx++) {
	          //  System.out.print(datosUtiles.get(indx) + "\t");
	        //}
	    }
	    }


	    //imprime toda la lista
	    public void imprimeLista() 
	    {
	        if(tam != 0) {
	            Nodo temp = lista;
	            String str = "";
	            for(int i = 0; i < this.tam; i++) 
	            {
	            	str = str + temp.valor + "\n";
                    temp = temp.sig;
                    }
	            System.out.println("valor\n "+str);
                
	        }
	    }//tam

	    //indica si esta vacia
	    public boolean esVacio() 
	    {
	        return (this.lista == null);
	    }//esVacio


   	    //borra el ultimo valor
	    public Nodo borraUltimo() 
	    {
	        Nodo eliminar = null;
	        if(esVacio()) {
	            System.out.println("Lista vacia");
	            return null;
	        }
	        if(lista == ultimo) {
	            lista = null;
	            ultimo = null;
	        }
	        else {
	            Nodo actual = lista;
	            while(actual.sig != ultimo) {
	                actual = actual.sig;
	            }
	            eliminar = actual.sig;
	            actual.sig = null;
	            ultimo = actual;
	        }
	        this.tam--;
	        return eliminar;
	    }//borraUltimo

}//class

