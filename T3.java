public class T3 {
    public static void main(String[] args) {
        int[] xs = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        for (int i : xs) {
            if (i % 2 == 0) {
                System.out.println( Integer.toString(i));
            }
        }
    }

}
