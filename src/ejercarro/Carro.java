package ejercarro;

public class Carro {

    //atributos
    public double velocidad;
    double potencia;

    //metodos
    public void acelerar(){
        velocidad += potencia;
    }

    void frena(){
        velocidad /= 2;
    }


}
