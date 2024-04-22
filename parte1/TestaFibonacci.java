public class TestaFibonacci {
    public static void main (String[] args)
    {
        FibonacciRecursivo fibonacci = new FibonacciRecursivo();

		for	(int i = 1;	i <= 20; i++)
        {
			int	resultado =	fibonacci.calculaFibonacci(i);
			System.out.println(resultado);
        }
    }
}
