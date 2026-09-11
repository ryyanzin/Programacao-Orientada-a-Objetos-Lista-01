import java.util.Scanner;

void imprimirAsterisco(int num) {

    for (int k = 1; k <= num; k++){
        System.out.print("*");
    }
    System.out.print("\n");

}

void main() {

    Scanner scanner = new Scanner (System.in);

    System.out.println("Insira cinco números entre 1 e 30: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();
    int num4 = scanner.nextInt();
    int num5 = scanner.nextInt();
    System.out.println("\n");

    imprimirAsterisco(num1);
    imprimirAsterisco(num2);
    imprimirAsterisco(num3);
    imprimirAsterisco(num4);
    imprimirAsterisco(num5);

}