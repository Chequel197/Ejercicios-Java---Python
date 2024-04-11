package aplicacion_bancaria;

import java.lang.invoke.ConstantBootstraps;
import java.util.Scanner;

public class BancariaApp {
    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            double saldo = 1699.99;
            double monto = 0;
            double total = 0;
            int opcion = 0;
            int i = 0;
            // Se inicializan las variables
            do{
    System.out.println(" ******************************* \n Nombre del cliente: Tony Stark \n Tipo de cuenta: corriente \n Saldo Disponible: "+ saldo +"\n ******************************* \n ** Escriba el numero de la opcion deseada ** \n 1 - Consultar saldo \n 2 - retirar \n 3 - Depositar  \n 9 - Salir");
        opcion = teclado.nextInt();
// se usa el DO WHILE para ejecutar el codigo e verificar 
    switch (opcion) {
        case 1:
        // se muestra en pantalla el saldo del usuario
            System.out.println(" \n Su saldo es de: " + saldo + "\n");
            break; 
        case 2:
        // se le pide que digite el monto a retirar y se realiza la resta del monto con el saldo de la cuenta
            System.out.println("\nDigite el monto a retirar: \n");
            monto = teclado.nextInt();
            if (saldo < monto){
                System.out.println("\nSaldo insuficiente\n"); //aqui se evalua si el monto digitado es mayor al saldo que tiene la cuenta
            } else {                                          //si es asi, el monto no se retira y se envia un mensaje a pantalla indicando que no tiene el saldo suficiente
                System.out.println("\nRetiro completado\n");  //caso contrario se le resta el monto pedido
                saldo = saldo - monto;
            }
            break;
        case 3:
        // aqui se le pide que digite el monto a ingresar y se realiza la suma del monto con el saldo de la ceuenta
        System.out.println("\nDigite el monto a depositar\n");
        monto = teclado.nextInt();
        System.out.println("Deposito completado\n");
        saldo = saldo + monto;
            break;
        case 9:
        // Esta opcion hace que se le sume 2 a la variable "i" para que el ciclo WHILE se termine
        i = i +2;
        System.out.println("\n*******************************\nGRACIAS POR PREFERIRNOS!!\n*******************************\n");
            break;
        default:
        // aqui se imprime en pantalla, si el usuario ingresa una opcion que no se encuentre en el menu
        System.out.println("\nLosiento pero no contamos con dicha accion, intentelo de nuevo\n");
            break;
    }
            } 
            while(i < 2);
    }
}