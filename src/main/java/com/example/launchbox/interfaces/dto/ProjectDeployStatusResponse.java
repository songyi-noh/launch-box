package com.example.launchbox.interfaces.dto;

import com.example.launchbox.domain.project.DeployStatus;
import lombok.Data;

@Data
public class ProjectDeployStatusResponse {
    private DeployStatus deployStatus;
}
