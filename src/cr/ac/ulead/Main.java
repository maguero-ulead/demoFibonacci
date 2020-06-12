package cr.ac.ulead;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public static void main(String[] args) {
        int numero = input.nextInt();
        output.println(calcularFibonacci(numero));
        int arreglo[] = { 2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60};
        if (busquedaBinaria(arreglo, numero)) {
            output.println("Esta");
        } else {
            output.println("NO Esta");
        }
    }

    private static boolean busquedaBinaria(int [] arreglo, int numero) {
        int size = arreglo.length;
        int middle = size /2;
        if (arreglo[middle] == numero) {
            return true;
        } else if (size == 1) {
            return false;
        } else if (arreglo[middle] >  numero) {
            return busquedaBinaria(Arrays.copyOfRange(arreglo, 0, middle),numero);
        } else {
            return busquedaBinaria(Arrays.copyOfRange(arreglo, middle + 1, size),numero);
        }
    }

    private static int calcularFibonacci(int numero) {
        if (numero == 0){
            return 0;
        }
        if (numero == 1) {
            return 1;
        } else {
            return calcularFibonacci(numero -1) + calcularFibonacci(numero -2);
        }

    }
}
