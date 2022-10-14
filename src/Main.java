class StringPalindrome {
    public static void main(String args[]){
        String myString = "А роза упала на лапу Азора";

        String myString1=myString.toLowerCase();

        String c=myString1.replace(" ","");


        StringBuffer buffer = new StringBuffer(c);
        buffer.reverse();

        String data = buffer.toString();
        if(c.toLowerCase().equals(data)){
            System.out.println("Строка является полиндромом");
        }else{
            System.out.println("Строка не является полидромом");

        }
    }
}