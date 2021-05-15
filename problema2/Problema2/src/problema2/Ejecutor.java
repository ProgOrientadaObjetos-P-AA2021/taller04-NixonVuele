/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Nixon", "Vuele", 350.50, "1123231232");
        p1.calcularSueldoTotal();
        Profesor p2 = new Profesor("Fausto", "Cedillo", 500.60, "1124324324");
        p2.calcularSueldoTotal();
        //Primer profesor:
        System.out.printf("%s\n", p1);
        System.out.println("======================================");
        //Segundo profesor:
        System.out.printf("%s\n", p2);
    }
    
}