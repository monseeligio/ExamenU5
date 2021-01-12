
package examenu5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    
    public void Ordenar() {
       
        List <String> ListaOrdenada= new ArrayList();
         File archivo = null;
         FileReader fr = null; 
         BufferedReader br = null;
         String[]  palabras=null;
        String[]  palabras2=null;
        
        try {
         archivo = new File ("C:\\Users\\gama\\Documents\\Monse\\examen.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
            System.out.println("Numeros del archivo:");
                     System.out.println("\n***********************");

         //ejercicio separar la frase del txt 
        String linea;
         while((linea=br.readLine())!=null){ // este line lee cada parrafo 
             palabras=linea.split(" ");
         }
           for (String texto:palabras){
             System.out.print(texto+" ");
         }
                       System.out.println("\n***********************");
         
     
     int [] ArregloFinal= new int [palabras.length];       
     for (int i=0; i<palabras.length; i++){
         ArregloFinal[i]=Integer.parseInt(palabras[i]);      
   }
        
   

  // Metodo burbuja 
       for(int i=0;i<ArregloFinal.length-1;i++){
           for(int j=0;j<ArregloFinal.length-1;j++){
               if(ArregloFinal[j]>ArregloFinal[j+1]){
                  int auxiliar=ArregloFinal[j+1];
                  ArregloFinal[j+1]=ArregloFinal[j];
                  ArregloFinal[j]=auxiliar;      
               }
      }
      }
       
     //Mostrando los numeros ordenados
       System.out.println("\nNumeros ordenados:");
       for(int i=0;i<ArregloFinal.length;i++){
          System.out.print(ArregloFinal[i]+" ");
      } 
       fr.close();

         }
         
         // Lectura del fichero     
      catch(Exception e){
          System.out.println(e);;
         
      }
          
        
    }
    
}
