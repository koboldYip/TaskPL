import java.util.Scanner;

class task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        String arr = "1";
        for (int i = m; ; i += m-1) {
            if (i > n) i -= n;
            if (i  == 1) break;
            arr += i;
        }
        arr += "\n";
        System.out.print(arr);
    }
}



