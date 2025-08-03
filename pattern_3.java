
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567
// 12345678
// 123456789
// 12345678910

public class pattern_3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // rows wali loop
            for (int j = 1; j <= i; j++) { // column wali loop
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
