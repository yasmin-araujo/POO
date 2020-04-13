import java.util.ArrayList;

public class Exercicio4 {
    static ArrayList<ContaCorrente> cc = new ArrayList<>();
    public static void main(String[] args) {
        ContaCorrente n1 = new ContaCorrente(12, "Bradesco", "Bruna", 250.4);
        ContaCorrente n2 = new ContaCorrente(15, "Santander", "Luana", 2880.0);
        ContaCorrente n3 = new ContaCorrente(48, "Banco do Brasil", "Lívia", 800.50);
        ContaCorrente n4 = new ContaCorrente(42, "Bradesco", "Lana", 1250.86);
        cc.add(n1);
        cc.add(n2);
        cc.add(n3);
        cc.add(n4);

    }
}
