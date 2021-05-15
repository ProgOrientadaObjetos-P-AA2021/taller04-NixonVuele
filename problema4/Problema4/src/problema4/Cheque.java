/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author nixon
 */
public class Cheque {

    private String nombre;
    private String banco;
    private double valorCheque;
    private double comision;

    public Cheque(String nom, String ban, double valCheque) {
        nombre = nom;
        banco = ban;
        valorCheque = valCheque;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerBanco(String ban) {
        banco = ban;
    }

    public void establecerValorCheque(double valCheque) {
        valorCheque = valCheque;
    }

    public void calcularComision() {
        comision = (valorCheque * 0.003) / 100;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerCalcularComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadenaFinal;
        cadenaFinal = String.format("Las propiedades del cheque son:\n"
                + "Nombre del cliente: %s\nNombre del Banco: %s\n"
                + "Valor del cheque: %.2f\nComision del Banco: %.2f\n",
                obtenerNombre(), obtenerBanco(), obtenerValorCheque(),
                obtenerCalcularComision());
        return cadenaFinal;
    }

}
