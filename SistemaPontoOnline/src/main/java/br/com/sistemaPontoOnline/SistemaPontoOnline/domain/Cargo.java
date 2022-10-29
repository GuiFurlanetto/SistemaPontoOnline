package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;


@Entity
@Table
@Setter
@Getter

public class Cargo {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id; /** na modelagem esta como Integer, Long seria melhor? (Gui) */
    private String descricaoCargo;
    private Time cargaHoraria;
    @ManyToOne (fetch = FetchType.LAZY) /**  Não Tenho certeza da relação e nem do "fetch" (Gui) */
    private Departamento departamento;

}
