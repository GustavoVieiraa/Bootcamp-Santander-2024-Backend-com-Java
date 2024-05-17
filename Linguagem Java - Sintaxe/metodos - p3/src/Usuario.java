public class Usuario {

    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.mudarCanal(15);
        smartTv.aumentarVolume();

        System.out.println("TV Volume: " + smartTv.volume);
        System.out.println("TV Canal: " + smartTv.canal);
        System.out.println("Status TV: " + smartTv.status);
        

    }
    
}
