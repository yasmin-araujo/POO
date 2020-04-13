import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite uma frase: ");
        String str = EntradaTeclado.leString();

        String strx;
        String[] chs = {"a", "e", "i", "o", "u"};

        for(int i = 0; i < 5; i++)
        {
            strx = str.replaceAll(chs[i],"");
            System.out.println("Número de " + chs[i] + ": " + (str.length() - strx.length()));
        }

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("Digite uma palavra: ");
        String str2 = EntradaTeclado.leString().toUpperCase();

        if(str.contains(str2))
            System.out.println("Palavra está contida na string");
        else
            System.out.println("Palavra não contida na string");

        if(str.startsWith(str2))
            System.out.println("Frase começa com a palavra");
        if(str.endsWith(str2))
            System.out.println("Frase termina com a palavra");
    }
}
