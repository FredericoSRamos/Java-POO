public class Executar {
    public static void main (String[] args)
    {
        Casa casa = new Casa ();

        casa.pinta ("Vermelho");

        for (int i = 0; i < 3; i++)
        {
            casa.adicionaPorta (new Porta());
        }

        casa.portas[0].abre ();
        casa.portas[2].abre ();
        casa.portas[0].fecha ();

        System.out.println ("Portas abertas: " + casa.quantasPortasEstaoAbertas());
        System.out.println ("Total de portas: " + casa.totalDePortas());
    }
}
