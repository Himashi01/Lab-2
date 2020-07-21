class Distance2 {
    public static void main(String args[]){
        final int miles, yards;
        double kilometers;
        double a;
        double b;

        miles = 26;
        yards = 385;

        a = miles * 1.609;
        b = yards * 1760;

        kilometers = a + b;

        System.out.println("Kilometers: " + kilometers);


    }
}