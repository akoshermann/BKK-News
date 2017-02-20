package hu.hermann.akos.bkknews.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by a.hermann on 2017.02.20..
 */
public class Post {

    private String message;
    @SerializedName("created_time")
    private String creationDate;
    private String id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
