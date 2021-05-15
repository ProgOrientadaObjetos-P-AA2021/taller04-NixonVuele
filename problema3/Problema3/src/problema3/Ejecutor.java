/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor a1 = new Automotor("1133434", "Mercedes Bens", 1994,14030.23);
        Automotor a2 = new Automotor("1184959", "Ferrari", 2001, 47434.20);
        a1.calcularValorMatricula();
        a2.calcularValorMatricula();
        //Primer automotor
        System.out.printf("%s\n", a1);
        System.out.println("==============================================");
        //Segundo auotmotor
        System.out.printf("%s\n", a2);
    }

}
