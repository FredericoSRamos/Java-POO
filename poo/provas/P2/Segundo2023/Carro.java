package poo.provas.P2.Segundo2023;

import java.util.ArrayList;
import java.util.List;

public class Carro
{
    private String placa;
    private String cor;
    private String renavan;
    private int ano;
    private List<Acessorio> lista = new ArrayList<>();

    public void setPlaca (String placa)
    {
        this.placa = placa;
    }

    public void setCor (String cor)
    {
        this.cor = cor;
    }

    public void setRenavan (String renavam)
    {
        this.renavan = renavam;
    }

    public void setAno (int ano)
    {
        this.ano = ano;
    }

    public void add (Acessorio acessorio)
    {
        lista.add (acessorio);
    }

    public int getAno()
    {
        return ano;
    }

    public String getCor()
    {
        return cor;
    }

    public String getPlaca()
    {
        return placa;
    }

    public String getRenavan()
    {
        return renavan;
    }

    public List<Acessorio> getLista()
    {
        return lista;
    }
}