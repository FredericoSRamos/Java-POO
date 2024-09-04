package poo.provas.P2.Primeiro2022;

public class FormatoIncorretoException extends Exception
{
    public FormatoIncorretoException (String string)
    {
        super ("O formato da string [" + string + "] está incorreto");
    }
}
