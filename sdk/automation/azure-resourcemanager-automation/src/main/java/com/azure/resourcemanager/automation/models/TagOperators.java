// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for TagOperators. */
public enum TagOperators {
    /** Enum value All. */
    ALL("All"),

    /** Enum value Any. */
    ANY("Any");

    /** The actual serialized value for a TagOperators instance. */
    private final String value;

    TagOperators(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a TagOperators instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed TagOperators object, or null if unable to parse.
     */
    @JsonCreator
    public static TagOperators fromString(String value) {
        TagOperators[] items = TagOperators.values();
        for (TagOperators item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}