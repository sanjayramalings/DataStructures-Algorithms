import java.util.HashMap;

public class Iterators {


    public static int PrintInterger(int i) // function to return int
    {
        return i;
    }



    public static void main(String[] args)
     {
         int i=10; // Integer
        // System.out.println(PrintInterger(i));
         boolean flag =true; // Boolean
         char c= 'v'; // Character
         String s="help"; // String S

          System.out.println("Integer "+i);
         System.out.println("boolean "+ flag);
         System.out.println("character "+c);
         System.out.println("String  f"+s);
         System.out.println('\n');



         int [] arr ={1,2,3,4,5,5}; // arr
         System.out.println("array length : int arr [] "+arr.length);
         System.out.println('\n');

         int [] arr2= new int[10];
         arr2[0]=0;
         arr2[1]=1;
         arr2[2]=2;
         arr2[3]='3';
         arr2[4]='A';
         arr2[5]='Z';
         arr2[6]='a';
         arr2[7]='z';
         System.out.println("arr2 length: int arr2[] = new int[10] syntax \n value "+arr2.length);
         System.out.println('\n');

         System.out.println(arr2[0] +" 0");
         System.out.println(arr2[1] +" 1");
         System.out.println(arr2[2] +" 2");

     //    System.out.println(arr2[3] +" char 3 ");
         System.out.println(arr2[4] +" char A ");
         System.out.println(arr2[5] +" char Z ");
         System.out.println(arr2[6] +" char a ");
         System.out.println(arr2[7] +" char z ");

         System.out.println(" A to Z = 65 to 90");
         System.out.println(" a to z = 97 to 122");

         System.out.println('\n');

         char [] ch_arr= new char[3];
         ch_arr[0]='a';
         ch_arr[1]='b';
         ch_arr[2]='c';

         System.out.println("ch_arr length :\n char ch_arr[] = new char[10] syntax \n val "+ch_arr.length);
         System.out.println(ch_arr[0] +" 0");
         System.out.println(ch_arr[1] +" 1");
         System.out.println(ch_arr[2] +" 2");
         System.out.println('\n');





     }

}
