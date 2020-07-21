class Volume {
    public static void main(String args[]){
        double V;
        double h = Double.parseDouble(args[0]);
        double w = Double.parseDouble(args[1]);
        double l = Double.parseDouble(args[2]);
        V = h*w*l;

        System.out.println(V);
    }
}