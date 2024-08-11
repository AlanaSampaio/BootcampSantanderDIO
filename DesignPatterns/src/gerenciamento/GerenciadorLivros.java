package gerenciamento;

import modelo.Livro;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorLivros {
    private Map<String, Livro> livros = new HashMap<>();

    public void addLivro(Livro livro) {
        livros.put(livro.getId(), livro);
    }

    public Livro getLivro(String id) {
        return livros.get(id);
    }
}

