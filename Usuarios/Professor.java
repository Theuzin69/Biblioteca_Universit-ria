package Usuarios;

public class Professor extends Usuario {
    static int Prazo = 90;
    private String departamento;

    public Professor(int id, String nome, String departamento) {
        super(id, nome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getPrazo() {
        return Prazo;
    }
}
