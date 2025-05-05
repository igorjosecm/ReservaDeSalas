package src;


import java.util.Date;


public class MateriaProfessor {
    private Integer matriculaProfessor;
    private Integer codigoMateria;
    private Date inicioPeriodo;
    private Date fimPeriodo;


    public MateriaProfessor() {
        this.setMatriculaProfessor(0);
        this.setCodigoMateria(0);
        this.setInicioPeriodo(new Date());
        this.setFimPeriodo(new Date());
    }

    public Integer getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(Integer matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public Integer getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Integer codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public Date getInicioPeriodo() {
        return inicioPeriodo;
    }

    public void setInicioPeriodo(Date inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }

    public Date getFimPeriodo() {
        return fimPeriodo;
    }

    public void setFimPeriodo(Date fimPeriodo) {
        this.fimPeriodo = fimPeriodo;
    }
}
