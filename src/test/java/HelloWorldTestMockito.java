import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class HelloWorldTestMockito {
    private HelloWorld helloWorld;

    @Before
    public void setUp(){
        helloWorld = mock(HelloWorld.class);
    }

    @Test
    public void testPrintHelloWorldMockito(){
        //given
        HelloWorldService helloWorldService = new HelloWorldService();
        when(helloWorld.printHelloWorld()).thenReturn("Hello World!");

        //when
        String result = helloWorldService.getHelloWord(helloWorld);

        //then
        assertEquals("Hello World!", result );
        verify(helloWorld);

    }
}
