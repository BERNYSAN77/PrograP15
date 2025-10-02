package ejercarro;

public class MainCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.velocidad = 100;
        c1.potencia = 2.5;

        c2.velocidad = 50;
        c2.potencia = 2.5;

        c1 = c2;

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.frena();

        System.out.println("La velocidad de c1 es "+c1.velocidad);
        System.out.println("La potencia de c1 es "+c1.potencia);

        System.out.println("La velocidad de c2 es "+c2.velocidad);
        System.out.println("La potencia de c2 es "+c2.potencia);
    }
}
