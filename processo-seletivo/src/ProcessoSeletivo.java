import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
        //selecaoCandidatos();
        String [] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        for(String candidato:candidatos){
            System.out.println("Tentando contato com " + candidato);
            contatarCandidatos(candidato);
        }
    }

    static void imprimirSelecionados(){

    }

    static void contatarCandidatos(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else
                System.out.println("CONTATO REALIZADO");

        } while(continuarTentando && tentativasRealizadas < 3);
        
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " após " + tentativasRealizadas +  " tentativas");
        }else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO");
        
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos(){
        String [] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA","DANIELA", "JORGE" };
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0 ;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário " + salarioPretendido);
            
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{
        System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
