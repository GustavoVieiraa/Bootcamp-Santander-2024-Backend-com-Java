package edu.gusta.primeirasemana;
public class BoletimDoEstudante {
    
    public static void main(String[] args) {
        
        int mediaFinal = 10;

        if (mediaFinal < 7) {
            System.out.println("Você foi reprovado!");
        }
        else if (mediaFinal == 7) {
            System.out.println("Você está de recuperação!");
        } 
        else {
            System.out.println("Você foi APROVADO!");
        }

    }

}
