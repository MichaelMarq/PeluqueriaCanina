
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    

    public void guardarCliente(String nombreCliente, String razaCliente, String colorCliente, String alergicoCliente, String atencionEspecial, String areaObservacion, String nombreDuenio, String telefonoDuenio) {
        
        //Creamos el dueño y le asignamos sus valores
        Duenio duenio = new Duenio();
        
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(telefonoDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        
        masco.setNombre_perro(nombreCliente);
        masco.setRaza(razaCliente);
        masco.setColor(colorCliente);
        masco.setAlergico(alergicoCliente);
        masco.setAtencion_especial(atencionEspecial);
        masco.setObservaciones(areaObservacion);
        masco.setDuenio(duenio);
        
        controladora.guardar(duenio,masco);

        
                
                
    }
    
    public List<Duenio> traerDatosDuenio(){
        return controladora.traerDatosDuenio();
    }

    public List<Mascota> traerMascotas() {
        
        return controladora.traerDatosMascotas();
    }


    
}
