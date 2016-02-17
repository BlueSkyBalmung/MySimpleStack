package dcll.vhei;

import junit.framework.TestCase;

import java.util.EmptyStackException;

public class SimpleStackTest extends TestCase {
    public void testIsEmpty(){
        SimpleStack st=new SimpleStackImpl();
        assertEquals(true,st.isEmpty());
    }

    public void testIsNotEmpty(){
        SimpleStack st=new SimpleStackImpl();
        st.push(new Item());
        assertEquals(false, st.isEmpty());
    }

    public void testSizeEmpty(){
       SimpleStack st = new SimpleStackImpl();
        assertEquals(0,st.getSize());
    }

    public void testSizeNotEmpty(){
        SimpleStack st = new SimpleStackImpl();
        st.push(new Item());
        assertEquals(1, st.getSize());
    }

    public void testPush(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(false,st.isEmpty());
    }

    public void testPeek(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(i,st.peek());
        assertEquals(false,st.isEmpty());
    }

    public void testPop(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals(i, st.pop());
        assertEquals(true,st.isEmpty());
    }

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