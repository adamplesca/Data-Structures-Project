package MusicApp;

/**
 *
 * @author adamp
 */
public class DLList implements DLLInterface {

    private DlNode head; //first node in DLL
    private DlNode last; //last node in DLL
    protected DlNode currSong; //current node in DLL
    private int size;

    public DLList() {
        head = null;
        last = null;
        size = 0;
        currSong = head;
    }
    
    
    private void setCurrent(int i) {
        currSong = head; //starts at head of list
        for (int iCount = 1; iCount < i; iCount++) {
            currSong = currSong.getNext(); //loops through until it reaches current index
        }
    }
    //sets & gets current song
    public Object getSongs(int i) { 
        setCurrent(i);
        return currSong.getElement();
    }
    
    //overidden methods 
    @Override
    public boolean Empty() {
        return (size == 0);
    }
    @Override
    public int playlistSize() {
        return size;
    }

    @Override
    public void addSong(int i, Object Element) {
        DlNode newSong = new DlNode(Element, null, null);
        if (size == 0) {
            //insert a new song when the list is empty
            head = newSong;
            last = newSong;
        } else {
            if (i == 1) {
                // Insert a new song at the head of DLL
                newSong.setNext(head);
                head.setPrev(newSong);
                head = newSong;
            } else if (i == (size + 1)) {
                // Insert a new song at the tail of DLL
                newSong.setPrev(last);
                last.setNext(newSong);
                last = newSong;
            } else {
                // Insert a new song in the middle
                setCurrent(i);
                newSong.setNext(currSong);
                DlNode prev = currSong.getPrev();
                newSong.setPrev(prev);
                prev.setNext(newSong);
                currSong.setPrev(newSong);
            }
        }
        size++;
    }
    @Override
    public void removeSong(int i) {
        if (size > 0) {
            // If the first song is removed, then head becomes the next song after the current first node
            if (i == 1) {
                head = head.getNext();
                head.setPrev(null);
            } //second last song becomes last once actual last is removed
            else if (i == size) {
                last = last.getPrev();
                last.setNext(null);
            } else {
                //middle song removed after checking to see it's position in the DLL
                setCurrent(i);
                DlNode prev = currSong.getPrev();
                DlNode next = currSong.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            currSong = null;
            size--;
        }
    }
    //loops through songs and adds them as one big string
    @Override
    public String printAllSongs() {
        String allItems = new String();
        for (DlNode Node = head; Node != null; Node = Node.getNext()) {
            String oneItem = (Node.getElement()).toString();
            allItems = allItems + oneItem + "\n";
        }
        return allItems;
    }
    @Override
    public Object getSong(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

