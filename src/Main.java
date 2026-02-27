import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros=new int[3][3];
        System.out.println("Dime los datos del array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numeros[i][j]=sc.nextInt();
            }
        }
        //Muestra el array en formato tabla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j]+ " ");
            }
            System.out.println();
        }
        //Hace la suma de las filas
        for (int i = 0; i < 3; i++) {
            int sumaFilas=0;
            for (int j = 0; j < 3; j++) {
                sumaFilas+=numeros[i][j];
            }
            System.out.println("Suma de la fila "+ (i+1)+ " es " + sumaFilas);
        }
//Hace la suma de la columna
        for (int i = 0; i < 3; i++) {
            int sumaColumnas=0;
            for (int j = 0; j < 3; j++) {
                sumaColumnas+=numeros[j][i];
            }
            System.out.println("Suma de la columna "+ (i+1)+ " es " + sumaColumnas);
        }
        int sumaDiagonal=0;
        //Hace la suma de la diagonal principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i]==numeros[j]) {
                    sumaDiagonal+=numeros[i][j];
                }
            }
        }
        System.out.println("La suma diagonal es "+sumaDiagonal);
        }
    }
