package com.spring.jonrunr.job;

import org.jobrunr.jobs.context.JobContext;
import org.jobrunr.jobs.lambdas.JobRequestHandler;

public class SampleJobRequestHandler implements JobRequestHandler<SampleJobRequest> {
    @Override
    public void run(SampleJobRequest jobRequest) throws Exception {
        Thread.sleep(8000); // simulate a long running job
        System.out.println("Running sample job request in background: " + jobRequest.getInput());
    }
}
