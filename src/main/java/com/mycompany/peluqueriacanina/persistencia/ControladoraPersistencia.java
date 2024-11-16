package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladoraPersistencia {

    MascotasJpaController controlMascota = new MascotasJpaController();
    DuenioJpaController controlDuenio = new DuenioJpaController();

    //Metodos mascotas
    public void crearMascota(Mascota mascota) {
        controlMascota.create(mascota);
    }

    //Metodos duenio
    public void crearDuenio(Duenio duenio) {
        controlDuenio.create(duenio);
    }

    public void guardar(Duenio duenio, Mascota masco) {
        controlDuenio.create(duenio);
        controlMascota.create(masco);
    }

    public List<Duenio> traerDatosDuenio() {
        return controlDuenio.findDuenioEntities();
    }

    public List<Mascota> traerDatosMascotas() {
        return controlMascota.findMascotasEntities();
    }

    public void eliminarRegistro(int numCliente) {
        try {
            controlMascota.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "Error no se pudo eliminar");
        }
    }

    public Mascota buscarMascota(int id) {
        return controlMascota.findMascotas(id);
    }

    public void editarCliente(Mascota masco) {
        try {
            controlMascota.edit(masco);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al editar Mascota");
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return controlDuenio.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio due) {
        try {
            controlDuenio.edit(due);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al editar Mascota");
        }
    }

}
