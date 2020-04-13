public class Senha {
    public static void main(String[] args) {
        int max = 0;
        int num = 0;
        int chute = 0;
        int cnt = 0;

        Random rdm = new Random();

        System.out.println("Digite um número máximo: ");
        while (true)
        {
            try
            {
                max = EntradaTeclado.leInt();
                break;
            } catch (Exception e)
            {
                System.out.println("Digite um valor válido: ");
            }
        }

        num = rdm.getIntRand(max);

        do
        {
            System.out.println("Digite seu chute: ");
            while (true)
            {
                try
                {
                    chute = EntradaTeclado.leInt();
                    cnt++;
                    break;
                } catch (Exception e)
                {
                    System.out.println("Digite um valor válido: ");
                }
            }
        }
        while (chute != num);

        System.out.println("Você acertou! O número era " + num);
        System.out.println("Número de tentativas: " + cnt);
    }
}
