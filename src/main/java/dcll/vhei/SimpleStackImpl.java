package dcll.vhei;

import java.util.EmptyStackException;

/**
 * Created by 21002269 on 10/02/2016.
 */
class SimpleStackImpl implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return new Item();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return new Item();
    }
}
