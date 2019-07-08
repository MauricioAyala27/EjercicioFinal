
package com.clases;

/**
 *
 * @author educacion
 */
public class CuentaBancaria {
    
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public CuentaBancaria(CuentaBancaria CuentaBancaria){
        this.nombreCliente = CuentaBancaria.nombreCliente;
        this.numeroCuenta = CuentaBancaria.numeroCuenta;
        this.tipoInteres = CuentaBancaria.tipoInteres;
        this.saldo = CuentaBancaria.saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}
