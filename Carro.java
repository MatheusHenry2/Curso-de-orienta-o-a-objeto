import java.sql.SQLOutput;

public class Carro extends Veiculo {

    private int cilindradas;
    private boolean airbag;

    public Carro(int ano, String modelo, String marca, int cilindradas) {
        super(ano, modelo, marca);
        this.cilindradas = cilindradas;
    }


    public String toString() {
        return "carro fabricando em " + getAnoDeFabricacao() + "com " + this.cilindradas;
    }

    public static void main(String arg[]) {
        Carro forBigode = new Carro(1910, "bigode", "ford", 2900);

        System.out.println(forBigode.toString());
    }
}
