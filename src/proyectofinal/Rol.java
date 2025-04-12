/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;
   import java.util.ArrayList;
/**
 *
 * @author jimmy
 */
public class Rol {
    private String nombre;
    private ArrayList<String> permisos;

    public Rol(String nombre) {
        this.nombre = nombre;
        this.permisos = new ArrayList<>();
    }

    public void agregarPermiso(String permiso) {
        permisos.add(permiso);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPermisos() {
        return permisos;
    }
}

