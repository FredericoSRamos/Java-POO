package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida 
{
    SeguroDeVida seguro;

    public void criaSeguro (Evento evento)
    {
        seguro = new SeguroDeVida();

        this.seguro.setTitular (evento.getString ("titular"));
        this.seguro.setNumeroApolice (evento.getInt ("numeroApolice"));
        this.seguro.setValor (evento.getDouble ("valor"));
    }
}
