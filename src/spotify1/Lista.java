/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify1;

import java.util.ArrayList;

/**
 *
 * @author ubuntu
 */
public class Lista {
     Nodo primero;// null
    
    /// 
    
    public void insertar(String nombre, int tipo){
       
        if(primero==null)//primero
        {
            primero= new Nodo(nombre,tipo);
            
        }
        else
        {//2ndo insert
             Nodo  aux_pastel= new Nodo(nombre,tipo);
               
                
                if(primero.siguiente==null)// 2ndo insert
                {
                    primero.siguiente=aux_pastel;
                    
                    
                }
                
        /*int v[10];
        int i=0;
        while(i<10)
        {
            int iterador= v[i];
        i++;
        }*/
        
                else{
        ///3 en adelante
                        Nodo iterador=primero.siguiente;//obtener el valor del 2ndo
                        boolean insertado=false;
                         while(iterador!=null & insertado==false)
                         {
                              if(iterador.siguiente==null)
                              {
                                  iterador.siguiente=aux_pastel;
                                  
                                  
                                  insertado=true;
                              }
                                 else
                                  iterador= iterador.siguiente;
                         }
                         
                }
          
              
        }
        
        
        
    }
    
    
    public boolean buscar(String c)
    {
        
        
        if(primero.getCancion().equals(c))
            return true;
        else{
                        Nodo iterador=primero.siguiente;//obtener el valor del 2ndo
                        
                         while(iterador!=null  )
                         {
                              if(iterador.getCancion().equals(c))
                              {
                                  return true;
                              }
                                 else
                                  iterador= iterador.siguiente;
                         }
        }
        return false;
    }
    
     public void irNodoSiguiente(){
       if(primero!=null &&primero.siguiente!=null){
           primero = primero.siguiente;
       }
    }
     
     
     public void ImprimirNodos(){
        Nodo auxiliar = new Nodo();
        auxiliar = primero;
        String datos = "";
        
        //para imprimir los nodos hacia adelante 
        
        while(auxiliar!=null){
            datos=datos+"-->"+auxiliar.Cancion;
            auxiliar=auxiliar.siguiente;
        }
        
        System.out.println(datos);
        
    }
      
   
}
