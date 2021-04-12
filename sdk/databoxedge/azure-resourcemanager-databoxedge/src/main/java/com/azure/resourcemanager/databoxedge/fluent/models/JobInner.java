// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.models.JobErrorDetails;
import com.azure.resourcemanager.databoxedge.models.JobStatus;
import com.azure.resourcemanager.databoxedge.models.JobType;
import com.azure.resourcemanager.databoxedge.models.UpdateDownloadProgress;
import com.azure.resourcemanager.databoxedge.models.UpdateInstallProgress;
import com.azure.resourcemanager.databoxedge.models.UpdateOperationStage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A device job. */
@JsonFlatten
@Fluent
public class JobInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobInner.class);

    /*
     * The path ID that uniquely identifies the object.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The hierarchical type of the object.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The current status of the job.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /*
     * The UTC date and time at which the job started.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * The UTC date and time at which the job completed.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endTime;

    /*
     * The percentage of the job that is complete.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The error details.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorDetails error;

    /*
     * The type of the job.
     */
    @JsonProperty(value = "properties.jobType", access = JsonProperty.Access.WRITE_ONLY)
    private JobType jobType;

    /*
     * Current stage of the update operation.
     */
    @JsonProperty(value = "properties.currentStage", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateOperationStage currentStage;

    /*
     * The download progress.
     */
    @JsonProperty(value = "properties.downloadProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateDownloadProgress downloadProgress;

    /*
     * The install progress.
     */
    @JsonProperty(value = "properties.installProgress", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateInstallProgress installProgress;

    /*
     * Total number of errors encountered during the refresh process.
     */
    @JsonProperty(value = "properties.totalRefreshErrors", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRefreshErrors;

    /*
     * Local share/remote container relative path to the error manifest file of
     * the refresh.
     */
    @JsonProperty(value = "properties.errorManifestFile", access = JsonProperty.Access.WRITE_ONLY)
    private String errorManifestFile;

    /*
     * ARM ID of the entity that was refreshed.
     */
    @JsonProperty(value = "properties.refreshedEntityId", access = JsonProperty.Access.WRITE_ONLY)
    private String refreshedEntityId;

    /*
     * If only subfolders need to be refreshed, then the subfolder path inside
     * the share or container. (The path is empty if there are no subfolders.)
     */
    @JsonProperty(value = "properties.folder")
    private String folder;

    /**
     * Get the id property: The path ID that uniquely identifies the object.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The hierarchical type of the object.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the status property: The current status of the job.
     *
     * @return the status value.
     */
    public JobStatus status() {
        return this.status;
    }

    /**
     * Get the startTime property: The UTC date and time at which the job started.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The UTC date and time at which the job completed.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the percentComplete property: The percentage of the job that is complete.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the error property: The error details.
     *
     * @return the error value.
     */
    public JobErrorDetails error() {
        return this.error;
    }

    /**
     * Get the jobType property: The type of the job.
     *
     * @return the jobType value.
     */
    public JobType jobType() {
        return this.jobType;
    }

    /**
     * Get the currentStage property: Current stage of the update operation.
     *
     * @return the currentStage value.
     */
    public UpdateOperationStage currentStage() {
        return this.currentStage;
    }

    /**
     * Get the downloadProgress property: The download progress.
     *
     * @return the downloadProgress value.
     */
    public UpdateDownloadProgress downloadProgress() {
        return this.downloadProgress;
    }

    /**
     * Get the installProgress property: The install progress.
     *
     * @return the installProgress value.
     */
    public UpdateInstallProgress installProgress() {
        return this.installProgress;
    }

    /**
     * Get the totalRefreshErrors property: Total number of errors encountered during the refresh process.
     *
     * @return the totalRefreshErrors value.
     */
    public Integer totalRefreshErrors() {
        return this.totalRefreshErrors;
    }

    /**
     * Get the errorManifestFile property: Local share/remote container relative path to the error manifest file of the
     * refresh.
     *
     * @return the errorManifestFile value.
     */
    public String errorManifestFile() {
        return this.errorManifestFile;
    }

    /**
     * Get the refreshedEntityId property: ARM ID of the entity that was refreshed.
     *
     * @return the refreshedEntityId value.
     */
    public String refreshedEntityId() {
        return this.refreshedEntityId;
    }

    /**
     * Get the folder property: If only subfolders need to be refreshed, then the subfolder path inside the share or
     * container. (The path is empty if there are no subfolders.).
     *
     * @return the folder value.
     */
    public String folder() {
        return this.folder;
    }

    /**
     * Set the folder property: If only subfolders need to be refreshed, then the subfolder path inside the share or
     * container. (The path is empty if there are no subfolders.).
     *
     * @param folder the folder value to set.
     * @return the JobInner object itself.
     */
    public JobInner withFolder(String folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
        if (downloadProgress() != null) {
            downloadProgress().validate();
        }
        if (installProgress() != null) {
            installProgress().validate();
        }
    }
}