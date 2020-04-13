public class ObesidadePessoa {
    private double peso;
    private double altura;

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public double getAltura()
    {
        return this.altura;
    }

    public double calculaIMC()
    {
        return (peso/(altura*altura));
    }

    public void defineObesidade()
    {
        if(calculaIMC() > 25)
            System.out.println("Risco de obesidade");
        else
            System.out.println("Não há risco de obesidade");
    }
}