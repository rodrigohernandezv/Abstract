/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Familia
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TransImplementado mitrans=new TransImplementado();
        mitrans.dato=6;
        System.out.println(mitrans.kelvin2celcius());
        System.out.println(mitrans.grado2radian());
    }
    
}
