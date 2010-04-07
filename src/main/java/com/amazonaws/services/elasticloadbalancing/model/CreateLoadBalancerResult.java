/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * 
 * </p>
 */
public class CreateLoadBalancerResult {

    /**
     * The DNS name for the LoadBalancer.
     */
    private String dNSName;

    /**
     * The DNS name for the LoadBalancer.
     *
     * @return The DNS name for the LoadBalancer.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * The DNS name for the LoadBalancer.
     *
     * @param dNSName The DNS name for the LoadBalancer.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * The DNS name for the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dNSName The DNS name for the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoadBalancerResult withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }
    
    
}
    