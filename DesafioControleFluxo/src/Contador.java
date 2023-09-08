import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro a seguir: ");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Agora,digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try{
            System.out.println("Chamando contarNumeros com parametros");
            contarNumeros(primeiroParametro, segundoParametro);

        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();

    }

    static void contarNumeros(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = segundoParametro - primeiroParametro;

            for(int contador = 1; contador <= contagem; contador++  ){
            System.out.println("Imprimindo o numero "+ contador);
            }

        }
    }
}
