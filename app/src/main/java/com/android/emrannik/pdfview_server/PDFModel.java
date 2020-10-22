package com.android.emrannik.pdfview_server;

import android.net.Uri;

public class PDFModel {

    private String pdfName;
    private String pdfUrl;
    private int Thumbnail ;


    public PDFModel(String pdfName, String pdfUrl,int thumbnail) {
        this.pdfName = pdfName;
        this.pdfUrl = pdfUrl;
        this.Thumbnail=thumbnail;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
