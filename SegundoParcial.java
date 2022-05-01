
package segundoparcial;

import java.util.Scanner;

public class SegundoParcial {

    public static void main(String[] args) {
      
        int opcion, opcion2;
        float a, b, h, r, P, D;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------");
        System.out.println("    Bienvenido al Programa de Figuras Geométricas   ");
        System.out.println("    1. Esfera");
        System.out.println("    2. Cubo");
        System.out.println("    3. ");
        System.out.println("----------------------------------------------------");
        System.out.println("Ingresa el número de la opción que quieres: "); opcion = entrada.nextInt();
        
        FigurasGeometricas padre = new FigurasGeometricas();
        FuncionesEspecificas hija = new FuncionesEspecificas();
        
        switch(opcion){
  
        case 1:
          
           System.out.println("\n\n");
           System.out.println("------Esfera/Círculo--------");
           System.out.println("Funciones Disponibles para buscar:");
           System.out.println("1. Radio");
           System.out.println("2. Área");
           System.out.println("3. Perímetro");
           System.out.println("4. Diámetro");
           System.out.println("5. Volumen");
           System.out.println("Ingresa el número de la opción que deseas buscar:");
           opcion2=entrada.nextInt();
            
                switch(opcion2){
                    
                    case 1 -> {
                        System.out.println("\n\nIngresa el Diámetro: "); D=entrada.nextFloat();
                        System.out.println("Tu radio es de: "+hija.radio(D));
                }
                    
                    case 2 -> {
                        System.out.println("\n\nIngresa el Radio: "); r=entrada.nextFloat();
                        System.out.println("Tu área del Círculo es de: "+hija.areaCirculo(r));
                        System.out.println("Tu área de La Esfera es de: "+hija.areaEsfera(r));
                }
                    
                   case 3 -> {
                       System.out.println("\n\nIngresa el Diámetro: "); D=entrada.nextFloat();
                       System.out.println("Tu Perímetro es: "+hija.perimetroCirculo(D));
                } 
                   
                   case 4 -> {
                       System.out.println("\n\nIngresa el Perímetro: "); P=entrada.nextFloat();
                       System.out.println("Tu Diámetro es: "+hija.diametroCirculo(P));
                }
                   
                   case 5 -> {
                       System.out.println("\n\nIngresa el Radio: "); r=entrada.nextFloat();
                       System.out.println("Tu Volumen es: "+hija.volumenEsfera(r));
                }
                   
                }
        break;

        
        case 2:
            System.out.println("\n\n");
           System.out.println("------Cubo/Cuadrado--------");
           System.out.println("Funciones Disponibles para buscar:");
           System.out.println("1. Área");
           System.out.println("2. Perímetro");
           System.out.println("3. Volumen");
           System.out.println("Ingresa el número de la opción que deseas buscar:");
           opcion2=entrada.nextInt();
           
           switch(opcion2){
               case 1:
               break;   
               
               case 2:
               break;   
               
               case 3:
                   
               break;    
           }
           
        break;
        
        case 3:
        break;
        
     }
    
    }
}
        /*
        case 1:
        break;
      */ 