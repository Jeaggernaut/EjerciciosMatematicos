package aritmetica;

import java.util.Scanner;

public class Resta {
    private double minuendo;
    private double sustraendo;

    public Resta(double minuendo, double sustraendo){
        this.minuendo = minuendo;
        this.sustraendo= sustraendo;
    }

    public double restaNumeros(){
        return this.minuendo - this.sustraendo;
    }

    public static void panelIngresoValores(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n----------------------------------------------------" +
                "\n---Programa para restar numeros(usando la consola)---" +
                "\n----------------------------------------------------");

        System.out.print("Ingresa el primer valor: ");
        double numero1 = Double.parseDouble(entrada.nextLine());

        System.out.print("Ingresa el segundo valor: ");
        double numero2 = Double.parseDouble(entrada.nextLine());

        Resta resta = new Resta(numero1,numero2);

        //llamamos al metodo
        double resultado = resta.restaNumeros();

        System.out.printf("""
                ---------------------
                El resultado es: %.2f
                """,resultado);

    }

    public static void main(String[] args){
        Resta.panelIngresoValores();
    }
}