
package com.vistas;

import com.clases.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author educacion
 */
public class VistaCuenta {

    public static void main(String[] args) {
       
        CuentaBancaria cb = new CuentaBancaria();
        Scanner sn = new Scanner(System.in);
        
        try{
        System.out.println("::::::::::BIENVENIDO::::::::::");
        System.out.println("Ingrese el nombre del cliente: ");
        cb.setNombreCliente(sn.nextLine());
        System.out.println("Ingrese el numero de cuenta: ");
        cb.setNumeroCuenta(sn.nextLine());
        System.out.println("Ingrese el tipo de interes: ");
        cb.setTipoInteres(Double.parseDouble(sn.nextLine()));
        System.out.println("Ingrese el saldo del cliente: ");
        cb.setSaldo(Double.parseDouble(sn.nextLine()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("\n\n::::::::::DATOS DE LA CUENTA::::::::::");
        System.out.println("\nNombre Cliente: " + cb.getNombreCliente() + "\n" +
                           "Numero de Cuenta " + cb.getNumeroCuenta() + "\n" +
                           "Tipo de Interes: " + cb.getTipoInteres() + "\n" + 
                           "Saldo: " + cb.getSaldo());
        }
        catch(Exception e){
            System.out.println("Ocurrio un error " + e.toString());
        }
        
    }
    
}
