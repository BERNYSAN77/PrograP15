package ejercarroPrivate;



public class MainCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();


        c1.setVelocidad(100);
        c1.setPotencia(2.5);

        c2.setVelocidad(50);
        c2.setPotencia(2.5);


        c1 = c2;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.frena();

        System.out.println("La velocidad de c1 es "+c1.getVelocidad());
        System.out.println("La potencia de c1 es "+c1.getPotencia());

        System.out.println("La velocidad de c2 es "+c2.getVelocidad());
        System.out.println("La potencia de c2 es "+c2.getPotencia());
    }
}
