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
    
    public float areaCuadrado(float a){
    float area=a*a;
        return area;
    }
    
    public float perimetroCuadrado(float a){
    float perimetro = a+a+a+a;
        return perimetro;
    }
    
    
    public float areaDeLaBase(float P, float a){ 
        float aB=(P*a)/2;
    return aB;  
    }
    
    public float perimetroHexagonal(float b){
    float perimetro = b*6;    
    return perimetro;
    }
}
