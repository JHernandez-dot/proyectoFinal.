/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;
import java.util.ArrayList;

public class GestorDeTickets {
    private ArrayList<Ticket> tickets;

    public GestorDeTickets() {
        this.tickets = new ArrayList<>();
    }

    public void registrarTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public ArrayList<Ticket> obtenerTicketsPendientes() {
        ArrayList<Ticket> pendientes = new ArrayList<>();
        for (Ticket t : tickets) {
            if (t.getEstado().equalsIgnoreCase("Pendiente")) {
                pendientes.add(t);
            }
        }
        return pendientes;
    }

    public Ticket buscarTicketPorId(int id) {
        for (Ticket t : tickets) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
