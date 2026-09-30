
public class Main {

    public static void main(String[] args) {

        int i, j, soma;

        for (i = 1; i <= 4; i = i + 1) {
            System.out.println("Tabuada do :" + i);
            for (j = 0; j <= 10; j = j + 1) {
                soma = i * j;
                System.out.println(i + "*" + j + "=" + soma);
            }
        }

    }
}
