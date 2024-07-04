package Dados;
import Usuarios.Usuario;
import Obras.Obra;
import java.util.List;
import java.util.ArrayList;

public class Dados {
    private List<Usuario> usuarios;
    private List<Obra> obras;

    public Dados() {
        this.usuarios = new ArrayList<>();
        this.obras = new ArrayList<>();
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Obra> getObras() {
        return obras;
    }
}