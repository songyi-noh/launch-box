package com.example.launchbox.interfaces.api;

import com.example.launchbox.application.project.DeployProjectUseCase;
import com.example.launchbox.domain.project.DeployStatus;
import com.example.launchbox.interfaces.dto.ProjectDeployRequest;
import com.example.launchbox.interfaces.dto.ProjectDeployResponse;
import com.example.launchbox.interfaces.dto.ProjectDeployStatusResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final DeployProjectUseCase deployProjectUseCase;
    @PostMapping("/deploy")
    public ResponseEntity<ProjectDeployResponse> deployProject(@RequestBody ProjectDeployRequest request) {
        ProjectDeployResponse response = deployProjectUseCase.deployProject(request);
        return ResponseEntity.ok(response);

    }
    @GetMapping("/{projectId}/status")
    public ResponseEntity<ProjectDeployStatusResponse> deployProjectStatus(@RequestParam Long projectId) {
        ProjectDeployStatusResponse response = deployProjectUseCase.deployProjectStatus(projectId);
        return ResponseEntity.ok(response);
    }

}
