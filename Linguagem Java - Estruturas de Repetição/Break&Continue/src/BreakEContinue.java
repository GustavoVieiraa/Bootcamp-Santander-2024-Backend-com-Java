public class BreakEContinue {
    public static void main(String[] args) throws Exception {
        
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                //break;
                continue;
            }
            System.out.println(n);
        }

    }
}
