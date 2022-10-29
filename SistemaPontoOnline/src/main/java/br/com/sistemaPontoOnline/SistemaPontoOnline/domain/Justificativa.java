package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Justificativa {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long Id; /** na modelagem esta como Integer, Long seria melhor? (Gui) */
    private String tipoJustificativa;
    private LocalDateTime dataJustificativa;
    private String anexarDocumento;
}
