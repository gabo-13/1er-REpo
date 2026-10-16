        
package pe.edu.uni.sunat;

/**
 *
 * @author marina
 */
public class Main {
    public static void main(String[] args){
        double base = 1000.00;
        
        Factura normal =
                new Factura(new CalculoRus());
        
        Factura igeve =
                new Factura(new CalculoRer());
        
        Factura general =
                new Factura(new CalculoGeneral());
        
        
        System.out.println(normal.calculartotal(base));
        System.out.println(igeve.calculartotal(base));
        System.out.println(general.calculartotal(base));
    }
}
