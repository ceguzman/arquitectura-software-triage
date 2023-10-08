package co.edu.poli.domain;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
public class CategoriaTriage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 200)
    private String nivel;
    @Column(length = 200)
    private String tipoUrgencia;
    @Column(length = 200)
    private String tiempoEspera;

    @Column(length = 200)
    private String descripcion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTipoUrgencia() {
        return tipoUrgencia;
    }

    public void setTipoUrgencia(String tipoUrgencia) {
        this.tipoUrgencia = tipoUrgencia;
    }

    public String getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(String tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
