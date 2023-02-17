package day03_variables;

public class PrimitiveDataTypesIntro {

    public static void main(String[] args) {

        // DataType variableName = Data ;
        
       // byte a = "Java"; compile error byte only accepts integer values (-128 ~ 127)

        // byte a = 20.5 ; byte can not take decimal numbers

        // byte a = 2000 ; (int) out of byte range (-128 ~ 127 )

        
        byte a= 12;
        System.out.println("a = " + a);


        // price of the car is $17500
        
        short p = 17500 ;
        System.out.println("p");
        System.out.println(p);
        
        // salary is $95000
        
        int s = 95000 ; // prefered
        System.out.println("s = " + s);

       // int n = 9999999999 ; out of int range

        long n = 999999999L;

        // gpa is 3.5
        double gpa1 = 3.5 ; // preferred

        float gpa2 = 3.5f ;


        
    }
}
