import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        select[0] = 0;
        do {
            cls();
            Logo();//Llamada a la funcion "Logo"
            menuPrincipal();//LLamada a la funcion "menuPrincipal"
        } while (select[0] != 3);
    }

    public static Random rand = new Random();
    public static Scanner input = new Scanner(System.in);//Crea un metodo de entrada para el usuario
    public static int[] select = new int[7];//Variable utilizada para interactuar con los menus.
    public static int[] arquero = new int[10];
    public static int Equipo1, Equipo2;
    public static int PuntuacionJ1;//Almacena la puntuacion del jugador 1
    public static int PuntuacionJ2;//Almacena la puntuacion del jugador 2
    public static String nameJ1 = "Jugador 1", nameJ2 = "Jugador 2";

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
        System.out.println("Presione 1) Jugar \n         2) Opciones \n         3) Salir");
        select[0] = input.nextInt();// Asigna un valor al Array Publico select
        switch(select[0]){
            case 1:
            if(select[5] <= 0){
                select[5] = 1;
            }
            seleccionModalidad();
            break;

            case 2:
            opciones();
            break;

            case 3:
            System.exit(1);
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
        Juego();
        cls();
        System.out.println("La puntuacion de " + nameJ1 + " es " + PuntuacionJ1 * select[5]);
        pause(3000);
        PuntuacionJ1 = 0;
    }
    public static void multijugador(){
        cls();
        seleccionDeEquipo();
        Juego();
        System.out.println("La puntuacion de " + nameJ1 + " es " + PuntuacionJ1);
        pause(1500);
        System.out.println("La puntuacion de " + nameJ2 + " es " + PuntuacionJ2);
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
    public static void Juego(){
        switch(select[5]){
            case 1:
            Easy();
            break;
            case 2:
            Normal();
            break;
            case 3:
            Hard();
            break;
        }
    }
    public static void Hard(){
        if(select[1] == 1){
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(4 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoHard();
                select[2] = input.nextInt();
                if(select[2] > 4){
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
        }else{
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(4 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoEasy();
                select[2] = input.nextInt();
                if(select[2] > 4){
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
                arcoEasy();
                select[3] = input.nextInt();
                if(select[3] > 4){
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
    }
    public static void Normal(){
        if(select[1] == 1){
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(6 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoHard();
                select[2] = input.nextInt();
                if(select[2] > 6){
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
        }else{
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(6 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoEasy();
                select[2] = input.nextInt();
                if(select[2] > 6){
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
                arcoEasy();
                select[3] = input.nextInt();
                if(select[3] > 6){
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
    }
    public static void Easy(){
        if(select[1] == 1){
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(9 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoHard();
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
        }else{
            for(int i = 0; i < 5; i++){
                arquero[i] = rand.nextInt(9 - 1 + 1) + 1;
            }
            for(int f = 0; f < 5; f++){
                System.out.println("J1 Patea la pelota");
                arcoEasy();
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
                arcoEasy();
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
    public static void arcoEasy(){
        System.out.println("  ______________ \n" 
                           +"|':.1___2___3__|Z:.\n"
                           +"|  |4   5   6  |  |\n"
                           +"|  |7___8___9__|__|\n" 
                           +"|,'            |,'");
    }
    public static void acroNormal(){
        System.out.println("  ______________ \n" 
                           +"|':.1__2___3___|Z:.\n"
                           +"|  |           |  |\n"
                           +"|  |4__5___6___|__|\n" 
                           +"|,'            |,'");
    }
    public static void arcoHard(){
        System.out.println("  ______________ \n" 
                           +"|':.1_______2__|Z:.\n"
                           +"|  |           |  |\n"
                           +"|  |___________|__|\n" 
                           +"|,' 3       4  |,'");
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
                arcoEasy();
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
    public static void opciones(){
        do{
            System.out.println("Que deseas configurar? \n 1)Nombre del jugador 1 \n 2)Nombre del jugador 2 \n 3)Dificultad \n 4)Creditos \n 5)Atras");
            select[4] = input.nextInt();
            switch(select[4]){
                case 1:
                    cls();
                    System.out.println("Ingresa el nombre del Jugador 1");
                    nameJ1 = input.next();
                    cls();
                    System.out.println("El nombre del Jugador 1 ahora es " + nameJ1);
                    cls();
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del Jugador 2");
                    nameJ2 = input.next();
                    cls();
                    System.out.println("El nombre del Jugador 2 ahora es " + nameJ2);
                    cls();
                    break;
                case 3:
                    cls();
                    System.out.println("Elige una dificultad \n 1)Facil \n 2)Normal \n 3)Dificil");
                    select[5] = input.nextInt();
                    if(select[5] == 1){
                        cls();
                        System.out.println("La dificultad ahora es [Facil]");
                        cls();
                    }else{
                        if(select[5] == 2){
                            cls();
                            System.out.println("La dificultad ahora es [Normal]");
                            cls();
                        }else{
                            if(select[5] == 3){
                                cls();
                                System.out.println("La dificultad ahora es [Dificil]");
                                cls();
                            }
                        }
                    }
                    break;
                case 4:
                
                break;
            }
        }while(select[4] != 4);
    }
}