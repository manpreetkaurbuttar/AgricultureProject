package hello;
 
import org.junit.Test;
import static org.junit.Assert.*;
 
public class ApplicationTest {
 
    public boolean isEvenNumber(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){
    	ApplicationTest asft = new ApplicationTest();
        assertFalse(asft.isEvenNumber(3));
    }
}