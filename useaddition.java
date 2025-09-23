class Addition{
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
}
class UseAddition{
    public static void main(String[] args) {
        Addition obj;
        obj = new Addition();
        System.out.println(obj.add(2, 4));
        System.out.println(obj.add(22.6, 28.7));
    }
}