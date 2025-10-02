package ejercarroPrivate;

public class Carro {
    private double velocidad;
    private double potencia;

    //metodos

    //get y set

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    public void setPotencia(double potencia){
        this.potencia = potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }

    public double getPotencia(){
        return potencia;
    }

    public void acelerar(){
        velocidad += potencia;
    }


    public void frena(){
        velocidad /= 2;
    }
}
