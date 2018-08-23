import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * JAVA8Certefication.java
 *
 * @author g106108 (Garrett Griffin)
 * @since 8/6/18
 */
public class JAVA8Certefication extends  MId{
   public static void main(String[] args){
       String date = LocalDate.parse("2018-05-04").format(DateTimeFormatter.ISO_DATE);
       System.out.println(date);


       JAVA8Certefication m1 = new JAVA8Certefication();
       int n1= 22, n2=2;
       int n3;
       n3 = m1.find(n1,n2);

       System.out.println(n3);
   }



}