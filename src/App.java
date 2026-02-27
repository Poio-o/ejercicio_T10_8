import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Carta> cartas = new ArrayList<>();

        while (cartas.size() < 10) {
            Carta nuevaCarta = new Carta();
            boolean repetida = false;

            for (Carta carta : cartas) {
                if (carta.getNumero().equals(nuevaCarta.getNumero()) &&
                        carta.getPalo().equals(nuevaCarta.getPalo())) {
                    repetida = true;
                    break;
                }
            }

            if (!repetida) {
                cartas.add(nuevaCarta);
            }
        }

        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}