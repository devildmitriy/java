package temp;

public class teststring {
    public static void main(String args[]) throws Exception {
        String s1 = "JavaRush -  лучший сервис обучения Java";
      String s =   s1.replaceAll("\\s","");

      String [] astr  = s1.split(" ");
      for (String a: astr){
          System.out.println(a);
      }
       /* String a = " ";
        for (char c: s.toCharArray()) {
            if  (a.equals(String.valueOf(c))) {
                System.out.println(c);

            }
        }*/
       System.out.println(s1.length() - s.length());
       String s2 = "";
        s2 = astr[1] + " " + astr[2] + " " + astr[3] + " " + astr[4];
      /* for (int i = 1; i < 5; i++)
       {
           s2 = s2 + astr[i] + " ";

       }
       */
        System.out.print(s2);
       throw new Exception();
    }
}
