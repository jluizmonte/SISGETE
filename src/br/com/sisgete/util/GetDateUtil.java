package br.com.sisgete.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GetDateUtil {

    /**
     * retorna dia e mes no formato: dd-MM_HH:mm
     *
     * @return
     */
    public String getDate() {
        String dataAtual = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM_HH:mm");
        LocalDateTime timepoint = LocalDateTime.now();
        dataAtual = (timepoint.format(fmt));
        return dataAtual;

    }

    /**
     * retorna a data completa no formato: dd/MM/yyyy HH:mm:ss
     *
     * @return
     */
    public String getDateNow() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna o dia e o mês no formato: dd_MM
     *
     * @return
     */
    public String getDateOnly() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd_MM");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna a hora e minutos no formato: HH:mm
     *
     * @return
     */
    public String getTimeOnly() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna dia, mês e ano atuais no formato: dd/MM/yyyy
     *
     * @return
     */
    public String getDateTime() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna o ano no formato: yyyy
     *
     * @return
     */
    public String getYear() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna a data atualizada de 1 mês no formato: dd/MM/yyyy
     *
     * @return
     */
    public String getDateTimeMonth() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime timepoint = LocalDateTime.now().plusMonths(1);
        date = (timepoint.format(fmt));
        return date;
    }
}
