public class FigurasGeometricas
{
    private String cor;
    private boolean filled;

    FigurasGeometricas(String cor, boolean filled)
    {
        this.cor = cor;
        this.filled = filled;
    }

    public double area(double lado1, double lado2)
    {
        return lado1 * lado2;
    }

    public double perimetro(double lado1, double lado2)
    {
        return lado1 * 2 + lado2 * 2;
    }
}
