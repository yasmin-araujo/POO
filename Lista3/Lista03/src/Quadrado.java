public class Quadrado extends FigurasGeometricas
{
    private double lado;

    Quadrado(double lado, String cor, boolean filled)
    {
        super(cor, filled);
        this.lado = lado;
    }

    public double area(double lado)
    {
        return super.area(lado, lado);
    }

    public double perimetro(double lado)
    {
        return super.perimetro(lado, lado);
    }
}
