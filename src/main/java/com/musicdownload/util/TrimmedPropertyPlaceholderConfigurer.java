package com.musicdownload.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Created by svetlana on 08/01/15.
 */
public class TrimmedPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    /**
     * Convert the given property value from the properties source
     * to the value that should be applied.
     * This implementation returns trimmed value of string.
     *
     * @param originalValue the original value of string
     * @return Trimmed version of the original string
     */
    @Override
    protected String convertPropertyValue(final String originalValue) {
        return (originalValue == null) ? null : originalValue.trim();
    }

}
