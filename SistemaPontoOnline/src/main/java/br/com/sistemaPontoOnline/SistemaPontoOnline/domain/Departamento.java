package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter

public class Departamento {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id; /** na modelagem esta como Integer, Long seria melhor? (Gui) */
    private String nomeDepartamento;

}
