package Usuarios;

public class Aluno extends Usuario{
    static int Prazo = 15;
    
    public Aluno(int ID, String Nome) {
	super(ID, Nome);
    }
    
    public int getPrazo() {
        return this.Prazo;
    }
}
