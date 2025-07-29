public class pairs {
    public static void printpairs(String[] args) {
        int n = args.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println("(" + args[i] + ", " + args[j] + ")");
            }
        }
        
    }
    public static void main(String[] args) {
        String[] input = {"apple", "banana", "cherry"};
        printpairs(input);
    }
}
