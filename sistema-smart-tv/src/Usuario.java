public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        

        smartTv.diminuirVomume();
        smartTv.diminuirVomume();
        smartTv.diminuirVomume();
        smartTv.aumentarVolume();
        
        smartTv.mudarCanal(13);


        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);




    }
}
