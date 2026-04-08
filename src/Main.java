public class Main  {
    public static void main(String[] args) {
      //obj 1

       uzumaki naruto = new uzumaki();
       naruto.setNome("naruto uzumaki");
       naruto.getNome();
        System.out.println("meu nome é "+ naruto.getNome());
       naruto.tembiju = true;
       naruto.ataqueBasico();


      //obj 2

        uchirra sasuke = new uchirra();
         sasuke.setNome("sasuke uchirra");
         sasuke.getNome();
        System.out.println("meu nome é " + sasuke.getNome()+ " e eu vou matar um certo alguém");
        sasuke.ataqueBasico();
        sasuke.ataqueBasico(2);
    }
}
