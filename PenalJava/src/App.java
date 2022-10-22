import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Logo();//Llamada a la funcion "Logo"
        menuPrincipal();//LLamada a la funcion "menuPrincipal"

    }

    public static int[] select = new int[7];//Variable utilizada para interactuar con los menus.
    public static int d20;

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
        Scanner input = new Scanner(System.in);//Crea un metodo de entrada para el usuario
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
    public static void seleccionModalidad(){
        
    }

}
