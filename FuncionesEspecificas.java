//Clase Hija
package segundoparcial;

public class FuncionesEspecificas extends FigurasGeometricas {
    
 
    public float areaEsfera(float r){ 
    float area = (pi*4*(r*r));
    return area;
    }
    
    public float volumenEsfera(float r){
    float volumen=((4*pi*(r*r*r))/3);
        return volumen;
    }
    
}
