package MusicApp;

/**
 *
 * @author adamp
 */
public interface DLLInterface {
    
    //Doubely Linked List methods
    public boolean Empty();
    public int playlistSize();
    public Object getSong(int i);
    public void removeSong(int i);
    public void addSong(int i, Object element);
    public String printAllSongs();
}
