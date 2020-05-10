import java.util.ArrayList;
import java.util.List;

public class Loja
{
    List<Produto> produtos = new ArrayList<>();

    public void addProduto(int codigo, String nome, String categoria)
    {
        int index = buscaProdutoCodigo(codigo);
        // Se produto não existe, adiciona, senão aumenta a quantidade
        if(index == -1)
        {
            Produto p;
            if(categoria == "Livro")
                p = new Livro(codigo, 1, nome);
            else if(categoria == "CD")
                p = new CD(codigo, 1, nome);
            else
                p = new DVD(codigo, 1, nome);
            produtos.add(p);
        }
        else
        {
            produtos.get(index).aumentaQtd(1);
        }
    }

    public void addProduto(int codigo, int qtd, String nome, String categoria)
    {
        int index = buscaProdutoCodigo(codigo);
        // Se produto não existe, adiciona, senão aumenta a quantidade
        if(index == -1)
        {
            Produto p;
            if(categoria == "Livro")
                p = new Livro(codigo, qtd, nome);
            else if(categoria == "CD")
                p = new CD(codigo, qtd, nome);
            else
                p = new DVD(codigo, qtd, nome);
            produtos.add(p);
        }
        else
        {
            produtos.get(index).aumentaQtd(qtd);
        }
    }

    public int buscaProdutoCodigo(int codigo)
    {
        for (int i = 0; i < produtos.size(); i++)
        {
            if(produtos.get(i).getCodigo() == codigo) return i;
        }
        return -1;
    }

    public int buscaProdutoNome(String nome)
    {
        for (int i = 0; i < produtos.size(); i++)
        {
            if(produtos.get(i).getNome() == nome) return i;
        }
        return -1;
    }

    public void vendeProduto(int codigo)
    {
        int index = buscaProdutoCodigo(codigo);
        if(produtos.get(index).getQtd() == 0)
        {
            System.out.println("\nProduto esgotado");
            return;
        }

        produtos.get(index).aumentaQtd(-1);
    }

    public void mostraProdutos()
    {
        for (int i = 0; i < produtos.size(); i++)
        {
            System.out.println("\nProduto " + i + "\nCódigo: " + produtos.get(i).getCodigo() + "\nNome: " + produtos.get(i).getNome() + "\nQuantidade: " + produtos.get(i).getQtd());
        }
    }

    public void mostraCategoria()
    {
        int livros = 0;
        int cds = 0;
        int dvds = 0;
        for (int i = 0; i < produtos.size(); i++)
        {
            if(produtos.get(i) instanceof Livro)
                livros += produtos.get(i).getQtd();
            else if(produtos.get(i) instanceof CD)
                cds += produtos.get(i).getQtd();
            else if(produtos.get(i) instanceof DVD)
                dvds += produtos.get(i).getQtd();
        }
        System.out.println("\nCategorias: \nLivros: " + livros  + " und. \nCDs: " + cds + " und.\nDVDs: " + dvds + " und.");
    }
}
