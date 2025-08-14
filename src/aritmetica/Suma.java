package aritmetica;

import java.util.Scanner;

public class Suma {
    private double operando1;
    private double operando2;

    public Suma(double operando1, double operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double sumaNumeros(){
        return this.operando1 + this.operando2;
    }

    public static void panelIngresoValores(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n----------------------------------------------------" +
                "\n---Programa para sumar numeros(usando la consola)---" +
                "\n----------------------------------------------------");

        System.out.print("Ingresa el primer valor: ");
        double numero1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Ingresa el segundo valor: ");
        double numero2 = Double.parseDouble(entrada.nextLine());

        Suma suma = new Suma(numero1,numero2);

        //llamamos al metodo
        double resultado = suma.sumaNumeros();

        System.out.printf("""
                ---------------------
                El resultado es: %.2f
                """,resultado);

    }

    public static void main(String[] args){
        Suma.panelIngresoValores();
    }
}
