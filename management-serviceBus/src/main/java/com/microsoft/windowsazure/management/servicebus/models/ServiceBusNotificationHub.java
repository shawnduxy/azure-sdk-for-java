/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.servicebus.models;

import java.util.ArrayList;

public class ServiceBusNotificationHub
{
    private ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules;
    
    public ArrayList<ServiceBusSharedAccessAuthorizationRule> getAuthorizationRules() { return this.authorizationRules; }
    
    public void setAuthorizationRules(ArrayList<ServiceBusSharedAccessAuthorizationRule> authorizationRules) { this.authorizationRules = authorizationRules; }
    
    private String name;
    
    public String getName() { return this.name; }
    
    public void setName(String name) { this.name = name; }
    
    private String registrationTtl;
    
    public String getRegistrationTtl() { return this.registrationTtl; }
    
    public void setRegistrationTtl(String registrationTtl) { this.registrationTtl = registrationTtl; }
    
    /**
    * Initializes a new instance of the ServiceBusNotificationHub class.
    *
    */
    public ServiceBusNotificationHub()
    {
        this.authorizationRules = new ArrayList<ServiceBusSharedAccessAuthorizationRule>();
    }
}