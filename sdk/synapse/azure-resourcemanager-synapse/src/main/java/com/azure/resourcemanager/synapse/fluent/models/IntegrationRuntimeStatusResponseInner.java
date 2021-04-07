// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Integration runtime status response. */
@Fluent
public final class IntegrationRuntimeStatusResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationRuntimeStatusResponseInner.class);

    /*
     * The integration runtime name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Integration runtime properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationRuntimeStatus properties;

    /**
     * Get the name property: The integration runtime name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: Integration runtime properties.
     *
     * @return the properties value.
     */
    public IntegrationRuntimeStatus properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Integration runtime properties.
     *
     * @param properties the properties value to set.
     * @return the IntegrationRuntimeStatusResponseInner object itself.
     */
    public IntegrationRuntimeStatusResponseInner withProperties(IntegrationRuntimeStatus properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model IntegrationRuntimeStatusResponseInner"));
        } else {
            properties().validate();
        }
    }
}