package Mecanica;

public class FabricaMecanicaDoJogo {
    public MecanicaDoJogo iniciarMecanicaDoJogo(int modoDeJogo) {
        if (modoDeJogo == 1) {
            return new MecanicaDoJogoNormal();
        } else {
            return new MecanicaDoJogoMorteSubita();
        }
    }
}
