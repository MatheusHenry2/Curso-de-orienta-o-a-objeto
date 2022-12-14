package TesteAbstrato;

public abstract class Movie {

    int duracaoEmMinutos(){
        return 120;
    }

    abstract void play(); /* a gente usa o método abstrato quando a gente não vai implementar o play aqui, exemplo tem 3 tipos de play diferentes metodos diferente a gente so abstrai eles aqui.*/


}
