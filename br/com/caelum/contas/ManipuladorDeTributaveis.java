package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis
{
    protected double total;

    public void calculaImpostos (Evento evento)
    {
        int elementos = evento.getTamanhoDaLista("listaTributaveis");

        for (int i = 0; i < elementos; i++)
        {
            total += ((Tributavel) evento.getTributavel("listaTributaveis", i)).getValorImposto();
        }
    }

    public double getTotal ()
    {
        return this.total;
    }
}
