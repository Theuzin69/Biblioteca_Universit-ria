
package Obras;

import Usuarios.*;

public class Livro extends Obra{
    private int Tombo;
    
    public Livro(String Nome, Usuario Dono, int Tombo) {
        super(Nome, Dono);
        this.Tombo = Tombo;
    }
}
