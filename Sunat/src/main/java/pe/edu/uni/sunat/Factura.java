
package pe.edu.uni.sunat;

/**
 *
        * @author marina
        */
public class Factura {
    private final EstrategiaCalculoTributario estrategia; 
    
    public Factura(EstrategiaCalculoTributario estrategia) {
        this.estrategia = estrategia;
    }
    
    public double calculartotal(double base){
        double descuento = estrategia.calcular(base);
        return base = descuento;
    }
}
