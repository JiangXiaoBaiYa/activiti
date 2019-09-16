package com.qqtwo.test;

/**
 * @Author: 姜光明
 * @Date: 2019/9/16 22:25
 */

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

/**
 * 测试类：
 * 作用;测试activiti所需要的25张表的生成
 */
public class ActivitiTest {
    @Test
    public void testGentable() {
        //1.创建ProcessEngineConfiguration对象,第一个参数是配置文件，第二个参数是processEngineConfiguration
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.
                createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        //2.创建ProcessEngine对象
        ProcessEngine processEngine = configuration.buildProcessEngine();

        System.out.println(processEngine);
    }
}
