package src;



public class Bloco {
    private String codigoBloco;
    private String nomeBloco;
    private Integer numAndares;


    public Bloco() {
        this.setCodigoBloco("");
        this.setNomeBloco("");
        this.setNumAndares(0);
    }

    public String getCodigoBloco() {
        return codigoBloco;
    }

    public void setCodigoBloco(String codigoBloco) {
        this.codigoBloco = codigoBloco;
    }

    public String getNomeBloco() {
        return nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }

    public Integer getNumAndares() {
        return numAndares;
    }

    public void setNumAndares(Integer numAndares) {
        this.numAndares = numAndares;
    }
}
