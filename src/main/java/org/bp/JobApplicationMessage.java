package org.bp;

import java.util.HashMap;
import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class JobApplicationMessage implements JavaDelegate {

    public void execute(DelegateExecution execution) throws Exception {
        Map<String, Object> processVariables = new HashMap<String, Object>();
        processVariables.put("application_finalDecision", execution.getVariable("application_finalDecision"));
        
        execution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("JobApplicationMessage")
                .setVariables(processVariables)
                .correlate();

    }
}
