package cuenta;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        // crea objeto Cuenta
        Cuenta cuenta1 = new Cuenta(50.00);
        // crea objeto Cuenta
        Cuenta cuenta2 = new Cuenta(-7.53);
        double montoDeposito;
        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.getSaldo());

        // crea objeto Scanner para pbtener la entrada de la ventana 
        Scanner datos = new Scanner(System.in);
        System.out.println("Escriba el monto a depositar para cuenta1: ");
        montoDeposito = datos.nextDouble();

        // muestra los saldos
        System.out.printf("Saldo de cuenta1: $%.2f\n",
                cuenta1.getSaldo());
        // suma el monto de la cuenta1
        cuenta1.abonar(montoDeposito);

        //muestra los saldos
        System.out.printf("Su abono a la cuenta1 es: $%.2f \nEl saldo actual es: $%.2f\n",
                montoDeposito, cuenta1.getSaldo());
        System.out.println("Ingresa la cantidad que desea retirar al saldo de la cuenta1: ");
        montoDeposito = datos.nextDouble();

        // restar el monto a la cuenta1.
        cuenta1.Cargar(montoDeposito);
        // muestra un mensaje con la cantidad a cargar
        System.out.printf("Usted cargo la cantidad de: $%.2f\n",
                montoDeposito, cuenta1.getSaldo());
    }
    
    
}
