
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


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
    
}
