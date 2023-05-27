public class Main {

    public static void main(String[] args){
        Main app = new Main();
        app.start();
    }

    private void start() {

        int idade = 15;
        System.out.println("A idade e de " + idade + " anos");

        idade = (idade + 5) * 2;
        System.out.println("Resultado 1: " + idade);

        idade = idade - 5;
        System.out.println("Resultado 2: " + idade);

        if (idade > 20) {
            System.out.println("A idade e maior que 20");
        }else{
            System.out.println("Idade menor que 20");
            }
        }
    }
