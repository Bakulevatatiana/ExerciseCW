class StringPalindrome {
    public static void main(String args[]){
        String myString = "анна";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if(myString.equals(data)){
            System.out.println("Строка является полиндромом ");
        }else{
            System.out.println("Строка не является полидромом");
        }
    }
}