public class ControleRemoto {
    Televisao tv = new Televisao();

    void aumentarVolume()
    {
        tv.setVolume(tv.getVolume() + 1);
    }

    void diminuirVolume()
    {
        tv.setVolume(tv.getVolume() - 1);
    }

    void mudarVolume(int i)
    {
        tv.setVolume(i);
    }

    void aumentarCanal()
    {
        tv.setCanal(tv.getCanal() + 1);
    }

    void diminuirCanal()
    {
        tv.setCanal(tv.getCanal() - 1);
    }

    void mudarCanal(int i)
    {
        tv.setCanal(i);
    }

    void verCanal()
    {
        System.out.println("Canal: " + tv.getCanal());
    }

    void verVolume()
    {
        System.out.println("Volume: " + tv.getVolume());
    }

}
