package ejercicioT3;
import java.util.Scanner;

public class EjercicioT3{
  public static void main (String[] args){
    int option = 0;
    Scanner teclado;
    do{
  
      menu();
      option = teclado.nextInt();
      switch(option){
        case 1:
          tiempo();
      }

      
    }while(option!=5);
  }
  private static void menu(){
    System.out.print("1. El tiempo.");
    System.out.print("2. El tiempo mejorado.");
    System.out.print("3. Nombre del mes.");
    System.out.print("4. Tiempo de cocción.");
    System.out.print("5. La nómina.");
    System.out.print("6. Salir. ");
    
  }
  private static void tiempo(Scanner teclado){
    System.out.println("Introduzca una temperatura en grados Celsius: ");
    double temperatura = teclado.nextDouble();
    if(temperatura < 2){
      System.out.println()
    }
  }
  
  private static void tiempoCoccion(Scanner teclado){
   // System.
  }


}