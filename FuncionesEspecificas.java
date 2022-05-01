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
    
    public float areaCubo(float a){
    float area=6*(a*a);
        return area;
    }
    
    public float volumenCubo(float a){
    float volumen=a*a*a;    
        return volumen;
    }
    
    
    public float volumenHexagonal(float b, float h){
    float volumen = b*h;
        return volumen;
    }
}
