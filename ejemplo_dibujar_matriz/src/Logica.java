
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan Ujla
 */
public class Logica {

    String[][] matrizPrincipal = new String[10][10];

    public Logica() {
        
        //inicializar matriz con cadenas vacias
        for(int i=0; i<10; i++){
            for(int j=0; j<10;j++){
                matrizPrincipal[i][j]="";
            }}

        ingresarDatos();
        //dibujarMatriz(matrizPrincipal, 2);
    }

    void ingresarDatos() {
        System.out.println("Ingrese la x");
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        System.out.println("Ingrese la y");
        Scanner scaner2 = new Scanner(System.in);
        int y = scaner2.nextInt();
        System.out.println("La coordenada ingresada es: " + x + "," + y);
        matrizPrincipal[x][y]="B";
        dibujarMatriz(matrizPrincipal,10);

    }

    

    void dibujarMatriz(String[][] matriz, int no_de_columnas) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < no_de_columnas; j++) {
                if (matriz[i][j].equals("B")) {
                    System.out.print("B|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println("");
        }
    }
}
