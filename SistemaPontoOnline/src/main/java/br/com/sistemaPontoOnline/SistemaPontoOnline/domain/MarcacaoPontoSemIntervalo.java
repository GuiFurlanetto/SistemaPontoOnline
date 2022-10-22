package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

public class MarcacaoPontoSemIntervalo extends MarcacaoPonto{

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private LocalTime entrada;
    private LocalTime saida;

}
