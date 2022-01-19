/*
 * Copyright (c) 2021-present KuFlow S.L.
 *
 * All rights reserved.
 */

package com.kuflow.engine.client.activity.impl.task.config;

import com.kuflow.engine.client.activity.impl.task.KuFlowActivityTaskMarker;
import com.kuflow.engine.client.common.config.KuFlowCommonConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration(proxyBeanMethods = false)
@ComponentScan(basePackageClasses = { KuFlowActivityTaskMarker.class })
@Import(KuFlowCommonConfiguration.class)
public class KuFlowActivityTaskConfiguration {}