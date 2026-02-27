public class Carta {

    private final String[] palos = { "Oros", "Copas", "Espadas", "Bastos" };
    private final String[] numeros = { "1", "2", "3", "4", "5", "6", "7", "10", "11", "12" };

    protected String numero = numeros[(int) (Math.random() * numeros.length)];
    protected String palo = palos[(int) (Math.random() * palos.length)];

    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", numero, palo);
    }

}