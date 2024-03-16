package MusicApp;

/**
 *
 * @author adamp
 */
public class DlNode {
    // Fields
    private Object element;
    private DlNode prev;
    private DlNode next;

    //constructor
    public DlNode(Object Element, DlNode Next, DlNode Previous) {
        element = Element;
        next = Next;
        prev = Previous;
    }

    //setters
    public void setNext(DlNode Next) {
        next = Next;
    }
    public void setPrev(DlNode Previous) {
        prev = Previous;
    }
    public void setElement(Object Element) {
        element = Element;
    }

    //getters
    public DlNode getNext() {
        return next;
    }
    public DlNode getPrev() {
        return prev;
    }
    public Object getElement() {
        return element;
    }
}
