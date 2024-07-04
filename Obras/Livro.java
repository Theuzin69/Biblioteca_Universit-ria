package Obras;

import Usuarios.Usuario;

public class Livro extends Obra {
    private int tombo;

    public Livro(String nome, Usuario dono, int tombo) {
        super(nome, dono);
        this.tombo = tombo;
    }

    public int getTombo() {
        return tombo;
    }
}
