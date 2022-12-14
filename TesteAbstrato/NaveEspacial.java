package TesteAbstrato;


public class NaveEspacial implements ObjetoEspacial {

    int x, y;

    @Override
    public int getPosicaoX(){
        return x;
    }

    public int getPosicaoY(){
        return y;
    }

    @Override
    public int setPosicaoX() {
        return 0;
    }

    @Override
    public int setPosicaoY() {
        return 0;
    }

    @Override
    public void exploda(int intensidadeDaExplosao) {

    }

    @Override
    public boolean colideCom(ObjetoEspacial oe) {
        return false;
    }

    @Override
    public byte[] suaMusica() {
        return new byte[0];
    }

    @Override
    public String nome() {
        return null;
    }

    @Override
    public String descricao() {
        return null;
    }

}
