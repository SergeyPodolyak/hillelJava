package OOP;

import exception.MyOwnOutOfIndexException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ADMIN on 21.04.16.
 */
public class ImprovedArrayTest {
    @Test
    public void ChekTheWorkingOfAcseption(){
        ImprovedArray improvedArray=new ImprovedArray(2);
        improvedArray.add("1");
        improvedArray.add("2");


        String testElement2 = "not work";
        try {
          improvedArray.get(1);
            Assert.fail("Upal");
           // System.out.print(testElement);
        }catch (MyOwnOutOfIndexException e){
            System.out.println(testElement2);
            System.out.println(e);
        }
    }
}
