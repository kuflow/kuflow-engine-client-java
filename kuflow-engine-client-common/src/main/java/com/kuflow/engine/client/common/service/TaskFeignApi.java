/*
 * Copyright (c) 2021-present KuFlow S.L.
 *
 * All rights reserved.
 */

package com.kuflow.engine.client.common.service;

import com.kuflow.engine.client.common.api.controller.TaskApi;
import com.kuflow.engine.client.common.config.KuFlowFeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "kuFlowTaskApi", url = "${kuflow.activity.kuflow.endpoint}", configuration = KuFlowFeignConfiguration.class)
public interface TaskFeignApi extends TaskApi {}