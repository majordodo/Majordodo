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
package majordodo.task;

/**
 * Sequence number
 *
 * @author enrico.olivelli
 */
public final class LogSequenceNumber {

    public final long ledgerId;
    public final long sequenceNumber;

    @Override
    public String toString() {
        return ledgerId + "," + sequenceNumber;
    }

    public LogSequenceNumber(long ledgerId, long sequenceNumber) {
        this.ledgerId = ledgerId;
        this.sequenceNumber = sequenceNumber;
    }

    public boolean after(LogSequenceNumber snapshotSequenceNumber) {
        if (this.ledgerId < snapshotSequenceNumber.ledgerId) {
            return false;
        } else if (this.ledgerId == snapshotSequenceNumber.ledgerId) {
            return this.sequenceNumber > snapshotSequenceNumber.sequenceNumber;
        } else {
            return true;
        }
    }

}
