package br.com.caelum.contas.modelo;

public class FullArrayException extends RuntimeException
{
    public FullArrayException ()
    {
        super ("A array está cheia");
    }
}
