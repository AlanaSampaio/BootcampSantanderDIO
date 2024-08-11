package gerenciamento;

import modelo.Membro;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorMembro {
    private Map<String, Membro> membros = new HashMap<>();

    public void addMembro(Membro membro) {
        membros.put(membro.getId(), membro);
    }

    public Membro getMembro(String id) {
        return membros.get(id);
    }
}

