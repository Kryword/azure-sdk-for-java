// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SourceControlSyncJobStream. */
public interface SourceControlSyncJobStream {
    /**
     * Gets the id property: Resource id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the sourceControlSyncJobStreamId property: The sync job stream id.
     *
     * @return the sourceControlSyncJobStreamId value.
     */
    String sourceControlSyncJobStreamId();

    /**
     * Gets the summary property: The summary of the sync job stream.
     *
     * @return the summary value.
     */
    String summary();

    /**
     * Gets the time property: The time of the sync job stream.
     *
     * @return the time value.
     */
    OffsetDateTime time();

    /**
     * Gets the streamType property: The type of the sync job stream.
     *
     * @return the streamType value.
     */
    StreamType streamType();

    /**
     * Gets the inner com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobStreamInner object.
     *
     * @return the inner object.
     */
    SourceControlSyncJobStreamInner innerModel();
}