package auth.res.vo;

/**
 * Created by RZ on 7/1/16.
 */
public class ResModel {
    private Long uuid;
    private String name;
    private String url;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
