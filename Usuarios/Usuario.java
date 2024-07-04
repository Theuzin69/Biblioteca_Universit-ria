/*Usuários:
-Alunos, Funcionários e Professores
-Podem emprestar e reservar obras. */

package Usuarios;

public abstract class Usuario {
    private int id;
    private String nome;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public abstract int getPrazo();
}
