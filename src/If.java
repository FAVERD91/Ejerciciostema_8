import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe Un Numero Por Favor");
        double numero = sc.nextDouble();

        if (numero == 0)
        {
            System.out.println("El Numero Es 0");
        } else if (numero > 0) {
            System.out.println("El Numero Es Positivo");
        }
        else {
        System.out.println("El Numero Es Negativo");
    }


    }
}
