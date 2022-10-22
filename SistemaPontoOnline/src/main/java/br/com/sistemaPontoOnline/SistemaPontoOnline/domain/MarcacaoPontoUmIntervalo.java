package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

public class MarcacaoPontoUmIntervalo extends MarcacaoPonto{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private LocalTime entrada1;
    private LocalTime saida1;
    private LocalTime entrada2;
    private LocalTime saida2;
}
