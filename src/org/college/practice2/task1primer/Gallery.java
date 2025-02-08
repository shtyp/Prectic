package org.college.practice2.task1primer;

import java.util.ArrayList;
import java.util.List;

class Gallery {
    private static Gallery _instance;
    private List<Picture> _pictures;
    private String _name;
    private String _article;

    private Gallery(String name) {
        this._name = name;
        this._pictures = new ArrayList<>();
    }

    public static Gallery getInstance(String name) {
        if (_instance == null) {
            _instance = new Gallery(name);
        }
        return _instance;
    }

    public boolean addPicture(Picture picture) {
        return _pictures.add(picture);
    }


    public boolean removePicture(Picture picture) {  return _pictures.remove(picture);
    }


    public String describePicture(Picture picture) {
        return picture.toString();
    }

    public Picture getPicture(String name) {
        for (Picture picture : _pictures) {
            if (picture.getName().equals(name)) {
                return picture;
            }
        }
        return null;
    }

    public List<Picture> getPictures() {
        return new ArrayList<>(_pictures);
    }


    public long getPictureCount() {
        return _pictures.size();
    }


    public String getName() {
        return _name;
    }

    public void setArticle(String article) {
        this._article = article;
    }

    public String getArticle(){
        return _article;
    }
}

