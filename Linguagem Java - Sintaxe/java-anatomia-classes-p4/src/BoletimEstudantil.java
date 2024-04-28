public class BoletimEstudantil {
    public static void main(String[] args) {
        
        int mediaFinal = 2;

        if (mediaFinal < 6) {
            System.out.println("Reprovado!");
        }
        else if (mediaFinal == 6) {
            System.out.println("Prova minerva.");
        }
        else {
            System.out.println("Aprovado, parabéns!");
        }

    }

}
