package br.com.caelum.contas.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    boolean setData (int dia, int mes, int ano)
    {
        String formatoData = String.join ("/", Integer.toString(dia).replaceAll(".", "d"), Integer.toString(mes).replaceAll(".", "M"), Integer.toString(ano).replaceAll(".", "y"));

        SimpleDateFormat data = new SimpleDateFormat (formatoData);
        data.setLenient (false);
    
        try
        {
            data.parse(dia + "/" + mes + "/" + ano);
        }
        catch (ParseException e)
        {
            System.out.println ("Data inválida");
            return false;
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        return true;

    }

    String getData ()
    {
        String data = "";
        if (this.dia < 10)
            data += "0";

        data += this.dia + "/";

        if (this.mes < 10)
            data += "0";

        return data + this.mes + "/" + this.ano;
    }
}
