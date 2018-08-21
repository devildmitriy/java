package temp;
/*
 между табуляциями
*/
public class testsubstring {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {throw new TooShortStringException();}
        String s = string.replaceAll("\\t","");
        if (string.length() - s.length() < 2 ){
            throw new TooShortStringException();
        }
        return string.substring(string.indexOf("\t") + 1,string.indexOf("\t",string.indexOf("\t") + 1) );
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
