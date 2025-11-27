class LoopDemo {
    public static void main(String[] args) {
        System.out.println("Pattern using nested for loop:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}