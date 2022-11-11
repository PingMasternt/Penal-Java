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
    public static int[] arquero = new int[10];
    public static int Equipo1, Equipo2;
    public static int PuntuacionJ1;//Almacena la puntuacion del jugador 1
    public static int PuntuacionJ2;//Almacena la puntuacion del jugador 2


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
            System.out.println("Seleccione un equipo Jugador " + i + " \n 1)Argentina \n 2)Australia \n 3)Arabia Saudita \n 4)Belgica \n 5)Canada \n 6)Costa Rica \n 7)Brazil \n 8)Paris \n 9)Uruguay \n 10)Mexico");
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
        Juego1();
        cls();
        System.out.println("La puntuacion del Jugador 1 es " + PuntuacionJ1);
        pause(3000);
        PuntuacionJ1 = 0;
    }
    public static void multijugador(){
        cls();
        seleccionDeEquipo();
        Juego2();
        System.out.println("La puntuacion del Jugador 1 es " + PuntuacionJ1);
        pause(1500);
        System.out.println("La puntuacion del Jugador 2 es " + PuntuacionJ2);
        pause(1500);
        if(PuntuacionJ1 > PuntuacionJ2){
            System.out.println("Gana El jugador 1");
        }else{
            if(PuntuacionJ1 == PuntuacionJ2){
                System.out.println("Ambos empatan. Empieza el desempate");
                desempate();
            }else{
                System.out.println("Gana El jugador 2");
            }
        }
        pause(3000);
    }
    public static void Juego1(){
        for(int i = 0; i < 5; i++){
            arquero[i] = rand.nextInt(9 - 1 + 1) + 1;
        }
        for(int f = 0; f < 5; f++){
            System.out.println("J1 Patea la pelota");
            arco();
            select[2] = input.nextInt();
            if(select[2] > 9){
                System.out.println("Fallastes, Pierdes un punto");
                PuntuacionJ1--;
            }else{
                if(select[2] != arquero[f]){
                    gol();
                    PuntuacionJ1++;
                }else{
                    cls();
                    System.out.println("Fallastes");
                    pause(1000);
                }
            }
        }
    }
    public static void Juego2(){
        for(int i = 0; i < 5; i++){
            arquero[i] = rand.nextInt(9 - 1 + 1) + 1;
        }
        for(int f = 0; f < 5; f++){
            System.out.println("J1 Patea la pelota");
            arco();
            select[2] = input.nextInt();
            if(select[2] > 9){
                System.out.println("Fallastes, Pierdes un punto");
                PuntuacionJ1--;
            }else{
                if(select[2] != arquero[f]){
                    gol();
                    PuntuacionJ1++;
                }else{
                    cls();
                    System.out.println("Fallastes");
                    pause(1000);
                }
            }
            System.out.println("J2 Patea la pelota");
            arco();
            select[3] = input.nextInt();
            if(select[3] > 9){
                System.out.println("Fallastes, Pierdes un punto");
                PuntuacionJ2--;
            }else{
                if(select[3] != arquero[f]){
                    gol();
                    PuntuacionJ2++;
                }else{
                    cls();
                    System.out.println("Fallastes");
                    pause(1000);
                }
            }
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
    public static void gol(){
        System.out.println("                                           ,--,    ");
        System.out.println("                ,----..       ,----..   ,---.'|    ");
        System.out.println("  ,----..      /   /   |     /   /   |  |   | :    ");
        System.out.println(" /   /   |    /   .     :   /   .     : :   : |    ");
        System.out.println("|   :     :  .   /   ;.  | .   /   ;.  ||   ' :    ");
        System.out.println(".   |  ;. / .   ;   /  ` ;.   ;   /  ` ;;   ; '    ");
        System.out.println(".   ; /--`  ;   |  ; | ; |;   |  ; | ; |'   | |__  ");
        System.out.println(";   | ;  __ |   :  | ; | '|   :  | ; | '|   | :.'| ");
        System.out.println("|   : |.' .'.   |  ' ' ' :.   |  ' ' ' :'   :    ; ");
        System.out.println(".   | '_.' :'   ;  |; /  |'   ;  |; /  ||   |  ./  ");
        System.out.println("'   ; : |  | |   |  ',  /  |   |  ',  / ;   : ;    ");
        System.out.println("'   | '/  .'  ;   :    /    ;   :    /  |   ,/     ");
        System.out.println("|   :    /     |   | .'      |   | .'   '---'      ");
        System.out.println(" |   | .'       `---`         `---`                ");
        System.out.println("  `---`                                            ");
        pause(1500);
    }
    public static void desempate(){
        while(PuntuacionJ1 == PuntuacionJ2){
            for(int i = 0; i < 3; i++){
                arquero[i] = rand.nextInt(9 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arco();
                select[2] = input.nextInt();
                if(select[2] != arquero[f]){
                    gol();
                    PuntuacionJ1++;
                }else{
                    cls();
                    System.out.println("Fallastes");
                    pause(1000);
                }
            }
        }
    }
}
