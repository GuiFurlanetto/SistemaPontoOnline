package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table
@Setter
@Getter
public class Funcionario {

    @Id
    private Long codigoFuncional;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST) /** não tenho certeza se deve ser o  "cascade"(Gui) */
    private Cargo cargo;
    private Enum tipoAcesso;  /** Precisamos criar o enum, certo? (Gui)*/
}
