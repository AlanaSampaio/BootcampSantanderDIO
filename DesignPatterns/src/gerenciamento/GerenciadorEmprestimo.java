package gerenciamento;

import modelo.Emprestado;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciadorEmprestimo {
    private List<Emprestado> emprestimos = new ArrayList<>();

    public void addEmprestimo(String livroId, String membroId) {
        emprestimos.add(new Emprestado(livroId, membroId, new Date()));
    }

    public List<Emprestado> getEmprestimos() {
        return emprestimos;
    }
}

