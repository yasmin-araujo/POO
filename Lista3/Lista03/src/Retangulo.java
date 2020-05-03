public class Retangulo extends FigurasGeometricas
{
    private double lado1, lado2;

    Retangulo(double lado1, double lado2, String cor, boolean filled)
    {
        super(cor, filled);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
}
