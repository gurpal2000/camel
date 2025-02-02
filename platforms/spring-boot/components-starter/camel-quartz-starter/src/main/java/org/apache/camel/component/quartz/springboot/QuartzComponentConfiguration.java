/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.quartz.springboot;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Provides a scheduled delivery of messages using the Quartz 2.x scheduler.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.quartz")
public class QuartzComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the quartz component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether or not the scheduler should be auto started. This options is
     * default true
     */
    private Boolean autoStartScheduler = true;
    /**
     * Seconds to wait before starting the quartz scheduler.
     */
    private Integer startDelayedSeconds;
    /**
     * Whether to prefix the quartz job with the endpoint id. This option is
     * default false.
     */
    private Boolean prefixJobNameWithEndpointId = false;
    /**
     * Whether to enable Quartz JMX which allows to manage the Quartz scheduler
     * from JMX. This options is default true
     */
    private Boolean enableJmx = true;
    /**
     * References to an existing Properties or Map to lookup in the registry to
     * use for configuring quartz.
     */
    private String propertiesRef;
    /**
     * Properties to configure the Quartz scheduler.
     */
    private Map properties;
    /**
     * File name of the properties to load from the classpath
     */
    private String propertiesFile;
    /**
     * Whether to prefix the Quartz Scheduler instance name with the
     * CamelContext name. This is enabled by default, to let each CamelContext
     * use its own Quartz scheduler instance by default. You can set this option
     * to false to reuse Quartz scheduler instances between multiple
     * CamelContext's.
     */
    private Boolean prefixInstanceName = true;
    /**
     * Whether to interrupt jobs on shutdown which forces the scheduler to
     * shutdown quicker and attempt to interrupt any running jobs. If this is
     * enabled then any running jobs can fail due to being interrupted.
     */
    private Boolean interruptJobsOnShutdown = false;
    /**
     * To use the custom SchedulerFactory which is used to create the Scheduler.
     * The option is a org.quartz.SchedulerFactory type.
     */
    private String schedulerFactory;
    /**
     * To use the custom configured Quartz scheduler, instead of creating a new
     * Scheduler. The option is a org.quartz.Scheduler type.
     */
    private String scheduler;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public Boolean getAutoStartScheduler() {
        return autoStartScheduler;
    }

    public void setAutoStartScheduler(Boolean autoStartScheduler) {
        this.autoStartScheduler = autoStartScheduler;
    }

    public Integer getStartDelayedSeconds() {
        return startDelayedSeconds;
    }

    public void setStartDelayedSeconds(Integer startDelayedSeconds) {
        this.startDelayedSeconds = startDelayedSeconds;
    }

    public Boolean getPrefixJobNameWithEndpointId() {
        return prefixJobNameWithEndpointId;
    }

    public void setPrefixJobNameWithEndpointId(
            Boolean prefixJobNameWithEndpointId) {
        this.prefixJobNameWithEndpointId = prefixJobNameWithEndpointId;
    }

    public Boolean getEnableJmx() {
        return enableJmx;
    }

    public void setEnableJmx(Boolean enableJmx) {
        this.enableJmx = enableJmx;
    }

    public String getPropertiesRef() {
        return propertiesRef;
    }

    public void setPropertiesRef(String propertiesRef) {
        this.propertiesRef = propertiesRef;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }

    public String getPropertiesFile() {
        return propertiesFile;
    }

    public void setPropertiesFile(String propertiesFile) {
        this.propertiesFile = propertiesFile;
    }

    public Boolean getPrefixInstanceName() {
        return prefixInstanceName;
    }

    public void setPrefixInstanceName(Boolean prefixInstanceName) {
        this.prefixInstanceName = prefixInstanceName;
    }

    public Boolean getInterruptJobsOnShutdown() {
        return interruptJobsOnShutdown;
    }

    public void setInterruptJobsOnShutdown(Boolean interruptJobsOnShutdown) {
        this.interruptJobsOnShutdown = interruptJobsOnShutdown;
    }

    public String getSchedulerFactory() {
        return schedulerFactory;
    }

    public void setSchedulerFactory(String schedulerFactory) {
        this.schedulerFactory = schedulerFactory;
    }

    public String getScheduler() {
        return scheduler;
    }

    public void setScheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }
}