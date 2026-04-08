public class uchirra extends ninja{
    String nivelDoSharingan = "sharingan 3";

    public void sharinganAtivado(){
        System.out.println("sharingan!!");
    }

    @Override
    public void ataqueBasico(){
        System.out.println("ataque lancado com FOGOO");
    }
    public  void ataqueBasico(int nivelDeChacara){
        if(nivelDeChacara > 2 ){
            System.out.println("suzano ativado");
        } else if (nivelDeChacara > 1 ) {
            System.out.println("eu so consigo ativar o sharingan");
        }
        else {
            System.out.println("droga eu to sem chacara!!!");
        }
    }
}
