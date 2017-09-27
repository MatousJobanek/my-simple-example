package my.simple.example;

import org.junit.Test;

public class FirstSimpleTest {

    @Test
    public void runFirstSimpleTest(){
        new CustomVerifier().verifyNotEmpty("hi there");
    }
}
