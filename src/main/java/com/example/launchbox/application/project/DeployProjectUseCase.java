package com.example.launchbox.application.project;

import com.example.launchbox.interfaces.dto.ProjectDeployRequest;
import com.example.launchbox.interfaces.dto.ProjectDeployResponse;
import com.example.launchbox.interfaces.dto.ProjectDeployStatusResponse;

public interface DeployProjectUseCase {
    ProjectDeployResponse deployProject(ProjectDeployRequest request);

    ProjectDeployStatusResponse deployProjectStatus(Long projectId);
}
