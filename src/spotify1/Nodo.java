/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotify1;

/**
 *
 * @author ubuntu
 */
public  class Nodo {

    Nodo siguiente;
    String Cancion;
    int genero;

    Nodo() {
        
    }
    public String getCancion() {
        return Cancion;
    }

    public void setCancion(String Cancion) {
        this.Cancion = Cancion;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public Nodo(String Cancion, int genero) {
        this.Cancion = Cancion;
        this.genero = genero;
        this.siguiente=null;
    }
    
    
}
