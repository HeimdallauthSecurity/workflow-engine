package com.heimdallauth.authguard;

import org.springframework.boot.SpringApplication;

public class TestWorkflowEngineApplication {

    public static void main(String[] args) {
        SpringApplication.from(WorkflowEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
