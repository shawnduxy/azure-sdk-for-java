/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.core;

import com.microsoft.azure.management.resources.fluentcore.utils.ResourceNamer;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceNamerFactory;

public class TestResourceNamerFactory extends ResourceNamerFactory {

    private final MockIntegrationTestBase mockIntegrationTestBase;

    TestResourceNamerFactory(MockIntegrationTestBase mockIntegrationTestBase) {
        this.mockIntegrationTestBase = mockIntegrationTestBase;
    }
    @Override
    public ResourceNamer createResourceNamer(String name) {
        return new TestResourceNamer(name, mockIntegrationTestBase);
    }
}
