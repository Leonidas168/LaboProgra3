/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbox;


/**
 *
 * @author victo
 */
public class Peleador {
    private String Nombre;
    private float Altura, peso;
    private int edad;

    public Peleador(String nom, float alt, float peso, int age){
        this.Nombre=nom;
        this.Altura=alt;
        this.peso=peso;
        this.edad=age;
    }
    
    // Getter y Setter para Nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    // Getter y Setter para Altura
    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        this.Altura = altura;
    }

    // Getter y Setter para peso
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Getter y Setter para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
