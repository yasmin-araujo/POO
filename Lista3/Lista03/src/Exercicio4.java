public class Exercicio4
{
    public static void main(String[] args)
    {
        Loja loja = new Loja();
        loja.addProduto(123, "Harry Potter", "Livro");
        loja.addProduto(123, 2,"Harry Potter", "Livro");
        loja.addProduto(456, "Imagine Dragons", "CD");
        loja.addProduto(789, 5, "Bee Movie", "DVD");
        loja.mostraProdutos();
        loja.mostraCategoria();
        loja.vendeProduto( 789 );
        loja.vendeProduto( 456 );
        loja.vendeProduto( 456 );
        loja.mostraProdutos();
        loja.mostraCategoria();
    }
}
