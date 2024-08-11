package modelo;

public class Membro {
    private String id;
    private String nome;

    public Membro(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}

