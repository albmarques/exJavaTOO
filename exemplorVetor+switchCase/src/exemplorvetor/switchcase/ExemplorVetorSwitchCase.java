package exemplorvetor.switchcase;

public class ExemplorVetorSwitchCase {

    public static void main(String[] args) {
        final int tamanho = 30;
        int vetorNum[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorNum[i] = i + 10;
            if (vetorNum[i] % 2 == 0) {
                switch (vetorNum[i]) {
                    case 20:
                        System.out.println("Vinte ");
                        break;
                    case 30:
                        System.out.println("Vinte ");
                        break;
                    default:
                        System.out.println(vetorNum[i] + " ");
                }
            }
        }
    }

}
