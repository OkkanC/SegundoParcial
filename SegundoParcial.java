
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
        System.out.println("    3. Prisma Hexagonal ");
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
                   System.out.println("\n\nIngresa el valor del Lado: "); a=entrada.nextFloat();
                   System.out.println("Tu área del Cuadrado es: "+hija.areaCuadrado(a));
                   System.out.println("El área del Cubo es de: "+hija.areaCubo(a));
               break;   
               
               case 2:
                    System.out.println("\n\nIngresa el valor del Lado: "); a=entrada.nextFloat();
                     System.out.println("El perímetro es de: "+hija.perimetroCuadrado(a));
               break;   
               
               case 3:
                    System.out.println("\n\nIngresa el valor del Lado: "); a=entrada.nextFloat();
                    System.out.println("El Volumen es de: "+hija.volumenCubo(a));
               break;    
           }
           
        break;
        
        case 3:
           System.out.println("\n\n");
           System.out.println("------Prisma Hexagonal--------");
           System.out.println("Funciones Disponibles para buscar:");
           System.out.println("1. Área de la Base");
           System.out.println("2. Perímetro");
           System.out.println("3. Volumen");
           System.out.println("Ingresa el número de la opción que deseas buscar:");
           opcion2=entrada.nextInt();
           
           switch(opcion2){
           
           case 1:
                   System.out.println("\n\nIngresa el Perímetro: "); P=entrada.nextFloat();
                   System.out.println("\n\nIngresa el Apotema: "); a=entrada.nextFloat();
                   System.out.println("Tu área del la base es: "+hija.areaDeLaBase(P, a));
            break;   
            
            case 2:
                   System.out.println("\n\nIngresa el lado: "); b=entrada.nextFloat();
                   System.out.println("Tu área del la base es: "+hija.perimetroHexagonal(b));
            break;
            
            case 3:
                System.out.println("\n\nIngresa el área de la base: "); b=entrada.nextFloat();
                System.out.println("\nIngresa la altura: "); h=entrada.nextFloat();
                System.out.println("Tu área del la base es: "+hija.volumenHexagonal(b, h));
            break;
            
           }
          
        break;
      //  
     }
    
    }
}
