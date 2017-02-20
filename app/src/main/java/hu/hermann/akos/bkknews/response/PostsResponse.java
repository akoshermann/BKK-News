package hu.hermann.akos.bkknews.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by a.hermann on 2017.02.20..
 */

public class PostsResponse implements Serializable {

    private List<Post> data;
    private Paging paging;

    public List<Post> getData() {
        return data;
    }

    public void setData(List<Post> data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}
