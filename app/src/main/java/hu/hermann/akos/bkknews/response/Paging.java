package hu.hermann.akos.bkknews.response;

/**
 * Created by a.hermann on 2017.02.20..
 */
public class Paging {

    private String previous;
    private String next;

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
}
