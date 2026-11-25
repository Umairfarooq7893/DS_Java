import java.util.Scanner;
public class Definition {
    public static void main(String[]args){
        Scanner umi = new Scanner(System.in);

// direct declaration
        String sentence = "Asalamu Alikum ";
// taking input from key borad
        System.out.print("Enter your name");
        String name = umi.next();

// printing
        System.out.print(sentence+name);

// concatation
    String str_con = sentence + name +"Sahab";
        System.out.print(str_con);
        umi.close();
   }
}
