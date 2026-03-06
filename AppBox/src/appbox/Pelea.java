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
    public void designarJuez(){
        for(int i = 0; i<3; i++){
            ju[i] = new Juez();
            
            System.out.println("Dame el nombre del juez: ");
            ju[i].setNombre(in.nextLine());
        }
    }
    // UN SELESCT PARA TENER DETERMINADO A PELEADORES:
    
}

