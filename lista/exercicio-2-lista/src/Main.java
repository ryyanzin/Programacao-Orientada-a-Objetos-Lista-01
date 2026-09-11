import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int num = scanner.nextInt();

    if(num % 3 == 0 && num % 5 == 0) System.out.println("O número '" + num + "' é múltiplo de 3 e 5.");
    else if(num % 3 == 0) System.out.println("O número '" + num + "' é múltiplo de 3.");
    else if(num % 5 == 0) System.out.println("O número '" + num + "' é múltiplo de 5.");
    else System.out.println("\nO número '" + num + "' não é múltiplo de 3 e 5.");

}