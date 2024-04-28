public class MyClass {
    
    public static void main (String [] args) {
        
          String meuNome = "Gustavo";

          int anoFabricacao = 2024;

          boolean isTrue = true;

          anoFabricacao = 2025;

          String nomeCompleto = nomeCompleto("Gustavo", "Vieira");

          System.out.print(nomeCompleto);
    }

    public static int somar (int numUm, int numDois) {
        return numUm + numDois;
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome + " " + segundoNome;
    }

}