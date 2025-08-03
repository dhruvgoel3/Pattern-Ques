// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777
// 88888888
// 999999999
// 10101010101010101010

public class pattern_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // rows wali loop
            for (int j = 1; j <= i; j++) { // column wali loop
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
