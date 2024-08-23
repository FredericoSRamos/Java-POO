package poo.provas.P1.Segundo2016;

import java.util.Scanner;

public class Programa1 {
    public static void main (String[] args)
    {
        Carro2 carro = new Carro2 ();
        Motor motor = new Motor ();

        carro.setMotor(motor);

        Scanner sc = new Scanner (System.in);

        System.out.println ("Insira a cor do motor:");
        carro.getMotor().setCor(sc.nextLine());

        System.out.println ("Insira o id do carro:");
        carro.setId(sc.nextInt());

        sc.close ();
    }

    public static void imprimeDadosCarro (Carro2 n)
    {
        System.out.println ("Cor do motor: " + n.getMotor().getCor());
    }
}
