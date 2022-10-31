import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        select[0] = 0;
        do {
            cls();
            Logo();//Llamada a la funcion "Logo"
            menuPrincipal();//LLamada a la funcion "menuPrincipal"
        } while (select[0] != 2);

    }

    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);//Crea un metodo de entrada para el usuario
    public static int[] select = new int[7];//Variable utilizada para interactuar con los menus.
    public static int d20;
    public static int Equipo1, Equipo2;
    public static int PuntuacionJ1;//Almacena la puntuacion del jugador 1
    public static int PuntuacionJ2;//Almacena la puntuacion del jugador 2
    public static int r = rand.nextInt(10);


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

    public static void seleccionDeEquipo(){//Menu de Seleccion de equipos
        for(int i = select[1]; i > 0; i--){
            cls();
            System.out.println("Seleccione un equipo Jugador " + i + " \n 1)Argentina \n 2)Australia \n 3)Arabia Saudita \n 4)Belgica \n 5)Canada \n 6)Costa Rica \n 7)Brazil \n 8)España \n 9)Uruguay \n 10)Mexico");
            if(i == 2){
                Equipo1 = input.nextInt();
            }else{
                Equipo2 = input.nextInt();
            }
        }
        
    }

    public static void unJugador(){
        cls();
        seleccionDeEquipo();
        cls();
        for(int i = 0; i < 5; i++){
            gameJ1();
        }
        cls();
        System.out.println("La puntuacion del Jugador 1 es " + PuntuacionJ1);
        pause(3000);
        PuntuacionJ1 = 0;
    }

    public static void multijugador(){
        cls();
        seleccionDeEquipo();
        for(int i = 0; i < 5; i++){
            gameJ1();
        }
        for(int i = 0; i < 5; i++){
            gameJ2();
        }
        System.out.println("La puntuacion del Jugador 1 es " + PuntuacionJ1);
        System.out.println("La puntuacion del Jugador 2 es " + PuntuacionJ2);
        if(PuntuacionJ1 > PuntuacionJ2){
            System.out.println("Gana El jugador 1");
        }else{
            System.out.println("Gana El jugador 2");
        }
    }

    public static void gameJ1(){//Logica del juego
        System.out.println("Elige a donde patear la pelota");
        arco();
        select[2] = input.nextInt();
        switch(select[2]){
            case 1:
            if(r >= 3){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 2:
            if(r >= 4){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 3:
            if(r >= 3){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 4:
            if(r >= 4){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 5:
            if(r >= 5){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 6:
            if(r >= 4){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 7:
            if(r >= 3){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 8:
            if(r >= 5){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
            case 9:
            if(r >= 3){
                PuntuacionJ1 = PuntuacionJ1 + 1;
            }else{
                System.out.println("Fallastes");
            }
            break;
        }
    }
    
    public static void gameJ2(){//Logica del juego
         System.out.println("Elige a donde patear la pelota");
         arco();
         select[2] = input.nextInt();
        switch(select[2]){
             case 1:
            if(r >= 3){
                PuntuacionJ2 = PuntuacionJ2 + 1;
            }else{
                    System.out.println("Fallastes");
                }
                break;
                case 2:
                if(r >= 4){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 3:
                if(r >= 3){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 4:
                if(r >= 4){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 5:
                if(r >= 5){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 6:
                if(r >= 4){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 7:
                if(r >= 3){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 8:
                if(r >= 5){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
                case 9:
                if(r >= 3){
                    PuntuacionJ2 = PuntuacionJ2 + 1;
                }else{
                    System.out.println("Fallastes");
                }
                break;
    
            }
        }
    

    public static void cls(){
        for(int i = 0; i <= 20; i++){
            System.out.println(" ");
        }
    }
    
    public static void pause(int a){
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void arco(){
        System.out.println(" _______ ");
        System.out.println("|1  2  3|");
        System.out.println("|4  5  6|");
        System.out.println("|7  8  9|");
    }
}
