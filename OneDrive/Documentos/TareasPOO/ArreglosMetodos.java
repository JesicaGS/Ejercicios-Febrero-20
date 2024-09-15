import java.util.Scanner;

public class ArreglosMetodos {
    public int findMax(int[] maximo) {
        int valorMaximo = maximo[0];
        for (int i = 1; i < maximo.length; i++) {
            if (maximo[i] > valorMaximo) {
                valorMaximo = maximo[i];
            }
        }
        return valorMaximo;
    }

    public int findMin(int[] minimo) {
        int valorMinimo = minimo[0];
        for (int i = 1; i < minimo.length; i++) {
            if (minimo[i] < valorMinimo) {
                valorMinimo = minimo[i];
            }
        }
        return valorMinimo;
    }

    public void printArray(int[] arreglo) {
        System.out.println("Valores del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArreglosMetodos metodos = new ArreglosMetodos();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = entrada.nextInt();
        int[] arreglo = new int[size];

        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        metodos.printArray(arreglo);

        int max = metodos.findMax(arreglo);
        int min = metodos.findMin(arreglo);


        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}