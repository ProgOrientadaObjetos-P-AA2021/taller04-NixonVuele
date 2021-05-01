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
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cheque ch1 = new Cheque("Nixon Vuele", "Banco de Loja", 3456.34);
        Cheque ch2 = new Cheque("Wendy Vuele", "Banco del Pacifico", 796.67);
        ch1.calcularComision();
        ch2.calcularComision();
        //Primer cheque:
        System.out.printf("%s\n", ch1);
        System.out.println("===============================================");
        //Segundo cheque
        System.out.printf("%s\n", ch2);
    }

}
