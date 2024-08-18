package utp.edu.pe.poo;

import java.util.Scanner;
public class Cajero {

    public static void main(String[] args) {
        double cuenta = 0;
        boolean  apagado = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Realizar un depósito o un retiro");
            System.out.println("Para depósito ingrese [1] ");
            System.out.println("Para retiro ingrese [2]");
            int opcion = scanner.nextInt();
            double monto = 0;
            switch(opcion){
                case 1:
                    System.out.println("DEPOSITO");
                    System.out.println("Ingrese el monto a depositar");
                    monto = scanner.nextDouble();
                    cuenta+=monto;
                    break;
                case 2:
                    System.out.println("RETIRO");
                    System.out.println("Ingrese el monto a retitar");
                    monto = scanner.nextDouble();
                    if(monto<=cuenta){
                        cuenta-=monto;
                    } else
                    {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
            }
            System.out.println("¿Desea realizar otra transacción? S/N");
            char respuesta = scanner.next().charAt(0);
            if(respuesta=='N' || respuesta=='n'){        
                System.out.println("El saldo disponible es " + cuenta);
                apagado=false;
            }
        } while(apagado);
    }
}
