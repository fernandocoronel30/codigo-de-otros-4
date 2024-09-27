import java.util.Scanner;

public class Codigo4 {
	//faltaba agregar el metodo main
	public static void main(String[] args) {
		//Aqui en esta linea le faltaba el parametro System.in
		 Scanner s = new Scanner(System.in);
		 	
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    String j1 = s.nextLine();
		    
		    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		     //Se comenta o elimina el scanner s2 ya que ya estaba llamada la instancia de scanner   
		    //Scanner s2 = new Scanner(System.in);
		    String j2 = s.nextLine();
		    
		    //Tenia un parentesis de mas en el if
		    if (j1 == j2) {
		      System.out.println("Empate");
		    } else {	    	
		      int g = 2;	      
		      switch(j1) {	      
		        case "piedra":
		          if (j2 == "tijeras") {
		            g = 1;
		          }//if
		          
		        case "papel":
		          if (j2 == "piedra") {
		            g = 1;
		            //Aqui falto cerrar el if
		          }//if 
		          
		          //en este caso le falto la s para que diga tijeras
		        case "tijeras":
		          if (j2.equals("papel")) {
		            g = 1;
		          }//if	          
		          break;
		        default:
		        	System.out.println("Elige un opcion válida");
		      }//switch
		      System.out.println("Gana el jugador " + g);
		    }//else
	}//main	    
}//class Codigo4
