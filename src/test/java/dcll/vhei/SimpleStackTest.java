package dcll.vhei;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;
/*
    répond à l'exigence #1
 */
public class SimpleStackTest {
    @Test
    public void testIsEmpty(){
        SimpleStack st=new SimpleStackImpl();
        assertEquals("isEmpty marche",true,st.isEmpty());
    }
    @Test
    public void testIsNotEmpty(){
        SimpleStack st=new SimpleStackImpl();
        st.push(new Item());
        assertEquals("IsNotEmpty marche",false, st.isEmpty());
    }
    @Test
    public void testSizeEmpty(){
       SimpleStack st = new SimpleStackImpl();
        assertEquals("sizeEmpty marche",0,st.getSize());
    }
    @Test
    public void testSizeNotEmpty(){
        SimpleStack st = new SimpleStackImpl();
        st.push(new Item());
        assertEquals("SizeNotEmpty marche",1, st.getSize());
    }
    @Test
    public void testPush(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals("testPush la pile n'est plus vide",false,st.isEmpty());
    }
    @Test
    public void testPeek(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(i);
        assertEquals("La pile renvoie bien le bon item", i, st.peek());
        assertEquals("la pile ne s'est pas vidé",false,st.isEmpty());
    }
    @Test
    public void testPop(){
        SimpleStack st = new SimpleStackImpl();
        Item i=new Item();
        st.push(new Item());
        st.push(i);
        assertEquals("La pile renvoie bien le bon item", i, st.pop());
        assertEquals("La pile redevient vide",1,st.getSize());
    }
    @Test(expected = EmptyStackException.class)
    public void testEmptyStackExceptionPop() throws EmptyStackException{

            SimpleStack st = new SimpleStackImpl();
            st.pop();
    }
    @Test(expected = EmptyStackException.class)
    public void testEmptyStackExceptionPeek() throws EmptyStackException{

            SimpleStack st = new SimpleStackImpl();
            st.peek();

    }
}