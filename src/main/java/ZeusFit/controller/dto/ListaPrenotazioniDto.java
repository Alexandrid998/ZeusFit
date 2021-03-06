package ZeusFit.controller.dto;

import java.util.ArrayList;

public class ListaPrenotazioniDto {
    private String corso;
    private String giorno;
    private String orario;
    private int durata;
    private int sala;

    public ListaPrenotazioniDto() {
    }

    public ListaPrenotazioniDto(String corso, String giorno, String orario, int durata, int sala) {
        this.corso = corso;
        this.giorno = giorno;
        this.orario = orario;
        this.durata = durata;
        this.sala = sala;
    }

    public String getCorso() {
        return corso;
    }

    public void setCorso(String corso) {
        this.corso = corso;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getOrario() {
        return orario;
    }

    public void setOrario(String orario) {
        this.orario = orario;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
