package poo.provas.P2.Primeiro2022;

public class CorpoCeleste implements Comparable<CorpoCeleste>
{
    private String id;
    private String nome;
    private double distancia;

    public CorpoCeleste (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof CorpoCeleste))
            return false;

        return (((CorpoCeleste) obj).id.equals(this.id));
    }

    @Override
    public int compareTo (CorpoCeleste corpo)
    {
        return Double.compare(this.distancia, corpo.distancia);
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + " | ID: " + id + " | Distância: " + distancia;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public void setDistancia (Double distancia)
    {
        this.distancia = distancia;
    }
}
