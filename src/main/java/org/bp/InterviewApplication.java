package org.bp;

import java.util.Map;

import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.dmn.engine.DmnDecisionRuleResult;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.StringValue;

@ProcessApplication("Interview Application")
public class InterviewApplication extends ServletProcessApplication {
    // @PostDeploy
    // public void evaluateDecisionTable(ProcessEngine processEngine) {
    //     DecisionService decisionService = processEngine.getDecisionService();
    //     VariableMap variables = Variables.createVariables().putValue("application_technicalSkills", 5);
    //     DmnDecisionTableResult decisionResult = decisionService.evaluateDecisionTableByKey("ApplicationEvaluation",
    //             variables);
    //     DmnDecisionRuleResult sr = decisionResult.getSingleResult();
    //     if (sr.containsKey("decision_isPositive")) {
    //         Boolean nextStage = decisionResult.getSingleResult().getEntry("decision_isPositive");
    //         System.out.println("Next stage: " + nextStage);
    //     }

    //     StringValue explanation = sr.getEntryTyped("decision_explanation");
    //     System.out.println("Explanation: " + explanation);

    //     for (Map<String, Object> result : decisionResult.getResultList()) {
    //         for (Map.Entry<String, Object> entry : result.entrySet()) {
    //             System.out.println("Key =  " + entry.getKey() + "Value = " + entry.getValue());
    //         }
    //     }
    // }

}