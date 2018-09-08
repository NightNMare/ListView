package com.example.dlarb.listview;

public class Data {
    String bigtitle;
    String smalltitle;
    int numname;

    Data(String bigtitle, String smalltitle, int numname) {
        this.bigtitle = bigtitle;
        this.smalltitle = smalltitle;
        this.numname = numname;
    }

    public int getNumname() {
        return numname;
    }

    public void setNumname(int numname) {
        this.numname = numname;
    }

    public String getBigtitle() {
        return bigtitle;
    }

    public void setBigtitle(String bigtitle) {
        this.bigtitle = bigtitle;
    }

    public String getSmalltitle() {
        return smalltitle;
    }

    public void setSmalltitle(String smalltitle) {
        this.smalltitle = smalltitle;
    }
}
