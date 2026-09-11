# Programacao-Orientada-a-Objetos-Lista-01

Lista de Exercícios — Programação Orientada a Objetos:

## Exercícios Teóricos:

5. Scanner e System.out.printf

O `Scanner` é utilizado para realizar a entrada de dados pelo teclado, permitindo a leitura de diferentes tipos de variáveis, como `int`, `double` e `float`. 
Já o `System.out.printf` permite formatar a saída de dados, como definir a quantidade de casas decimais exibidas.

Exemplo:

```
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
double numero = scanner.nextDouble();
System.out.printf("Número: %.2f%n", numero);
```

============================================

6. Erros encontrados:

-String args deveria ser String[] args.
-Faltou o ponto e vírgula (;) após o System.out.println.
-A variável contador não era incrementada dentro do while, fazendo com que o programa entrasse em um loop infinito.


Código corrigido:

```

    void main(){
    
        int contador = 0;
        
        while (contador <= 5) {

            System.out.println("Contador: " + contador);
            contador++;

        }
        
    }


