/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorat;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;

public class CalculadoraT {

    public static void main(String[] args) {
        
        System.out.println("Otra vez bienvenida");

      
        Scanner teclado = new Scanner(System.in);
        
        double num1, num2, resultado;
        char operacion;

        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextDouble();

        System.out.print("Introduce la operación (+, -, *, /, %): ");
        operacion = teclado.next().charAt(0);

        switch (operacion) {

            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir entre 0.");
                }
                break;

            case '%':
                if (num2 != 0) {
                    resultado = num1 % num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: no se puede calcular el módulo entre 0.");
                }
                break;

            default:
                System.out.println("Error: operación no válida.");
        }

        teclado.close();
    }
}