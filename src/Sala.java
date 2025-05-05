package src;

public class Sala {
    String codSala;
    String codBloco;
    String nomeSala;
    int andar;
    int capacidade;

    public Sala() {
        this.setCodSala("");
        this.setCodBloco("");
        this.setNomeSala("");
        this.setAndar(0);
        this.setCapacidade(0);
    }

    public String getCodSala() {
        return codSala;
    }

    public void setCodSala(String codSala) {
        this.codSala = codSala;
    }

    public String getCodBloco() {
        return codBloco;
    }

    public void setCodBloco(String codBloco) {
        this.codBloco = codBloco;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
