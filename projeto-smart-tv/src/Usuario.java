public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("TV LIGADA? " + smartTv.ligada);
       System.out.println("Canal atual: "+ smartTv.canal);
       System.out.println("Volume: " + smartTv.volume);

          smartTv.ligar ();

          smartTv.mudarCanal(13);
          System.out.println("Canal atual: "+ smartTv.canal);
          
       System.out.println("TV LIGADA? " + smartTv.ligada);  
       
       smartTv.desligar ();

       System.out.println("TV LIGADA? " + smartTv.ligada);  
    
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();

       System.out.println("Volume: " + smartTv.volume);



    }
}
