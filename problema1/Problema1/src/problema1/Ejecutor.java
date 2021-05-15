/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author nixon
 */
public class Ejecutor {

    public static void main(String[] args) {
        Escuela e1 = new Escuela("Nixon", 8.23, 8.93, 7.45);
        e1.establecerPromedio();
        Escuela e2 = new Escuela("Albert", 9.81, 9.34, 8.34);
        e2.establecerPromedio();
        //Primer estudiante
        System.out.printf("%s\n", e1);
        System.out.println("======================================");
        //Segundo estudiante:
        System.out.printf("%s\n", e2);
    }
}
