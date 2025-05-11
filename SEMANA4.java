/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana4;

/**
 *
 * @author o12302
 */
public class SEMANA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada L = new ListaEnlazada();
        L.insertarAlInicio(7);
        L.add_tail(6);
        L.add_tail(4);
        L.add_tail(2);
        
        Nodo temp = L.getHead();
        
        while(temp.siguiente != null){
                System.out.println(temp.clave);
                temp = temp.siguiente;
            }
        System.out.println(temp.clave);
        }          
    }
