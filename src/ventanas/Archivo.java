
package ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    private File archivo;
    
    public void crearArchivo() {
        archivo = new File("contactos.txt");
        
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            }
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
    public void escribirTexto(Persona p) {
        try {
            FileWriter escribir = new FileWriter(archivo);
            // signo % separa los valores de las variables
            escribir.write(p.getNombre() + "%" + p.getCorreo() + "%" + p.getCelular() + "\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, no pudo escribirse en el archivo");
        }
            
    }
}
