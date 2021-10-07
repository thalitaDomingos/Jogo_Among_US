package thalita;

public abstract class Astronauta {
    public static int cont;
    private String cor;
    private String nome;

    public Skin skin;
    public Pet pet;

    public Astronauta(String cor, String nome, Skin skin, Pet pet) {
        this.cor = cor;
        this.nome = nome;
        this.skin = skin;
        this.pet = pet;
        cont++;
    }

    public void mostraInfo() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: " + this.nome);

        if (skin != null)
            System.out.println("Skin: " + this.skin.getTipo());
        else
            System.out.println("Skin: não possui skin");

        if (pet != null)
            System.out.println("Pet: " + this.pet.getNome());
        else
            System.out.println("Pet: não possui pet");
    }

    public void verCameras() {
        System.out.println(this.nome + " olhou as câmeras");
    }

    public abstract void reportar();
    public abstract void reparar();

    public String getNome() {
        return nome;
    }
}