package dcll.vhei;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.EmptyStackException;

public class SimpleStackTest extends TestCase {
    @Test
    public void testIsEmpty(){
        SimpleStack st=new SimpleStackImpl();
        assertEquals(true,st.isEmpty());
    }
    @Test
    public void testIsNotEmpty(){
        SimpleStack st=new SimpleStackImpl();
        st.push(new Item());
        assertEquals(false, st.isEmpty());
    }
    @Test
    public void testSizeEmpty(){
       SimpleStack st = new SimpleStackImpl();
        assertEquals(0,st.getSize());
    }
    @Test
    public void testSizeNotEmpty(){
        SimpleStack st = new SimpleStackImpl();
        st.push(new Item());
        assertEquals(1, st.getSize());
    }
    @Test
    public void testPush(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(false,st.isEmpty());
    }
    @Test
    public void testPeek(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(i,st.peek());
        assertEquals(false,st.isEmpty());
    }
    @Test
    public void testPop(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(i, st.pop());
        assertEquals(true,st.isEmpty());
    }
    @Test
    public void testEmptyStackExceptionPop(){
        boolean test=false;
        try{
            SimpleStack st = new SimpleStackImpl();
            st.pop();
        }catch(EmptyStackException e){
            test=true;
            assertTrue(e instanceof EmptyStackException);
        }
        assertEquals(true,test);
    }
    @Test
    public void testEmptyStackExceptionPeek(){
        boolean test=false;
        try{
            SimpleStack st = new SimpleStackImpl();
            st.peek();
        }catch(EmptyStackException e){
            test=true;
            assertTrue(e instanceof EmptyStackException);
        }
        assertEquals(true,test);
    }
}