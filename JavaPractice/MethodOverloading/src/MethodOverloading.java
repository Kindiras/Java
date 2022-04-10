public class MethodOverloading{
    public static void main(String[] args){
        int first = CalculateScore(20);
        double second = CalculateScore(20,0.2);
        System.out.println("Firstmethodis:" + first);
        System.out.println("Secondmethodoverloadi:" + second);
    }
    public static int CalculateScore(int number){
        return number*100;
    }
    public static double CalculateScore(int number,double num){
        return (number*num);
    }
}