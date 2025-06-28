import java.util.*;

public class CodeForecs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;

            for (int i = 1; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    String a = s.substring(0, i);
                    String b = s.substring(i, j);
                    String c = s.substring(j);

                    String ac = a + c;

                    if (ac.contains(b)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) break;
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
