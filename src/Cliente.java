public class Cliente {
    public static void montarCarro(ICarroFactory factory) {
        IMotor motor = factory.criarMotor();
        IInterior interior = factory.criarInterior();

        System.out.println("Carro montado com:");
        System.out.println(motor.tipo());
        System.out.println(interior.acabamento());
    }

    public static void main(String[] args) {
        CarroDeLuxoFactory fabricaLuxo = new CarroDeLuxoFactory();
        montarCarro(fabricaLuxo);

        CarroPopularFactory fabricaPopular = new CarroPopularFactory();
        montarCarro(fabricaPopular);
    }
}