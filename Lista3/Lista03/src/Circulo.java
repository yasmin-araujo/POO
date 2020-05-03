public class Circulo extends FigurasGeometricas
{
    private double raio;

    Circulo(double raio, String cor, boolean filled)
    {
        super(cor, filled);
        this.raio = raio;
    }

    public double area(double raio)
    {
        return 3.14 * raio * raio;
    }

    public double perimetro(double raio)
    {
        return 2 * 3.14 * raio;
    }
}
