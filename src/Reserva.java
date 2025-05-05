package src;
import java.time.LocalTime;
import java.util.Date;



public class Reserva {
    private Integer idReserva;
    private String codigoSala;
    private Integer matriculaProfessor;
    private String codigoMateria;
    private Date dataInicio;
    private Date dataFim;
    private LocalTime horaInicio;
    private LocalTime horaFim;


    public Reserva() {
        this.setIdReserva(0);
        this.setCodigoSala("");
        this.setMatriculaProfessor(0);
        this.setCodigoMateria("");
        this.setDataInicio(new Date());
        this.setDataFim(new Date());
        this.setHoraInicio(LocalTime.MIN);
        this.setHoraFim(LocalTime.MIN);


    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public Integer getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(Integer matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }
}
