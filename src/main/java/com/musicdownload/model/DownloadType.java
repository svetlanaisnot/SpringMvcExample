package com.musicdownload.model;

/**
 * Created by svetlana on 08/01/15.
 */
public enum DownloadType {

    USER_FAVOURITE(0),
    USER_LIBRARY(1),
    ARTIST(2),
    ALBUM(3),
    TRACK(4),
    TAG(5);

    final int value;

    DownloadType(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public static DownloadType findByValue(int value) {
        for (final DownloadType p : values()) {
            if (value == p.value) {
                return p;
            }
        }

        throw new IllegalArgumentException(String.format("Download type was not found by value '%s'", value));
    }
}
