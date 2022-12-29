class Logic {
    public static void main(String args[]) {
        int a = 5, b = 6;
        boolean resultOne, resultTwo;
        resultOne = (a < b) && (b > a);
        resultTwo = (a < b) || (a > b);
        System.out.println("Output of AND operator, " + resultOne);
        System.out.println("Output of OR operator, " + resultTwo);
    }

}
