package facade;

import gerenciamento.GerenciadorLivros;
import gerenciamento.GerenciadorMembro;
import gerenciamento.GerenciadorEmprestimo;
import modelo.Livro;
import modelo.Membro;
import modelo.Emprestado;

public class BibliotecaFacade {
    private GerenciadorLivros gerenciadorLivros;
    private GerenciadorMembro gerenciadorMembros;
    private GerenciadorEmprestimo gerenciadorEmprestimo;

    public BibliotecaFacade() {
        this.gerenciadorLivros = new GerenciadorLivros();
        this.gerenciadorMembros = new GerenciadorMembro();
        this.gerenciadorEmprestimo = new GerenciadorEmprestimo();
    }

    public void addLivro(String id, String titulo, String autor) {
        gerenciadorLivros.addLivro(new Livro(id, titulo, autor));
    }

    public void addMembro(String id, String nome) {
        gerenciadorMembros.addMembro(new Membro(id, nome));
    }

    public void livroEmprestado(String livroId, String membroId) {
        Livro livro = gerenciadorLivros.getLivro(livroId);
        Membro membro = gerenciadorMembros.getMembro(membroId);

        if (livro != null && membro != null) {
            gerenciadorEmprestimo.addEmprestimo(livroId, membroId);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " para o membro: " + membro.getNome());
        } else {
            System.out.println("Livro ou membro não encontrado!");
        }
    }

    public void mostrarEmprestimos() {
        for (Emprestado emprestado : gerenciadorEmprestimo.getEmprestimos()) {
            Livro livro = gerenciadorLivros.getLivro(emprestado.getLivroId());
            Membro membro = gerenciadorMembros.getMembro(emprestado.getMembroId());
            System.out.println("Emprestimo: " + livro.getTitulo() + " emprestado a " + membro.getNome() + " no dia " + emprestado.getDataEmprestimo());
        }
    }
}

