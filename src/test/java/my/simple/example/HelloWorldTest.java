package my.simple.example;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    
    @Test
    public void should_say_hello_world(){
        Assert.assertEquals("Hello World Joe", new HelloWorldGreeter().sayHelloWorld("Joe"));
    }
}
