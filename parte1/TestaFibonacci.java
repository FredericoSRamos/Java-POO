public class TestaFibonacci {
    public static void main (String[] args)
    {
        int len = 20;

        int[] arr = new int[len];
        
		for	(int i = 1;	i <= len; i++)
        {
			int	resultado = arr[i-1] = FibonacciRecursivo.calculaFibonacci(i, arr);
			System.out.println(resultado);
        }
    }
}
