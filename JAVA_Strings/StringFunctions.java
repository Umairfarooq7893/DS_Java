import java.util.Scanner;

public class StringFunctions {
    public static void main (String[]args){
        Scanner umi = new Scanner(System.in);

        String str1, str2, str3, str4;
// Enter the first String
        System.out.println("Enter the first string");
        str1 = umi.next();
// Enter the second String
        System.out.println("Enter the second string");
        str2 = umi.next();
// Enter the fourth String
        System.out.println("Enter the third string");
        str3 = umi.next();

        // 1. Length
        System.out.println("Length of the str1 :"+ str1.length());

        // 2. compareTo
        int cmp = str1.compareTo(str2);
        System.out.println(" result of comparision "+ cmp);

        // 3. toUpperCase / toLowerCase
        System.out.println("upper case str1 : "+str1.toUpperCase());
        System.out.println("lower case str1 : "+str1.toLowerCase());

        // 4. copy
        str4 = str1;
        System.out.println("str4 (copied from str1): " + str4);

        // 5. concatenate
        String concatenate = str1.concat(str2);
        System.out.println("Concatenated str1 + str2 :" + concatenate);
        
        // 6. Reverse (using StringBuilder)
        StringBuilder sb = new StringBuilder(str3);
        sb.reverse();
        System.out.println("Reverse of str3: "+sb);

        // 7. Find a character
        System.out.print("Enter a character to search in str2: ");
        char ch = umi.next().charAt(0);
        
        int index = str2.indexOf(ch);

        if(index != -1)
            System.out.println("Character '"+ch+"' found at position: "+(index+1));
        else
            System.out.println("Character '"+ch+"' not found");


        // 8. Find a substring
        System.out.println("Enter a substring to search in str2: ");
        str4 = umi.next();

        int subIndex = str2.indexOf(str4);
        if (subIndex != -1)
            System.out.println("Substring \""+str4+"\" found at position: "+ (subIndex +1));
        else
            System.out.println("Substring \""+ str4 +"\" not found");

        // 9. count  vowels in str2
        int vowels = 0;
        for(int i = 0; i< str2.length(); i++){
            char c = Character.toLowerCase(str2.charAt(i));
            if (c == 'a' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
        }
        System.out.println("Number of vowels in str2: "+vowels);

        umi.close();
    }
    
}
