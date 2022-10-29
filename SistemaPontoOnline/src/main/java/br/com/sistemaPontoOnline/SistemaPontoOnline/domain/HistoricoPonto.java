package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter

public class HistoricoPonto {

    @Id /** o dataMarcacao é o proprio Id? (Gui)*/
    private LocalDateTime dataMarcacao;

    private Enum tipoMarcacao; /** Precisamos criar o enum, certo? (Gui)*/

    @OneToOne(cascade = CascadeType.PERSIST) /** não tenho certeza se deve ser o  "cascade"(Gui) */
    private Funcionario funcionario;

    @OneToOne(cascade = CascadeType.PERSIST) /** Não Tenho certeza da relação e nem se deve ser o  "cascade"(Gui) */
    private Justificativa justificativa;
}

