import Obras.Obra;
import java.util.Scanner;
import Obras.*;
import Usuarios.*;
import Dados.Dados;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dados dados = new Dados();
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar obra");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Listar obras");
            System.out.println("5 - Emprestar obra");
            System.out.println("6 - Reservar obra");
            System.out.println("9 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do usuário:");
                    String nomeUsuario = scanner.nextLine();
                    System.out.println("Digite o tipo do usuário (1 - Aluno, 2 - Professor, 3 - Funcionário):");
                    int tipoUsuario = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    Usuario novoUsuario = null;
                    switch (tipoUsuario) {
                        case 1:
                            novoUsuario = new Aluno(dados.getUsuarios().size() + 1, nomeUsuario);
                            break;
                        case 2:
                            System.out.println("Digite o departamento do professor:");
                            String departamentoProfessor = scanner.nextLine();
                            novoUsuario = new Professor(dados.getUsuarios().size() + 1, nomeUsuario, departamentoProfessor);
                            break;
                        case 3:
                            System.out.println("Digite o cargo do funcionário:");
                            String cargoFuncionario = scanner.nextLine();
                            novoUsuario = new Funcionario(dados.getUsuarios().size() + 1, nomeUsuario, cargoFuncionario);
                            break;
                        default:
                            System.out.println("Tipo de usuário inválido.");
                            break;
                    }

                    if (novoUsuario != null) {
                        dados.getUsuarios().add(novoUsuario);
                        System.out.println("Usuário cadastrado com sucesso.");
                    }
                    break;
                    /*
                case 2:
                    System.out.println("Digite o nome da obra:");
                    String nomeObra = scanner.nextLine();
                    System.out.println("Digite o tipo da obra (1 - Livro, 2 - Fita de vídeo):");
                    int tipoObra = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline

                    System.out.println("Digite o nome do dono da obra:");
                    String nomeDonoObra = scanner.nextLine();
                    Usuario donoObra = null;
                    for (Usuario u : dados.getUsuarios()) {
                        if (u.getNome().equals(nomeDonoObra)) {
                            donoObra = u;
                            break;
                        }
                    }

                    if (donoObra == null) {
                        System.out.println("Dono não encontrado.");
                        break;
                    }

                    Obra novaObra = null;
                    if (tipoObra == 1) {
                        System.out.println("Digite o tombo do livro:");
                        int tomboLivro = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline
                        novaObra = new Livro(nomeObra, donoObra, tomboLivro);
                    } else if (tipoObra == 2) {
                        novaObra = new FitaDeVideo(nomeObra, donoObra);
                    } else {
                        System.out.println("Tipo de obra inválido.");
                        break;
                    }

                    if (novaObra != null) {
                        dados.getObras().add(novaObra);
                        System.out.println("Obra cadastrada com sucesso.");
                    }
                    break;

                     */

                case 3:
                    System.out.println("Listagem de usuários:");
                    for (Usuario u : dados.getUsuarios()) {
                        System.out.println(u.getNome() + " - " + u.getClass().getSimpleName());
                    }
                    break;

                case 4:
                    System.out.println("Listagem de obras:");
                    for (Obra o : dados.getObras()) {
                        System.out.println(o.getNome() + " - " + o.getClass().getSimpleName());
                    }
                    break;

                case 5:
                    System.out.println("Digite o nome da obra a ser emprestada:");
                    String nomeObraEmprestar = scanner.nextLine();
                    Obra obraEmprestar = null;
                    for (Obra o : dados.getObras()) {
                        if (o.getNome().equals(nomeObraEmprestar)) {
                            obraEmprestar = o;
                            break;
                        }
                    }

                    if (obraEmprestar == null) {
                        System.out.println("Obra não encontrada.");
                        break;
                    }

                    if (!obraEmprestar.estaDisponivel()) {
                        System.out.println("Obra não disponível para empréstimo.");
                    } else {
                        System.out.println("Digite o nome do usuário que está pegando emprestado:");
                        String nomeUsuarioEmprestimo = scanner.nextLine();
                        Usuario usuarioEmprestimo = null;
                        for (Usuario u : dados.getUsuarios()) {
                            if (u.getNome().equals(nomeUsuarioEmprestimo)) {
                                usuarioEmprestimo = u;
                                break;
                            }
                        }

                        if (usuarioEmprestimo == null) {
                            System.out.println("Usuário não encontrado.");
                            break;
                        }

                        obraEmprestar.emprestar(usuarioEmprestimo);
                        System.out.println("Obra emprestada com sucesso para " + usuarioEmprestimo.getNome() + ".");
                    }
                    break;

                case 6:
                    System.out.println("Digite o nome da obra a ser reservada:");
                    String nomeObraReservar = scanner.nextLine();
                    Obra obraReservar = null;
                    for (Obra o : dados.getObras()) {
                        if (o.getNome().equals(nomeObraReservar)) {
                            obraReservar = o;
                            break;
                        }
                    }

                    if (obraReservar == null) {
                        System.out.println("Obra não encontrada.");
                        break;
                    }

                    if (!obraReservar.estaDisponivel()) {
                        System.out.println("Obra não disponível para reserva.");
                    } else {
                        System.out.println("Digite o nome do usuário que está reservando:");
                        String nomeUsuarioReserva = scanner.nextLine();
                        Usuario usuarioReserva = null;
                        for (Usuario u : dados.getUsuarios()) {
                            if (u.getNome().equals(nomeUsuarioReserva)) {
                                usuarioReserva = u;
                                break;
                            }
                        }

                        if (usuarioReserva == null) {
                            System.out.println("Usuário não encontrado.");
                            break;
                        }

                        obraReservar.reservar(usuarioReserva);
                        System.out.println("Obra reservada com sucesso para " + usuarioReserva.getNome() + ".");
                    }
                    break;

                case 9:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
