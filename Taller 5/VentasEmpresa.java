/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.empresa;
import java.util.Scanner;
/**
 *
 * @author note
 */
public class VentasEmpresa {
    static final int dias = 30;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ventas [] = new int [dias];
        
        ingresar(ventas);
        System.out.println("La mayor venta fue: "+ mayorVenta(ventas) + " del dia " + DiaMayorVenta(ventas));
        System.out.println("Las ventas totales del mes fueron: " + ventaTotalMes(ventas));
        System.out.println("Los dias que tuvieron ventas inferiores a 10.000 fueron: ");
        ventasInferiores(ventas);
        System.out.println("La remuneracion del mes de abril para el empleado es: " + remuneracion(ventas));
        
        
    }
    public static void ingresar (int []X){
        int i;
        Scanner sc = new Scanner (System.in);
        for (i = 0; i < dias; i++) {
            do {
                System.out.println("Ingresar ventas del dia: " + (i + 1));
                X[i] = sc.nextInt(); 
            } while (X[i] < 0); 
        } 
    }
    public static int mayorVenta(int []X){
        int mayor = 0;
        for (int i = 0; i < dias; i++) {
            if(X[i] > mayor){
                mayor = X[i];
            }
        }
        return mayor;
    }
    public static int DiaMayorVenta(int []X){
        int mayor = 0;
        int dia = 1;
        int diaM = 0;
        for (int i = 0; i < dias; i++) {
            if(X[i] > mayor){
                mayor = X[i];
                diaM = dia;
            }
            dia++;
        }
        return diaM;
    }
    public static int ventaTotalMes (int []X){
        int mes = 0;
        for (int i = 0; i < dias; i++) {
            mes = mes + X[i];
        }
        return mes;
    }
    public static void ventasInferiores (int []X){
        int dia = 1;
        int diaI = 0;
        int ventaInferior = 0;
        for (int i = 0; i < dias; i++) {
            if(X[i] < 10000){  
                diaI = dia;
                ventaInferior = X[i];
                System.out.println("Dia: " + diaI + " con: " + ventaInferior);
            } 
            dia++;   
        } 
    }   
    public static double remuneracion(int []X){
        int suma = 0;
        double remuneracion;
        for (int i = 0; i < dias; i++) {
            suma = suma + X[i];
        }
        remuneracion = suma * 0.01;
        return remuneracion;
    }
}
