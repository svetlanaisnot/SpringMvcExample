package com.musicdownload.model;

/**
 * Created by svetlana on 08/01/15.
 */
public enum DownloadOption {

    TRACK_ALL(0),
    TRACK_1(1),
    TRACK_10(2),
    TRACK_50(3),
    TRACK_100(4);


    final int value;

    DownloadOption(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DownloadOption findByValue(int value) {
        for (final DownloadOption p : values()) {
            if (value == p.value) {
                return p;
            }
        }

        throw new IllegalArgumentException(String.format("Download option was not found by value '%s'", value));
    }
}
