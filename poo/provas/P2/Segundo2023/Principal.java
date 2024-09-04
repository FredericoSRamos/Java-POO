package poo.provas.P2.Segundo2023;

import java.util.ArrayList;
import java.util.List;

public class Principal
{
    public static void main (String[] args)
    {
        List<Carro> lista = new ArrayList<>();

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        Acessorio som = new Som ("JBL", 500);
        Acessorio vidro = new VidroEletrico ("Xvidros", 250);

        carro1.setAno (2012);
        carro1.setCor ("Vermelho");
        carro1.setPlaca ("JDB-4762");
        carro1.setRenavan ("34568947345");
        carro1.add (som);
        carro1.add (vidro);

        carro2.setAno (2013);
        carro2.setCor ("Cinza");
        carro2.setPlaca ("DHW-2180");
        carro2.setRenavan ("236785634856");
        carro2.add (som);
        carro2.add (vidro);

        lista.add (carro1);
        lista.add (carro2);
    }
}
