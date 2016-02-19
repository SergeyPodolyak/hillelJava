/**
 * Created by ADMIN on 12.02.16.
 */
public class Exampl1 {
    public static void main(String[] args) {
        String mail = "s.podolyak@yandex.ru";
        String newmail=new String();
        char [] arrayMail = mail.toCharArray();
        for (int i=0; i<arrayMail.length; i++){
           if (arrayMail[i]=='.'){
               newmail=newmail+"[at]";
           }else{
               if (arrayMail[i]=='@'){
                   newmail=newmail+"[dot]";
               }else {newmail=newmail+arrayMail[i];}
                }

        }
        System.out.println(newmail);
    }
}
