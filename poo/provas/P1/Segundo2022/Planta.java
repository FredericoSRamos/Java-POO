package poo.provas.P1.Segundo2022;

public class Planta implements Comparable<Planta> {
    private String id;
    private String nome;
    private double tamanho;

    Planta (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj == null)
            return false;

        if (!(obj instanceof Planta))
            return false;

        return (((Planta) obj).getId ().equals(this.getId ()));
    }

    @Override
    public String toString ()
    {
        return "Id: " + this.id + "\nNome: " + this.nome + "\nTamanho: " + this.tamanho;
    }

    public int compareTo (Planta planta)
    {
        if (this.getTamanho () > planta.getTamanho ())
            return 1;

        if (this.getTamanho() == planta.getTamanho ())
            return 0;

        return -1;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public void setTamanho (double tamanho)
    {
        this.tamanho = tamanho;
    }

    public double getTamanho ()
    {
        return this.tamanho;
    }

    public String getId ()
    {
        return this.id;
    }
}
