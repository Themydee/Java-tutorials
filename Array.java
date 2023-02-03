public class Array {
    public static void main(String[] args) {
        String[][] words = {
                { "toyota", "infinity" }, { "Mercedes", "Benz" }, { "Mitsubushi", "Volkswagen" }
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; i++) {
                System.out.println(words[i][j]);
            }
        }
    }
}

