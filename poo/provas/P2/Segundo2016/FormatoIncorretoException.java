package poo.provas.P2.Segundo2016;

public class FormatoIncorretoException extends Exception
{
    public FormatoIncorretoException (String string)
    {
        super ("O formato da String " + string + " está incorreto");
    }
}
