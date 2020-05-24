import java.io.IOException;

public class Bozo
{
    public static void main(String[] args) throws java.io.IOException
    {
        RolaDados rd = new RolaDados(5);
        Placar placar = new Placar();

        String dados;       // Dados a serem rolados novamente
        int[] lados = {0};  // Lados tirados
        int pos;            // Posição a ser guardada a pontuação

        // 10 rodadas
        for (int i = 1; i < 11; i++)
        {
            // Consistência para entrada de teclado
            while (true)
            {
                System.out.println("\nPressione ENTER para jogar os dados ");
                try
                {
                    String ch = EntradaTeclado.leString();
                    break;
                } catch (Exception e)
                {
                    System.out.println("Erro, pressione novamente ");
                }
            }

            System.out.println(" ------ Rodada " + i + " ------\n");

            // Rola os dados e mostra na tela
            rd.rolar();
            System.out.println(rd.toString());

            // Dados podem ser rolados mais 2 vezes
            for (int j = 0; j < 2; j++)
            {
                System.out.println("Escolha os dados a serem rolados: (0 para manter)");

                // Consistência de entrada do teclado
                while (true)
                {
                    try
                    {
                        dados = EntradaTeclado.leString();

                        // Se usuário digitar 0 mantém, do contrário rola os dados selecionaods novamente
                        if (!dados.contains("0"))
                            lados = rd.rolar(dados);

                        // Mostra novos valores dos dados
                        System.out.println(rd.toString());
                        break;
                    } catch (Exception e)
                    {
                        System.out.println("Digite novamente: ");
                    }
                }
            }

            // Mpstra placar na tela
            System.out.println(placar.toString());
            System.out.println("Selecione a posição a ser ocupada: ");

            // Consistência para entrada do teclado
            while (true)
            {
                try
                {
                    pos = EntradaTeclado.leInt();

                    // Se for uma posição válida, insere
                    if (pos > 0 && pos < 11)
                    {
                        placar.add(pos, lados);
                        break;
                    }
                    else
                    {
                        throw new IOException();
                    }
                } catch (Exception e)
                {
                    System.out.println("Digite novamente: ");
                }
            }

            // Mostra placar após mudanças
            System.out.println(placar.toString());
        }

        // Exibe pontuação final
        System.out.println("Total de pontos: " + placar.getScore());
    }
}
