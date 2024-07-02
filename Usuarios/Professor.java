package Usuarios;

public class Professor extends Usuario{
    static int Prazo = 90;
    private String Departamento;
    
    public Professor(int ID, String Nome, String Departamento) {
	super(ID, Nome);
        this.Departamento = Departamento;
    }
    
    public int getPrazo() {
        return this.Prazo;
    }
}
