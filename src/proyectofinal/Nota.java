/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

public class Nota {
    private String contenido;
    private Usuario autor;

    public Nota(String contenido, Usuario autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public Usuario getAutor() {
        return autor;
    }
}
