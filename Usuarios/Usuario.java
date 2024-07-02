/*Usuários:
-Alunos, Funcionários e Professores
-Podem emprestar e reservar obras. */

package Usuarios;

public abstract class Usuario {
    private int ID;
    private String Nome;
	
    public Usuario(int ID, String Nome) {
	this.ID = ID;
	this.Nome = Nome;
    }
    
    public abstract int getPrazo();
}
