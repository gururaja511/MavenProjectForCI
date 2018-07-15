package com.guru.util.listeners;

import java.util.Map;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class EnvReaderListener implements ISuiteListener {

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		Map<String, String> parameters = suite.getXmlSuite().getParameters();
		for (Map.Entry<String, String> parameter : parameters.entrySet()) {
            String env = System.getenv(parameter.getKey());
           
            if (env != null && ! env.trim().isEmpty() && !env.contains("$")) {
            	 System.out.println("EnvReaderListener --> setting system variable from "+parameter.getKey()+":"+env);
                parameter.setValue(env);
            }
        }
		
	}

}
