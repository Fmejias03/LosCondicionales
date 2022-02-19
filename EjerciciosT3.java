import java.util.Scanner;

public class EjerciciosT3 {
    public static void main (String[] args){
        int option;
        Scanner teclado = new Scanner(System.in);
        do{

            System.out.println("Elija uno de los siguientes ejercicios.");
            menu();
            option = teclado.nextInt();
            switch(option){
                case 1:
                    tiempo(teclado);
                    break;
                case 2:
                    tiempoMejorado(teclado);
                    break;
                case 3:
                    mesCorrespondiente(teclado);
                    break;
                case 4:
                    tiempoCoccion(teclado);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("El valor introducido no es válido.");
                    break;

            }


        }while(option!=6);
    }
    private static void menu(){
        System.out.println("1. El tiempo.");
        System.out.println("2. El tiempo mejorado.");
        System.out.println("3. Nombre del mes.");
        System.out.println("4. Tiempo de cocción.");
        System.out.println("5. La nómina.");
        System.out.println("6. Salir. ");

    }
    private static void tiempo(Scanner teclado){
        System.out.println("Introduzca una temperatura en grados Celsius: ");
        double temperatura = teclado.nextDouble();
        if(temperatura < 2){
            System.out.println("Riesgo de hielo.");
        }else{
            System.out.println("OK. Ningún riesgo de hielo.");
        }
    }

    private static void tiempoMejorado(Scanner teclado){
        System.out.println("Introduzca una temperatura en grados Celsius: ");
        double temperatura = teclado.nextDouble();
        if(temperatura < 2){
            System.out.println("Riesgo de hielo.");
        }else if (temperatura >= 2 && temperatura < 15){
            System.out.println("Hace frío.");
        }else if(temperatura >= 15 && temperatura < 30){
            System.out.println("Buena temperatura.");
        }else{
            System.out.println("Demasiado calor.");
        }
    }

    private static void mesCorrespondiente(Scanner teclado){
        System.out.print("Introduzca un número entre 1 y 12: ");
        int valorIntroducido = teclado.nextInt();
        switch(valorIntroducido){
            case 1:
                System.out.println("El mes correspondiente es Enero.");
                break;
            case 2:
                System.out.println("El mes correspondiente es Febrero.");
                break;
            case 3:
                System.out.println("El mes correspondiente es Marzo.");
                break;
            case 4:
                System.out.println("El mes correspondiente es Abril.");
                break;
            case 5:
                System.out.println("El mes correspondiente es Mayo.");
                break;
            case 6:
                System.out.println("El mes correspondiente es Junio.");
                break;
            case 7:
                System.out.println("El mes correspondiente es Julio.");
                break;
            case 8:
                System.out.println("El mes correspondiente es Agosto.");
                break;
            case 9:
                System.out.println("El mes correspondiente es Septiembre.");
                break;
            case 10:
                System.out.println("El mes correspondiente es Octubre.");
                break;
            case 11:
                System.out.println("El mes correspondiente es Noviembre.");
                break;
            case 12:
                System.out.println("El mes correspondiente es Diciembre.");
                break;
            default:
                System.out.println("El valor introducido no es válido.");
                break;
        }
    }

    private static void tiempoCoccion(Scanner teclado){
        int tipo;
        int modo;
        int resultado = 0;
        System.out.println("Tipo de carne: ");
        teclado.nextLine();

        System.out.println("1. Vacuno \n2. Cordero ");
        tipo = teclado.nextInt();

        System.out.println("Modo de cocción: ");
        System.out.println("1. Casi crudo \n2. Al punto\n 3. Bien hecho");
        modo = teclado.nextInt();

        System.out.print("Introduzca el peso en gramos: ");
        int peso = teclado.nextInt();

        if(tipo == 1){
            switch (modo){
                case 1:
                    resultado = peso*10*60/500;
                    break;
                case 2:
                    resultado = peso*17*60/500;
                    break;
                case 3:
                    resultado = peso*25*60/500;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado) ;
        }
        else if (tipo == 2){
            switch (modo){
                case 1:
                    resultado = peso*15*60/400;
                    break;
                case 2:
                    resultado = peso*25*60/400;
                    break;
                case 3:
                    resultado = peso*40*60/400;
                    break;
                default:
                    System.out.println("El modo introducido no es correcto");
            }
            System.out.println("El tiempo de cocción es: " + resultado) ;
        }
        else{
            System.out.println("El tipo de carne introducido no es correcto.");
        }



    }


}