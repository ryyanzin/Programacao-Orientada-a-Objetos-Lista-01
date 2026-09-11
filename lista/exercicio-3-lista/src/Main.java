import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner (System.in);

    System.out.println("Informe um número inteiro positivo: ");
    int num = scanner.nextInt();
    if(num <= 1) System.out.println("\nNão há números primos ou o número não é positivo. ");
    else System.out.println("\nNúmeros primos encontrados: ");

    for(int k=2; k<=num; k++){
        int contador = 0;

        for(int i=1; i<=k; i++){
        if(k % i == 0)contador++;
    }

        if (contador == 2) System.out.println(k);

    }

}

