package thalita;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar{
    private int quantidadeMortes;

    public Impostor(String cor, String nome, Skin skin, Pet pet, int quantidadeMortes){
        super(cor,nome, skin, pet);
        this.quantidadeMortes = quantidadeMortes;
    }

    public void usarVentoinha() {
        System.out.println("O impostor se escondeu na ventilação");
    }

    public void trancarPortas (String local) {
        System.out.println("O impostor trancou as portas do(a) " + local);
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fingiu que fez um reparo");
    }

    @Override
    public void executar() {
        System.out.println(this.getNome() + " matou um tripulante");
        quantidadeMortes += 1;
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma tarefa falsa");
    }

    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigênio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");
    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicação");
    }

    public int getQuantidadeMortes() {
        return quantidadeMortes;
    }
}
