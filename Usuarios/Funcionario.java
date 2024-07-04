package Usuarios;

public class Funcionario extends Usuario {
    static int Prazo = 30;
    private String cargo;

    public Funcionario(int id, String nome, String cargo) {
        super(id, nome);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    
    public int getPrazo() {
        return Prazo;
    }
}
