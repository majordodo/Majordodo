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
package majordodo.client;

/**
 * General view of the status of the broker
 *
 * @author enrico.olivelli
 */
public class BrokerStatusView {

    private String clusterMode;
    private long currentLedgerId;
    private long currentSequenceNumber;

    public long getCurrentLedgerId() {
        return currentLedgerId;
    }

    public void setCurrentLedgerId(long currentLedgerId) {
        this.currentLedgerId = currentLedgerId;
    }

    public long getCurrentSequenceNumber() {
        return currentSequenceNumber;
    }

    public void setCurrentSequenceNumber(long currentSequenceNumber) {
        this.currentSequenceNumber = currentSequenceNumber;
    }
    
    

    public String getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(String clusterMode) {
        this.clusterMode = clusterMode;
    }

}
