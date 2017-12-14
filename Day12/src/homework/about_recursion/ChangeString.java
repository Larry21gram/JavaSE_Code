package homework.about_recursion;

public class ChangeString {
    private static int i;

    public static void main(String[] args) {

        String str = "abcdefgh";
        char[] chars = str.toCharArray();
        String s = String.valueOf(chars);
        System.out.println(s);
        String changes = changes(str, str.length());
        System.out.println(changes);
    }

    // 使用数组二分法反转
     public static void change(String string){
        char[] chars = string.toCharArray();
         for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length-i - 1];
            chars[chars.length-i - 1] = temp;
         }
         System.out.println(chars);
     }

    // 使用递归反转字符串

     public static String changes(String string,int length){

         // 最后  与 第一 交换。
         char[] chars = string.toCharArray();

         char temp = chars[i];
         chars[i] = chars[chars.length-1-i];
         chars[chars.length-1-i] = temp;

         String s = String.valueOf(chars);

         i ++ ;
         if (i == string.length()/2) {
             return s;
         }
            return changes(s ,i);


     }
}
