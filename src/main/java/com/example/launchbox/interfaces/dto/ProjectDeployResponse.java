package com.example.launchbox.interfaces.dto;

import com.example.launchbox.domain.project.DeployStatus;
import lombok.Data;

@Data
public class ProjectDeployResponse {
    private Long projectId;
    private DeployStatus status;
    private String message;
}
