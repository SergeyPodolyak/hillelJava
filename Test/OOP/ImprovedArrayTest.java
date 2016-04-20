package OOP;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ADMIN on 21.04.16.
 */
public class ImprovedArrayTest {
    @Test
    public void ChekTheWorkingOfAcseption(){
        ImprovedArray improvedArray=new ImprovedArray(2);
        improvedArray.add("dfv");
        improvedArray.add("sdsdcv");
        System.out.println(improvedArray);
System.out.println(improvedArray.get(0));
        String testElement2 = "not work";
        try {
            String testElement = improvedArray.get(1);
            Assert.fail();
            System.out.print(testElement);
        }catch (Throwable e){
            System.out.println(testElement2);
            System.out.println(e);
        }
    }
}
