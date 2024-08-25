package poo.provas.P2.Primeiro2018B;

public class Animal implements Comparable<Animal>
{
    public String id;
    public String nome;
    public int idade;

    public Animal (String id)
    {
        this.id = id;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (!(obj instanceof Animal))
            return false;

        if (((Animal) obj).id.equals(this.id))
            return true;

        return false;
    }

    @Override
    public String toString()
    {
        return "ID: " + id + " | Nome: " + nome + " | Idade: " + idade;
    }

    public int compareTo (Animal animal)
    {
        return this.id.compareTo(animal.id);
    }
}
