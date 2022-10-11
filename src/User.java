public class User {
    public static void main(String [] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv Ligada? "+smartTv.ligada);
//        smartTv.desligar();
//        System.out.println("Tv Ligada? "+smartTv.ligada);

        if(smartTv.ligada == true){
            smartTv.aumentarCanal();
            System.out.println("canal: "+smartTv.canal);
            smartTv.diminuirCanal();
            System.out.println("canal: "+smartTv.canal);

            smartTv.mudarCanal(17);
            System.out.println("Canal selecionado: "+smartTv.canal);

        }
    }
}
