import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
        // El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.
        System.out.println("Ingrese cuantos numeros desea imprimir: ");
        Integer num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese numero " + (i+1) + ": ");
            Integer valor = Integer.parseInt(sc.nextLine());
            if (valor > 0) {
                System.out.println("Soy mayor");
            }
            else if (valor == 0) {
                System.out.println("Soy igual");
            }
            else{
                    System.out.println("Soy menor");
                }
            System.out.println("hola");
        }
    }

}