public class CarroDeLuxoFactory implements ICarroFactory{
    @Override
    public IMotor criarMotor() {
        return new MotorLuxo();
    }

    @Override
    public IInterior criarInterior() {
        return new InteriorLuxo();
    }
}
