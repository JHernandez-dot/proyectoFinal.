/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Usuario> usuarios;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
