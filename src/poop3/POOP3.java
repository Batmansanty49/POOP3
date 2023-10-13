/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

/**
 * @author Ruiz Ramírez Santiago
 * Importa bibliotecas para usarlas en tareas comunes y recurrentes
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *Clase donde se realizan las pruebas con bibliotecas
 */
public class POOP3 {

    /**
     * Funcion main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /**
        * Diferentes formas de utilizar arreglos en java
        */
        System.out.println("####### ARREGLOS ######");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1, 2, 3, 4};
        
        /**
         * Estructura de control que itera dependiendo de sus valores
         */
        System.out.println("####### FOR ######");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
       /**
        * Estructura de control que itera de manera más selectiva, respecto a un arreglo
        */
        System.out.println("####### FOR-EACH ######");
            for (int i : nums4) {
                System.out.println(i);
            }
         /**
          * Agrega datos a una oración, así como sustituye otras
          */  
        System.out.println("####### CONCATENAR ######");
        String s =new String("Hola Mundo");
        String s1 ="Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre ="Santiago";
        String apellido ="Ruiz";
        String nombreCompleto = nombre+" "+ apellido;
        System.out.println(nombreCompleto);
       /**
        * El punto puede alterar el dato recabado de una variable 
        */
        System.out.println("####### ORDENAR PUNTO ######");
        System.out.println("nume elementos del arreglo: " +nums4.length);
        System.out.println("num elementos de nombre: "+nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
       /**
        * Envuelve un dato primitivo para que pase a un objeto o sea tratado como uno
        */
        System.out.println("####### WRAPPERS Y AUTOBOXING ######");
        int a=3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r =l;
        int b=7;
        float c=b; //->casteo
        int d= (int) c;
        Integer rr=r;
        String s3 =rr.toString();
        System.out.println(s3);
        String s4 =r + ""; //Comillas es un conjunto vacio
        System.out.println(s4);
        System.out.println(s4.length());
        //Parseo: To parceo
        //Casteo: To cast
        
       /**
        * Imprime colecciones
        */
        System.out.println("####### COLECCIONES ######");
       /**
        * Array List almacena datos de forma dinamica
        */
        System.out.println("####### arrayList ######");
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
       /**
        * Utiliza la funcion hash para identificar datos
        */
        System.out.println("####### HashTable ######");
        Hashtable<Integer,String> agenda=new Hashtable<Integer,String>();
        agenda.put(k, "Santi");
        agenda.put(12347, "Juan");
        agenda.put(9812, "Jose");
        agenda.put(8463, "Erika");
        System.out.println(agenda.size());
        System.out.println("***");
        for (String valor: agenda.values()) {
            System.out.println(valor);
        }
        for(Integer clave : agenda.keySet()){
            System.out.println(clave);
        }
        /**
         * Enumera los valores o datos
         */
        System.out.println("####### Enumeracion ######");
        Integer clave;
        String valor;
        Enumeration <Integer> llaves =agenda.keys();
        while (llaves.hasMoreElements()) {
            clave=llaves.nextElement();
            valor=agenda.get(clave);
            System.out.println("Clave: "+clave+ "Valor: "+valor);
        }
       /**
        * Realiza operaciones matemáticas
        */
        System.out.println("####### MATH ######");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80,7));
       /**
        * Da la fecha actual y hora
        */
        System.out.println("####### DATE ######");
        Date hoy=new Date();
        System.out.println(hoy);
       
    }
   
}