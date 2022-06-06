package general;

public class StringReverse {
    public static void main(String[] args) {
        String stringVal = "ReverseThis";


        //Solution-1

        StringBuilder sb = new StringBuilder(stringVal);
        System.out.println(sb.reverse());

        //Solution-2

        int len = stringVal.length();
        StringBuilder sb1 = new StringBuilder(len);
        for(int i = len-1;i>=0;i--){
            sb1.append(stringVal.charAt(i));
        }
        System.out.println(sb1);

        //Solution-3

        String outPut = "";
        for(int i=stringVal.length()-1;i>=0;i--){
            outPut = outPut+stringVal.charAt(i);
        }
        System.out.println(outPut);
    }
    
}
