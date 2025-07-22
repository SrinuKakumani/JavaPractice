public class Operators {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = 40;
        int d = 10;
        
        System.out.println("sum1:"+(a+b));
        System.out.println("sum2 :"+(a-b));
        System.out.println("sum3:"+(a*d));
        System.out.println("sum3:"+(c/d));

        System.out.println("A++:"+ ++a);
        System.out.println("++D:"+ d++);
        System.out.println("C--:"+ c--);
        System.out.println("--B:"+ --b);

        System.out.println("a is greater than b: "+(a>b));
        System.out.println("b is equal to d: "+(b==d));
        System.out.println("c is greater than equal to a: "+(c>=a));
    }
}
