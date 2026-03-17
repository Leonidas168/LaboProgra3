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
public class Pelea {
    Peleador[] pe = new Peleador[2];
    Juez[] ju = new Juez[3];
    Scanner in = new Scanner(System.in);
    int i = 0;
    public void designarJuez(String ju1, String ju2, String ju3){
       ju[0] = new Juez();
       ju[0].setNombre(ju1);
       ju[1] = new Juez(); 
       ju[1].setNombre(ju2);
       ju[2] = new Juez();
       ju[2].setNombre(ju3);
       
    }
    public void configurarPeleador(String no, int indice){
        System.out.println("Peleador: " + no);
        switch(no){
            case "Canelo Alvarez":
                pe[indice] = new Peleador("Canelo Alvarez", 1.71f, 77.0f, 35);
                break;
            case "Mike Tyson":
                pe[indice] = new Peleador("Mike Tyson", 1.78f, 109.0f, 59);
                break;
            case "Manny Pacquiao":
                pe[indice] = new Peleador("Manny Pacquiao", 1.66f, 67.0f, 47);
                break;
            case "Floyd Mayweather":
                pe[indice] = new Peleador("Floyd Mayweather", 1.73f, 68.0f, 49);
                break;
            case "Muhammad Ali":
                pe[indice] = new Peleador("Muhammad Ali", 1.91f, 106.0f, 74);
                // Ali falleció en 2016, aquí se usa la edad al morir
                break;
            default:
                System.out.println("Peleador no encontrado.");
        }
    }

   public void mostrarPeleadores(){
        for(int i = 0; i < pe.length; i++){
            if(pe[i] != null){
                System.out.println("[" + i + "] " + pe[i].getNombre() +
                                   " - Altura: " + pe[i].getAltura() +
                                   " m, Peso: " + pe[i].getPeso() +
                                   " kg, Edad: " + pe[i].getEdad());
            }
        }
    }

}

