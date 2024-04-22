package poo.Exercícios;

public class TestaCasa {
    public static void main (String[] args)
    {
        Casa casa1 = new Casa (), casa2 = new Casa ();
        casa1.cor = "Vermelho";
        casa1.numero = 432;
        casa2.cor = "Amarelo";
        casa2.numero = 650;
        casa1.imprime ();
        casa2.imprime ();
    }
}
