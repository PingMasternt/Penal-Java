import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        select[0] = 0;
        do {
            Logo();//Llamada a la funcion "Logo"
            menuPrincipal();//LLamada a la funcion "menuPrincipal"
        } while (select[0] != 2);

    }

    public static Scanner input = new Scanner(System.in);//Crea un metodo de entrada para el usuario
    public static int[] select = new int[7];//Variable utilizada para interactuar con los menus.
    public static int d20;
    public static int Equipo;
    public static int Equipo1, Equipo2;


    public static void Logo(){//Utilizado para mostrar arte ascii
        System.out.println(" _______                                __                      ");
        System.out.println("/       |                              /  |                     ");
        System.out.println("$$$$$$$  | ______   _______    ______  $$ |                     ");
        System.out.println("$$ |__$$ ||      | |       |  |      | $$ |                     ");
        System.out.println("$$    $$//$$$$$$  |$$$$$$$  | $$$$$$  |$$ |                     ");
        System.out.println("$$$$$$$/ $$    $$ |$$ |  $$ | /    $$ |$$ |                     ");
        System.out.println("$$ |     $$$$$$$$/ $$ |  $$ |/$$$$$$$ |$$ |                     ");
        System.out.println("$$ |     $$       |$$ |  $$ |$$    $$ |$$ |                     ");
        System.out.println("$$/       $$$$$$$/ $$/   $$/  $$$$$$$/ $$/                      ");
        System.out.println("                            _____                               ");
        System.out.println("                           /     |                              ");
        System.out.println("                           $$$$$ |  ______   __     __  ______  ");
        System.out.println("                              $$ | /      | /  |   |  |/      | ");
        System.out.println("                         __   $$ | $$$$$$  |$$  | |$$| $$$$$$  |");
        System.out.println("                        /  |  $$ | /    $$ | $$  |$$|  /    $$ |");
        System.out.println("                        $$ |__$$ |/$$$$$$$ |  $$ $$|  /$$$$$$$ |");
        System.out.println("                        $$    $$| $$    $$ |   $$$|   $$    $$ |");
        System.out.println("                         $$$$$$|   $$$$$$$|     $|     $$$$$$$| ");
    }

    public static void menuPrincipal(){//Menu principal
        System.out.println("Presione 1) Para empezar \n         2) Para salir");
        select[0] = input.nextInt();// Asigna un valor al Array Publico select
        switch(select[0]){
            case 1:
            seleccionModalidad();
            break;

            case 2:
            break;
        }
    }
    public static void seleccionModalidad(){//Menu diseñado para seleccionar el modo de juego
        for(int i = 0; i <= 20; i++){
            System.out.println(" ");
        }
        System.out.println("Seleccione el Modo de Juego \n       1) Un jugador \n       2) Multijugador \n       3) Atras");
        select[1] = input.nextInt();
        switch(select[1]){
            case 1:
            unJugador();
            break;

            case 2:
            multijugador();
            break;

            default:
            break;
        }
    }

    public static void seleccionDeEquipo(){

    }

    public static void unJugador(){
        

    }

    public static void multijugador(){
        

    }

    
}
