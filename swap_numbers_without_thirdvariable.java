public class swap_numbers_without_thirdvariable {
    public static void main(String[] args) {
    int a=3;
    int b=5;
    a-=b;
    b+=a; 
    a=b-a;

    System.out.println(+a+","+b);
    }
}
//use same logic using bitwise same operand =0 and different number itself.
