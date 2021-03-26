// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistryBlobsUploadChunkHeaders model. */
@Fluent
public final class ContainerRegistryBlobsUploadChunkHeaders {
    /*
     * The Docker-Upload-UUID property.
     */
    @JsonProperty(value = "Docker-Upload-UUID")
    private String dockerUploadUUID;

    /*
     * The Range property.
     */
    @JsonProperty(value = "Range")
    private String range;

    /*
     * The Location property.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the dockerUploadUUID property: The Docker-Upload-UUID property.
     *
     * @return the dockerUploadUUID value.
     */
    public String getDockerUploadUUID() {
        return this.dockerUploadUUID;
    }

    /**
     * Set the dockerUploadUUID property: The Docker-Upload-UUID property.
     *
     * @param dockerUploadUUID the dockerUploadUUID value to set.
     * @return the ContainerRegistryBlobsUploadChunkHeaders object itself.
     */
    public ContainerRegistryBlobsUploadChunkHeaders setDockerUploadUUID(String dockerUploadUUID) {
        this.dockerUploadUUID = dockerUploadUUID;
        return this;
    }

    /**
     * Get the range property: The Range property.
     *
     * @return the range value.
     */
    public String getRange() {
        return this.range;
    }

    /**
     * Set the range property: The Range property.
     *
     * @param range the range value to set.
     * @return the ContainerRegistryBlobsUploadChunkHeaders object itself.
     */
    public ContainerRegistryBlobsUploadChunkHeaders setRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * Get the location property: The Location property.
     *
     * @return the location value.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The Location property.
     *
     * @param location the location value to set.
     * @return the ContainerRegistryBlobsUploadChunkHeaders object itself.
     */
    public ContainerRegistryBlobsUploadChunkHeaders setLocation(String location) {
        this.location = location;
        return this;
    }
}