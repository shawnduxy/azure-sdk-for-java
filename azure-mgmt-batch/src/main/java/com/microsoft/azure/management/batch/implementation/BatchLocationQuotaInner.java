/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Quotas associated with a Batch region for a particular subscription.
 */
public class BatchLocationQuotaInner {
    /**
     * The number of Batch accounts that may be created under the subscription
     * in the specified region.
     */
    @JsonProperty(value = "accountQuota")
    private Integer accountQuota;

    /**
     * Get the accountQuota value.
     *
     * @return the accountQuota value
     */
    public Integer accountQuota() {
        return this.accountQuota;
    }

    /**
     * Set the accountQuota value.
     *
     * @param accountQuota the accountQuota value to set
     * @return the BatchLocationQuotaInner object itself.
     */
    public BatchLocationQuotaInner withAccountQuota(Integer accountQuota) {
        this.accountQuota = accountQuota;
        return this;
    }

}
