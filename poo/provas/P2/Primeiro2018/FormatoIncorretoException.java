package poo.provas.P2.Primeiro2018;

public class FormatoIncorretoException extends Exception
{
    public FormatoIncorretoException (String string)
    {
        super ("O formato da String " + string + " está incorreto.");
    }
}
