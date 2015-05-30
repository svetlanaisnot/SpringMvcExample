package com.musicdownload.model;

/**
 * Created by svetlana on 08/01/15.
 */
public class DownloadRequest {

    private DownloadType typeKey;
    private String typeValue;
    private String path;
    private DownloadOption option;
    private int bitRate;

    public DownloadType getTypeKey() {
        return typeKey;
    }

    public void setTypeKey(DownloadType typeKey) {
        this.typeKey = typeKey;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public DownloadOption getOption() {
        return option;
    }

    public void setOption(DownloadOption option) {
        this.option = option;
    }
}
