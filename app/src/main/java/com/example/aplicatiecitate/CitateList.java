package com.example.aplicatiecitate;

public class CitateList {

    private final String citat;
    private  final String scriitor;

    public CitateList(String citat, String scriitor) {
        this.citat = citat;
        this.scriitor = scriitor;
    }

    public String getCitat() {
        return citat;
    }

    public String getScriitor() {
        return scriitor;
    }
}
