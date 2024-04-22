package poo.Exercícios;

public class Casa {
    String cor;
    int numero;
    Janela janela;

    public void imprime ()
    {
        System.out.println ("A casa de número " + this.numero + " tem cor " + this.cor + " e tem uma janela de " + this.janela.material + " da cor " + this.janela.cor);
    }
}
