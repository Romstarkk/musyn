package romstark.musyn2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MuFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;

    private String name,link,about,path;
    boolean hasLink,canBeDownload;

    public Long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isHasLink() {
        return hasLink;
    }

    public void setHasLink(boolean hasLink) {
        this.hasLink = hasLink;
    }

    public boolean isCanBeDownload() {
        return canBeDownload;
    }

    public void setCanBeDownload(boolean canBeDownload) {
        this.canBeDownload = canBeDownload;
    }
}