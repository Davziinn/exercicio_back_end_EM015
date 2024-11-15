public class CarroPopularFactory implements ICarroFactory{
    @Override
    public IMotor criarMotor() {
        return new MotorPopular();
    }

    @Override
    public IInterior criarInterior() {
        return new InteriorPopular();
    }
}
