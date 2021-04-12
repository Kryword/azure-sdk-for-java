// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS execution parameter. */
@Fluent
public final class SsisExecutionParameter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisExecutionParameter.class);

    /*
     * SSIS package execution parameter value. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     *
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: SSIS package execution parameter value. Type: string (or Expression with resultType
     * string).
     *
     * @param value the value value to set.
     * @return the SsisExecutionParameter object itself.
     */
    public SsisExecutionParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SsisExecutionParameter"));
        }
    }
}