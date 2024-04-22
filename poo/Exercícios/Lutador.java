package poo.Exercícios;

import java.util.ArrayList;

public abstract class Lutador {
    private String nome;
    private int idade;
    private double peso;

    public Lutador (String nome, int idade, double peso)
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString () {
        return nome + "/" + idade + "/" + peso;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public int getIdade ()
    {
        return this.idade;
    }

    public double peso ()
    {
        return this.peso;
    }

    public void possiveisLutas (Lutador[] lutadores)
    {
        System.out.println ("Possíveis lutas:\n");

        for (int i = 0; i < lutadores.length; i++)
        {
            if (lutadores[i].getClass() == this.getClass() && !lutadores[i].equals (this))
                System.out.println (". " + lutadores[i]);
        }
    }

    public String categoriaLutador ()
    {
        String temp = this.getClass().toString().substring(10);

        return temp.substring(0,4) + " " + temp.substring(4);
    }

    public Lutador sorteioLuta (Lutador[] lutadores)
    {
        ArrayList<Integer> lutadoresAptos = new ArrayList<Integer>();
        
        for (int i = 0; i < lutadores.length; i++)
        {
            if (lutadores[i].getClass() == this.getClass() && !lutadores[i].equals (this))
                lutadoresAptos.add (i);
        }

        return lutadores [lutadoresAptos.get(((int) (Math.random () * 100)) % lutadoresAptos.size())];
    }
}
