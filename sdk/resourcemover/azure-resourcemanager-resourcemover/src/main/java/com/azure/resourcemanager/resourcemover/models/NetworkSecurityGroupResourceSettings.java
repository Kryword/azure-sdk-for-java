// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Defines the NSG resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Network/networkSecurityGroups")
@Fluent
public final class NetworkSecurityGroupResourceSettings extends ResourceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkSecurityGroupResourceSettings.class);

    /*
     * Gets or sets Security rules of network security group.
     */
    @JsonProperty(value = "securityRules")
    private List<NsgSecurityRule> securityRules;

    /**
     * Get the securityRules property: Gets or sets Security rules of network security group.
     *
     * @return the securityRules value.
     */
    public List<NsgSecurityRule> securityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: Gets or sets Security rules of network security group.
     *
     * @param securityRules the securityRules value to set.
     * @return the NetworkSecurityGroupResourceSettings object itself.
     */
    public NetworkSecurityGroupResourceSettings withSecurityRules(List<NsgSecurityRule> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkSecurityGroupResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (securityRules() != null) {
            securityRules().forEach(e -> e.validate());
        }
    }
}