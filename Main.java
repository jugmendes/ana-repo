import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        Main app = new Main();
        app.start();
    }

    private void start() {
        System.out.println("Digite o valor do produto: ");

        Scanner scanner = new Scanner(System.in);
        double valor = scanner.nextDouble();
        int value = (int) valor;

        System.out.println("Valor: " + valor);
        System.out.println("Valor com casas decimais: " + valor + " | Valor inteiro: " + value);

        int valueNovo = 10;
        double valorNovo = valueNovo;
        int valueNovoNovo = (int) valorNovo;

        System.out.println("Novo: " + valueNovo + " | Convertido: " + valorNovo);
    }
}
