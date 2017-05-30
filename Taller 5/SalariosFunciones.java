/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarios.funciones;

import java.util.Scanner;

/**
 *
 * @author note
 */
public class SalariosFunciones {

    final static int empleados = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas[] = new int[empleados];
        int salario[] = new int[empleados];

        ingresarHoras(horas);
        HorasExtras(horas, salario);
        System.out.println("El salario de cada empleado es: ");
        salario(horas,salario);
    }

    public static void ingresarHoras(int[] X) {
        Scanner sc = new Scanner(System.in);
        int empleado = 1;
        for (int i = 0; i < empleados; i++) {
            System.out.println("ingrese horas trabajadas por el empleado " + empleado);
            X[i] = sc.nextInt();
            empleado++;
        }
    }

    public static void HorasExtras(int[] X, int[] Y) {
        Scanner sc = new Scanner(System.in);
        int empleado = 1;
        int horasEx;
        int horasExtras = 0;
        int pago;
        int salario = 0;
        int empleadoHoraExtra = 0;
        for (int i = 0; i < empleados; i++) {
            if (X[i] > 40) {
                
                empleadoHoraExtra = empleado;
                horasEx = X[i] - 40;
                horasExtras = horasEx;
                System.out.println("");
                System.out.println("horas extras del empleado " + (i+1) + ": " + horasExtras);
                if (horasExtras <= 3) {
                    pago = 2000;
                    salario = 2000 * horasExtras;
                }
                if ((horasExtras > 3) && (horasExtras <= 7)) {
                    pago = 3000;
                    salario = 3000 * horasExtras;
                }
                if (horasExtras > 7) {
                    pago = 3500;
                    salario = 3500 * horasExtras;
                }
                Y[i] = salario;
            }
            empleado++;
        }
    }

    public static void salario(int X[], int Y[]) {
        int pago;
        int salario;
        int empleado = 1;
        int horas = 0;
        int horasEx = 0;
        int horaNormal = 0;
        for (int i = 0; i < empleados; i++) {
            horaNormal = X[i];
            if (X[i] > 40) {
                horasEx = X[i] - 40;
                horas = X[i] - horasEx;
                horaNormal = horas; 
            }   
            pago = 5000 * horaNormal;
            salario = pago;
            Y[i] = Y[i] + salario;
            System.out.println("Empleado " + empleado + ": " + Y[i]);
            empleado++;
        }
    }
}
