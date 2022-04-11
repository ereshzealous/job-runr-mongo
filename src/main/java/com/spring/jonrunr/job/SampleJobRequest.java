package com.spring.jonrunr.job;

import org.jobrunr.jobs.lambdas.JobRequest;
import org.jobrunr.jobs.lambdas.JobRequestHandler;

public class SampleJobRequest implements JobRequest {

    private final String input;

    protected SampleJobRequest() {
        // needed for Jackson Deserialization
        this.input = null;
    }

    public SampleJobRequest(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    @Override
    public Class<? extends JobRequestHandler> getJobRequestHandler() {
        return SampleJobRequestHandler.class;
    }
}
