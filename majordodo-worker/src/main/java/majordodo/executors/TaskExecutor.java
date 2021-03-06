/*
 Licensed to Diennea S.r.l. under one
 or more contributor license agreements. See the NOTICE file
 distributed with this work for additional information
 regarding copyright ownership. Diennea S.r.l. licenses this file
 to you under the Apache License, Version 2.0 (the
 "License"); you may not use this file except in compliance
 with the License.  You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.

 */
package majordodo.executors;

import java.util.Map;

/**
 * Implementation of the execution of a task
 *
 * @author enrico.olivelli
 */
public class TaskExecutor {

    public static final String PARAMETER_CODEPOOL = "codepool";
    public static final String PARAMETER_MODE = "mode";
    public static final String PARAMETER_TASKTYPE = "tasktype";
    public static final String PARAMETER_USERID = "userid";
    public static final String PARAMETER_ATTEMPT = "attempt";
    public static final String PARAMETER_DATA = "parameter";
    public static final String PARAMETER_TASKID = "taskid";
    
    /**
     * Implement the task. Any Exception thrown but this method will be treated as "errors" and Task will be re-submitted for recovery
     * @param parameters
     * @return
     * @throws Exception 
     * @see #PARAMETER_ATTEMPT
     * @see #PARAMETER_CODEPOOL
     * @see #PARAMETER_DATA
     * @see #PARAMETER_MODE
     * @see #PARAMETER_TASKID
     * @see #PARAMETER_TASKTYPE
     * @see #PARAMETER_USERID
     */
    public String executeTask(Map<String, Object> parameters) throws Exception {
        throw new UnsupportedOperationException("task execution not implemented for this tasktype, parameters:" + parameters);
    }

}
