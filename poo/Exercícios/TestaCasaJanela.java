package poo.Exercícios;

public class TestaCasaJanela {
    public static void main (String[] args)
    {
        Janela janela = new Janela ();
        janela.cor = "Marrom";
        janela.material = "Madeira";
        Casa casa = new Casa ();
        casa.cor = "Vermelho";
        casa.janela = janela;
        casa.numero = 232;
        casa.imprime();
    }
}
