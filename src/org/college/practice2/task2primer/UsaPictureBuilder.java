package org.college.practice2.task2primer;

class UsaPictureBuilder extends PictureBuilder {
    public UsaPictureBuilder() {
        this.picture = new Picture(null, (short) 0, null, null, null, null, null, false, null);
    }

    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.author = author;
        return this;
    }

    @Override
    public PictureBuilder setSizeParams(Size size) {
        picture._size = size;
        return this;
    }

    @Override
    public PictureBuilder setColorParams(String[] colors, boolean withFrames, String canvas) {
        picture._colors = colors;
        picture._isWithFrames = withFrames;
        picture._canvas = canvas;
        return this;
    }

    @Override
    public PictureBuilder setCategoryParams(String theme, String category) {
        picture._theme = theme;
        picture._category = category;
        return this;
    }
}