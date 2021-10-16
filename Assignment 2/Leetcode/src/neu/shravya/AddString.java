package neu.shravya;

public class AddString {
    public static String addStringsMethod(String num1, String num2) {
        int carry=0;
        String result = "";
        int s1;
        int s2;
        int sum;

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();

        for(int i = 0; i < num1.length() || i < num2.length() ; i++){
            s1 = 0;
            s2 = 0;

            if(i < num1.length())
                s1 = num1.charAt(i) - '0';


            if(i < num2.length())
                s2 = num2.charAt(i) - '0';


            sum = s1 + s2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            result = sum + result;
        }

        if(carry!=0){
            result = carry + result;
        }

        return result;
    }
}
