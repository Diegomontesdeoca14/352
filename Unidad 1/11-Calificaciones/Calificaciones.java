package calificaciones;

import java.util.Scanner;

public class calificaciones{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numNotas;
        double[] notas;
        double suma=0, promedio, max, min;
        int numAprobados=0, numSuspendidos=0;
        //---
        System.out.print("Numero de notas: ");
        numNotas = leer.nextInt();
        notas = new double[numNotas];

        System.out.println("Ingrese un total de: " + numNotas + " notas");
        for(int i=0; i<notas.length; i++){
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i] = leer.nextDouble();
        }

        //Hacemos los calculos deseados..
        System.out.println("Las Notas a evaluar: ");
        for (double nota : notas) {
            System.out.print(nota + "   ");
        }

       
        //alumnos reprobados
        for (double nota : notas) {
            if(nota >= 6) {
                numAprobados++;
            } else {
                numSuspendidos++;
            }
        }
        System.out.println("Alumnos reprobados: " + numSuspendidos);

        //nota mas alta
        max = notas[0];
        for (int i=0; i<notas.length; i++) {
            if(notas[i] > max){
                max = notas[i];
            }
        }

    }
}