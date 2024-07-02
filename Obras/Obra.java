/*Obras: Livros ou Fitas de Vídeo*/

package Obras;

import Usuarios.*;

public class Obra {
    private int Prazo;
    private String Nome;
    private Usuario Dono;
    
    public Obra(String Nome, Usuario Dono) {
        this.Prazo = Dono.getPrazo();
    }
}
