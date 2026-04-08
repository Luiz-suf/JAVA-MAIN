public class ninja {
   private String nome;
    String aldeia;
    String jutsu;
    int idade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void lançarJutsu(){
        System.out.println("estilo vento onana " + jutsu);
    }

    public void ataqueBasico() {
        System.out.println("ataque lancado");
    }

}
