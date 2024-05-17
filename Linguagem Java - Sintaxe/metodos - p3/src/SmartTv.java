public class SmartTv {

    /*
                                Exercitando
            Vamos criar um exemplo de uma classe para representar
            uma SmartTV onde:
                - Ela tenha as características: ligada (boolean), canal (int),
                e volume (int).
                - Nossa TV poderá ligar e desligar e assim mudar o estado de ligada.
                - Nossa TV aumentará e dimunuirá o volume sempre em +1 ou -1.
                - Nossa TV poderá mudar de canal de 1 em 1 ou definindo o
                número correspondente.
      
     */

     boolean status = false;
     int canal = 1;
     int volume = 25;


    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal atual: " + canal);
    }
    
    public void diminuirCanal() {
        canal--;
        System.out.println("Canal atual: " + canal);
    }



    public void ligar() {
        status = true;
    }

    public void desligar() {
        status = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Status volume: " + volume);
    }

    public void diminiuirVolume() {
        volume--;
        System.out.println("Status volume: " + volume);
    }

}

