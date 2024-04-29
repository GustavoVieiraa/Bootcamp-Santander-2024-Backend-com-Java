/*
                        Tipos Primitivos

        Int, Byte, Short, Long, Float, Double, Boolean e Char
        esses tipos não são considerados objetos, e portanto 
        representam valores brutos.
        Eles são armazenados diretamente na pilha de memória.
        (Memory stack)
 */

 public class TiposVariaveis {

    public static void main(String[] args) {
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting

    }

 }