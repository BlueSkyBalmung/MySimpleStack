package dcll.vhei;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21002269 on 10/02/2016.
 *
 * repond à l'exigence #2
 */
class SimpleStackImpl implements SimpleStack {

    private int size;
    private Stack<Item> st;

    public SimpleStackImpl(){
        this.size=0;
        st=new Stack<Item>();
    }
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void push(Item item) {
        st.push(item);
        size++;
    }

    @Override
    public Item peek() throws EmptyStackException {
        return st.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        size--;
        return st.pop();
    }
}
