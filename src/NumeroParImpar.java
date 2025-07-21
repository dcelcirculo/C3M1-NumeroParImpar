import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int number = 0;
        boolean validator = false;
        do {
            System.out.print("Ingrese un número: ");
            if (entrada.hasNextInt()) {
                number = entrada.nextInt();
                validator = true;
            } else {
                System.out.println("Entrada inválida. Por favor ingrese un número válido.");
            }
        } while (!validator);

        if (number % 2 == 0) {
            System.out.printf("%d, es un número es PAR.\n", number);
        } else {
            System.out.printf("%d, es un número es IMPAR.\n", number);
        }

        entrada.close();
    }
}
