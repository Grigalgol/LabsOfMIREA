package laba_11;

import java.util.List;

public class MyList implements Iterator{
    List list;
    int index;

    public MyList(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index<list.size()) return true;
        return false;
    }

    @Override
    public Object getObject() {
        return list.get(index++);
    }
}
