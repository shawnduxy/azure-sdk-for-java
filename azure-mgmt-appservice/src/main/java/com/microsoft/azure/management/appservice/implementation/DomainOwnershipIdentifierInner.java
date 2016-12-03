/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Domain ownership Identifier.
 */
@JsonFlatten
public class DomainOwnershipIdentifierInner extends Resource {
    /**
     * Ownership Id.
     */
    @JsonProperty(value = "properties.ownershipId")
    private String ownershipId;

    /**
     * Get the ownershipId value.
     *
     * @return the ownershipId value
     */
    public String ownershipId() {
        return this.ownershipId;
    }

    /**
     * Set the ownershipId value.
     *
     * @param ownershipId the ownershipId value to set
     * @return the DomainOwnershipIdentifierInner object itself.
     */
    public DomainOwnershipIdentifierInner withOwnershipId(String ownershipId) {
        this.ownershipId = ownershipId;
        return this;
    }

}
