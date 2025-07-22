package com.example.launchbox.application.project;

import com.example.launchbox.domain.project.DeployStatus;
import com.example.launchbox.interfaces.dto.ProjectDeployRequest;
import com.example.launchbox.interfaces.dto.ProjectDeployResponse;
import com.example.launchbox.interfaces.dto.ProjectDeployStatusResponse;
import org.springframework.stereotype.Service;

@Service
public class DeployProjectService implements DeployProjectUseCase{
    @Override
    public ProjectDeployResponse deployProject(ProjectDeployRequest request) {
        ProjectDeployResponse response = new ProjectDeployResponse();
        response.setProjectId(1L);
        response.setStatus(DeployStatus.DEPLOYING);
        response.setMessage("Deployment started");
        return response;

    }

    @Override
    public ProjectDeployStatusResponse deployProjectStatus(Long projectId) {
        ProjectDeployStatusResponse response = new ProjectDeployStatusResponse();
        response.setDeployStatus(DeployStatus.COMPLETED);
        return response;
    }
}
