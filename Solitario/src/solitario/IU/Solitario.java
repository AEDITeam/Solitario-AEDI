/*
 * Representa el juego del solitario, con sus reglas. 
 * Se recomienda una implementación modular.
 */
package solitario.IU;

//import java.util.Scanner;

import java.util.Scanner;
import solitario.Core.Jugador;
import solitario.Core.Mesa;
import static solitario.IU.ES.pideCadena;
import static solitario.IU.ES.pideNumero;


/**
 *
 * @author AEDI
 */
public class Solitario {
        public static void inicioPartida(){
        System.out.println( "\nBienvenido al juego solitario" );
        String nombre = pideCadena("Dame tu nombre: ");
        Jugador jugador = new Jugador(nombre);
        
        
        do{
            
            int op = 1;
            Mesa mesa = new Mesa();

        do {
            System.out.println( "\nEstas juagando al increible juego solitario" );
            

            op = menu();

            switch( op ) {

                case 1:
                    moverCarta();
                    break;
                case 2:
                    //mesa.movimientosPosibles(  );
                    break;
                case 3:
                    System.out.println( "Fin." );
                    op = 0;
                    break;
                case 42:
                    System.out.println("\nJuego desarrollado por:");
                    System.out.println("\nJuanma Peteiro, Andres Garcia, Cedric Piñeiro, Daniel Rodriguez y Victor Rodriguez.");
                    break;
                default:
                    System.out.println( "No es correcta esa opción ( " 
                                        + op + " )" );
            }
        } while( op != 0 );
            
        }while(seguirJugando());
    }
    
    
    public static boolean seguirJugando() {
        
        Scanner sc = new Scanner(System.in);
        
        char respuesta;
        
        do {
            
            System.out.print("¿Quieres seguir jugando? (S/N): ");
            respuesta = sc.nextLine().toUpperCase().charAt(0);
            
        } while (respuesta != 'S' && respuesta != 'N');
        
        if (respuesta == 'S') {
            return true;
        } 
        
        else{
            return false;
        }
    }
    
    public static int menu()
    {
        int toret;

        do {
            System.out.println(
                              "\n1. Mover carta\n"
                            + "2. Mostrar pista\n"
                            + "3. Finalizar partida\n");
            toret = pideNumero( "Selecciona: " );
        } while( toret < 1
              && toret > 3 );

        System.out.println();
        return toret;
    }
    public static void moverCarta(){
        //Condiciones para mover carta
        //Elegir funcion correspondiente en funcion de tipo de movimiento
        /*
        if(movimientoPosible == True){
            ....
        }else{
            sout("Ese movimiento no es posible")
        }
        */
        
    }
    
}
