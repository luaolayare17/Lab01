package CalculadoraLaboratorio1.pkg1;

import java.util.Scanner;
import interfaz.Intefaz;

public class  CalculadoraLaboratorio1
{ 
    public static void main(String[] args) throws InterruptedException
    { 
        Intefaz inter = new Intefaz ();
        inter.setVisible (true);
        inter.setLocationRelativeTo(null);
        
       Scanner entrada = new Scanner (System.in);
       int seleccion = 0;
  while (seleccion != 9)
     {
         System.out.println("\n¿Que operacion desea ejecutar?\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Funciones trigonometricas\n6.Raiz\n7.Potencia\n8.IVA\n9.Finalizar\n");
       seleccion = entrada.nextInt();
       
       switch(seleccion)
                {
                    case 1:
                    suma (); break;
                    case 2:
                    resta (); break;
                    case 3:
                    multiplicacion (); break;
                    case 4:
                    division (); break;
                    case 5:
                        funciones(); break;
                    case 6:
                        raiz ();break;
                    case 7:
                        potencia();break;
                    case 8:
                        IVA ();break;
                    case 9:
                        
                    /*case default:
                        System.out.println("Elección incorrecta");
            */}
      }
    }
    
    public static void suma ()throws InterruptedException
    {System.out.println("Ha elegido suma");
        float [] sumandos = new float [20]; float sumatoria = 0;
        int numeros;
         Scanner entrada = new Scanner (System.in);
        System.out.print ("Ingrese la cantidad de numeros a sumar (Maximo 20): ");
        numeros = entrada.nextInt();
        
        for (int i = 0; i < numeros ; i++)
        { System.out.print("\nIngrese el numero "+ (i+1) + ":");
            sumandos[i] = entrada.nextFloat();
        }
        for (int i = 0; i < numeros; i++)
                sumatoria += sumandos [i];
            System.out.println("La sumatoria es de: " + sumatoria);
            Thread.sleep(4000); 
    }
    
     public static void resta () throws InterruptedException
    {
        System.out.println("Ha elegido resta");
        float [] resta = new float [20]; float resultado = 0;
        int numeros;
         Scanner entrada = new Scanner (System.in);
        System.out.print ("Ingrese la cantidad de numeros a restar (Maximo 20): ");
        numeros = entrada.nextInt();
        
        for (int i = 0; i < numeros ; i++)
        { System.out.print("\nIngrese el numero "+ (i+1) + ": ");
            resta[i] = entrada.nextFloat();
        }
        resultado = resta[0];
        for (int i = 1; i < numeros; i++)
                resultado -= resta [i];
            System.out.println("La resta es de: " + resultado);
            Thread.sleep(4000);
          
    }
     
      public static void multiplicacion ()throws InterruptedException
    {
        System.out.println("Ha elegido multiplicacion");
    float [] multiplicacion = new float [20]; float resultado = 1;
        int numeros;
         Scanner entrada = new Scanner (System.in);
        System.out.print ("Ingrese la cantidad de numeros a multiplicar (Maximo 20): ");
        numeros = entrada.nextInt();
        
        for (int i = 0; i < numeros ; i++)
        { System.out.print("\nIngrese el numero "+ (i+1) + ": ");
            multiplicacion[i] = entrada.nextFloat();
        }
        for (int i = 0; i < numeros; i++)
                resultado = resultado * multiplicacion [i];
            System.out.println("El producto es de: " + resultado);
             Thread.sleep(4000);
    }
      
       public static void division()throws InterruptedException
    {
        System.out.println("Ha elegido division");
        float [] division = new float [20]; float resultado;
        int numeros;
        Scanner entrada = new Scanner (System.in);
        System.out.print ("Ingrese la cantidad de numeros a dividir (Maximo 20): ");
        numeros = entrada.nextInt();
        
        for (int i = 0; i < numeros ; i++)
        { System.out.print("\nIngrese el numero "+ (i+1) + ": ");
            division[i] = entrada.nextFloat();
        }
        resultado = (division [0] / division [1]);
         for (int i = 2; i < numeros ; i++)
         {
             resultado = (resultado / division [i]);
         }
          System.out.println("El cociente es de: " + resultado);
     Thread.sleep(4000);
    }
    
    public static void funciones()throws InterruptedException{
        Scanner entrada = new Scanner (System.in);
        double angulo;
        int eleccion;
        System.out.println("¿Que funcion desea usar?\n1.Seno\n2.Coseno\n3.Tangente");
        eleccion = entrada.nextInt();
        System.out.println ("Ingrese el angulo: ");          
        angulo = (entrada.nextDouble()); //* (Math.PI/180));
        switch (eleccion) {
            case 1:
                System.out.println("El resultado es: " + ((Math.sin(Math.toRadians(angulo)))));
                break;
            case 2:
                System.out.println("El resultado es: " + Math.cos(Math.toRadians(angulo)));
                break;
            case 3:
                System.out.println("El resultado es: " + Math.tan(Math.toRadians(angulo)));
                break;
        }
        Thread.sleep(4000);
    }   
    
      public static void raiz()throws InterruptedException
      {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base y el indice");
        double base, indice;
        double resultado;
        base = entrada.nextDouble ();
        indice = entrada.nextDouble();
        resultado = Math.pow(base, 1/indice);
        System.out.println("El valor es de: "+ resultado);
         Thread.sleep(4000);
      }
      
      public static void potencia()throws InterruptedException
      {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base y la potencia");
        double base, potencia;
        double resultado;
        base = entrada.nextDouble ();
        potencia = entrada.nextDouble();
        resultado = Math.pow(base, potencia);
        System.out.println("El valor es de: "+ resultado);        
         Thread.sleep(4000);
      }

      public static void IVA ()throws InterruptedException
      {
          Scanner entrada = new Scanner (System.in);
          System.out.println("Ingrese el valor porcentaje % del IVA y el valor a calcular");
          float IVA, valor;
          IVA = entrada.nextFloat()/100;
          valor = entrada.nextFloat();
          System.out.println("El valor del IVA de " + valor +" es de: "+ (valor * IVA));
        Thread.sleep(4000);
      }


}

