public static void main (String[] args)  {
  // Declaracion de variables
int numero, mult3, mult5;
BufferedReader bufEntrada= new BufferedReader  (new InputStreamReader  (System.in));


System.out.print("Ingrese un numero");
numero=Integer.parseInt(bufEntrada.readLine());


mult3= numero%3;
mult5= numero%5;


if(mult3==0) {
    System.out.println("TRI");
}if  (MULT5==0) {
System.out.println("FIV");
}
if (mult3==0) && mult5==0){
System.out.println("TRIFIV");
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class NewClass {
    
}
