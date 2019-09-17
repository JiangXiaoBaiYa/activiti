package com.qqtwo.activiti;

/**
 * @Author: 姜光明
 * @Date: 2019/9/17 21:37
 */

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * 启动流程实例:前提是完成流程定义的部署工作
 */
public class ActivitiStartInstance {
    public static void main(String[] args) {
        //1.得到ProcessEngine对象
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //2.得到RunService对象
        RuntimeService runtimeService = processEngine.getRuntimeService();

        //3.创建流程实例  流程定义的key要知道
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday");

        //4.输出实例的相关信息
        System.out.println("流程部署ID"+processInstance.getDeploymentId());
        System.out.println("流程定义ID"+processInstance.getProcessDefinitionId());
        System.out.println("流程实例ID"+processInstance.getId());
        System.out.println("活动ID"+processInstance.getActivityId());
    }
}
