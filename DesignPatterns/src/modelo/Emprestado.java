package modelo;

import java.util.Date;

public class Emprestado {
    private String livroId;
    private String membroId;
    private Date dataEmprestimo;

    public Emprestado(String livroId, String membroId, Date dataEmprestimo) {
        this.livroId = livroId;
        this.membroId = membroId;
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getLivroId() {
        return livroId;
    }

    public String getMembroId() {
        return membroId;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
}

