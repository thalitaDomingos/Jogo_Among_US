package thalita;

public class Principal {
    public static void main(String[] args) {
        Tripulante tripulante = new Tripulante("Ciano", "Thalita", new Skin("chapéu"), new Pet("cachorro"), 7);
        Impostor impostor = new Impostor("Preto", "Maggie", new Skin("chapéu"), new Pet("gato"), 0);

        Astronauta[] astronautasArray = new Astronauta[2];

        astronautasArray[0] = tripulante;
        astronautasArray[1] = impostor;

        for (Astronauta astronauta : astronautasArray) {
            System.out.println(" ");

            if (astronauta instanceof Tripulante) {
                Tripulante t1 = (Tripulante) astronauta;
                t1.fazerMissao();
                t1.verCameras();
                t1.reportar();
                t1.reparar();
                t1.mostraInfo();

            } else if (astronauta instanceof Impostor) {
                Impostor i1 = (Impostor) astronauta;
                i1.fazerMissao();
                i1.sabotarLuz();
                i1.sabotarOxigenio();
                i1.sabotarReator();
                i1.sabotarComunicacao();
                i1.executar();
                i1.usarVentoinha();
                i1.trancarPortas("sala de oxigênio");
                i1.verCameras();
                i1.reportar();
                i1.reparar();
                i1.mostraInfo();
            }
        }
        System.out.println(" ");
        System.out.println("Foram criados: " + Astronauta.cont + " astronautas");
        System.out.println("Quantidade de mortes: " + impostor.getQuantidadeMortes());
        System.out.println("Quantidade de missões: " + tripulante.getQuantidadeMissoes());
    }
}
