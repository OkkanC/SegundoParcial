//Clase padre
package segundoparcial;

public class FigurasGeometricas {
    
    protected float pi;
    
    FigurasGeometricas(){
    this.pi=(float) 3.14;
    }
    
    //Para La esfera o círculo
    public float radio(float D){
    float radio=D/2;
    return radio;
    }
    
    public float areaCirculo(float r){
     float area=pi*r*r;
     return area;
    }
    
    public float diametroCirculo(float P){
        float diametro=P/pi;
    return diametro;
    }
 
    public float perimetroCirculo(float D){
        float perimetro=pi*D;
    return perimetro;
    }
    
}
