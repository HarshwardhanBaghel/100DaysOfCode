public class AddDigits
{
    public static void main(String[] args) {
        int ans = addDigits(38);
        System.out.println(ans);

    }

    public static int addDigits(int num) {
        if(num==0)  
            return 0;
        if(num%9==0) 
            return 9;
        return num%9;  
        //number mod 9 will give the addition digits until the result has only one digit
    }
}