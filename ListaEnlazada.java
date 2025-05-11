/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana4;

/**
 *
 * @author o12302
 */
public class ListaEnlazada {
    private Nodo head;
    private int size;
    
    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
    
    public void insertarAlInicio(int clave) {
        Nodo temp = new Nodo(clave); // Crea nuevo nodo
        temp.siguiente = head; // Apunta nuevo nodo al inicio actual
        head = temp; // Actualiza la cabeza de la lista
        size++;
    }
    
    public void add_tail(int key) {
        Nodo tail = new Nodo(key);

        if (head == null) {
            head = tail;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = tail;
        }
        tail.siguiente = null;
        size++;
    }
}
