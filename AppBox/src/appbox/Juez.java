/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbox;

import java.util.*;
/**
 *
 * @author victo
 */
public class Juez {
    private String Nombre;
    ArrayList <Integer> puntos1 = new ArrayList<>();
    ArrayList <Integer> puntos2 = new ArrayList<>();
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
}
