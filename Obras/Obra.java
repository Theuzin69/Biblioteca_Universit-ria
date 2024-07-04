/*Obras: Livros ou Fitas de Vídeo*/

package Obras;

import Usuarios.Usuario;

public abstract class Obra {
    private int prazo;
    private String nome;
    private Usuario dono;
    private boolean disponivel;

    public Obra(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
        this.prazo = dono.getPrazo();
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getPrazo() {
        return prazo;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(Usuario usuario) {
        if (this.disponivel) {
            this.dono = usuario;
            this.prazo = usuario.getPrazo();
            this.disponivel = false;
        } else {
            System.out.println("Obra não disponível para empréstimo.");
        }
    }

    public void reservar(Usuario usuario) {
        if (this.disponivel) {
            this.dono = usuario;
            this.prazo = usuario.getPrazo();
            this.disponivel = false;
        } else {
            System.out.println("Obra não disponível para reserva.");
        }
    }
}
