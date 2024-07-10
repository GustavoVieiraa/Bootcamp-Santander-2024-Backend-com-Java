public class SistemaDeMedida {

    /*          Condicional Switch Case           */

    public static void main(String[] args) throws Exception {
        
            String sigla = "M";

            switch (sigla) {
                case "P":
                    System.out.println("PEQUENO");
                    break;
                case "M":
                    System.out.println("MEDIO");
                    break; 
                case "G":
                    System.out.println("GRANDE");
                    break; 
                default:
                    System.out.println("INDEFINIDO");
                    break;
            }

    }
}
