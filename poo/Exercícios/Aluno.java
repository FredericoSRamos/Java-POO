package poo.Exercícios;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome ()
    {
        return this.nome;
    }

    public void setNota1 (double nota)
    {
        if (nota < 0)
            this.nota1 = 0;
        if (nota > 10)
            this.nota1 = 10;

        this.nota1 = nota;
    }

    public void setNota2 (double nota)
    {
        if (nota < 0)
            this.nota2 = 0;
        if (nota > 10)
            this.nota2 = 10;

        this.nota2 = nota;
    }

    public double media ()
    {
        return (this.nota1 + this.nota2) / 2;
    }

    public String resultado ()
    {
        double temp = this.media ();

        if (temp < 4)
            return "Reprovado";
        if (temp < 6)
            return "Em recuperação";
        
        return "Aprovado";
    }
}
