package poo.Exercícios;

public class Gato {
    public boolean vivo;
    public String cor;
    public int idade;
    public String nome;

    public void miar ()
    {
        System.out.println ("Gato miando");
    }

    public void printAtributos ()
    {
        System.out.println ("Nome: " + this.nome + " | Idade: " + this.idade + " | Cor: " + this.cor + " | Vivo: " + (this.vivo ? "Sim" : "Não"));
    }
}
