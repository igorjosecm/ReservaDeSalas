package src;


import java.util.Date;



public class Materia {
    private String codigoMateria;
    private String nomeMateria;
    private Integer cargaHoraria;


    public Materia() {
        this.setCodigoMateria("");
        this.setNomeMateria("");
        this.setCargaHoraria(0);
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
