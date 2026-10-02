public class OperatorLab {
    public static void main(String[] args) {
        // Del 1
        int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);

// Del 2
int number = 17;

System.out.println(number % 2);
/* 
Vad blir resultatet? Resultatet blir 1 
Vad händer om number ändras till 18? Resultatet blir 0 
Vad kan % 2 användas till? % 2 kan användas för att avgöra om ett tal är jämnt eller ojämnt.

 */

// Del 3


        int age = 20;

        boolean test1 = age > 18;
        boolean test2 = age < 18;
        boolean test3 = age == 20;
        boolean test4 = age != 20;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);

        boolean hasTicket = true;
        boolean isAdult = true;

        boolean allowed = hasTicket && isAdult;
        System.out.println(allowed);

        // Testa även ||
        allowed = hasTicket || isAdult;
        System.out.println(allowed);

        
    
    }
}
