package Usuarios;

public class Funcionario extends Usuario{
    static int Prazo = 30;
    private String Cargo;
    
    public Funcionario(int ID, String Nome, String Cargo) {
	super(ID, Nome);
        this.Cargo = Cargo;
    }
    
    public int getPrazo() {
        return this.Prazo;
    }
}
