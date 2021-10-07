package thalita;

public class Tripulante extends Astronauta implements Missao{
    private int quantidadeMissoes;

    public Tripulante(String cor, String nome, Skin skin, Pet pet, int quantidadeMissoes){
        super(cor,nome, skin, pet);
        this.quantidadeMissoes = quantidadeMissoes;
    }

    public int getQuantidadeMissoes() {
        return quantidadeMissoes;
    }

    @Override
    public void reportar() {
        System.out.println(this.getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(this.getNome() + " fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(this.getNome() + " fez uma missão");
        quantidadeMissoes -= 1;
    }
}
