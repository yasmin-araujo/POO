public class Elevador {
    private int andar_atual = 0;
    private int total;
    private int capacidade;
    private int num_pessoas = 0;

    Elevador(int total, int capacidade) {
        this.total = total;
        this.capacidade = capacidade;
    }

    public int getAndar_atual() {
        return andar_atual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNum_pessoas() {
        return num_pessoas;
    }

    public int getTotal() {
        return total;
    }

    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setNum_pessoas(int num_pessoas) {
        this.num_pessoas = num_pessoas;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void entra() {
        if (num_pessoas < capacidade)
            num_pessoas++;
    }

    public void sai() {
        if (num_pessoas > 0)
            num_pessoas--;
    }

    public void sobe() {
        if (andar_atual < total)
            andar_atual++;
    }

    public void desce() {
        if (andar_atual > 0)
            andar_atual--;
    }
}
