import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe seu nome: ");
    String nome = scanner.next();

    System.out.println("Informe as três notas: ");
    int nota1 = scanner.nextInt();
    int nota2 = scanner.nextInt();
    int nota3 = scanner.nextInt();

    float media = (nota1 * 1) + (nota2 * 1) + (nota3 * 2);
    float mediaPonderada = media / (1 + 1 + 2);

    if(mediaPonderada >= 7) System.out.println("\nParabéns, " + nome + "!\nA sua média foi: " + mediaPonderada + "\nFoi aprovado(a)!");
    else System.out.println("\nInfelizmente, " + nome + "...\nA sua média foi: " + mediaPonderada + "\nFoi reprovado(a).");

}