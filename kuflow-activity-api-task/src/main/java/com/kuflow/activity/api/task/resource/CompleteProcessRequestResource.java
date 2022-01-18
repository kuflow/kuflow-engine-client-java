/*
 * Copyright (c) 2021-present KuFlow S.L.
 *
 * All rights reserved.
 */

package com.kuflow.activity.api.task.resource;

import com.kuflow.common.resource.AbstractResource;
import java.util.UUID;

public class CompleteProcessRequestResource extends AbstractResource {

    private UUID processId;

    public UUID getProcessId() {
        return this.processId;
    }

    public void setProcessId(UUID processId) {
        this.processId = processId;
    }
}