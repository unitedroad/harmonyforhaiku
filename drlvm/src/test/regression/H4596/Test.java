/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.harmony.drlvm.tests.regression.h4596;

import junit.framework.TestCase;

public class Test extends TestCase {
    
    public void testIt() {
        try {
            WorkerThread worker = new WorkerThread();
            worker.setDaemon(true);

            worker.start();
            Thread.sleep(100);

            worker.suspend();
            worker.resume();
            System.out.println("PASSED");
         } catch (InterruptedException e) {
         }
    }

    public static class WorkerThread extends Thread {

        public void run() {
            Object o1 = new Object();
            Object o2 = new Object();
            while(true) {
                try {
                    o1.equals(o2);
                } finally {
                    continue;
                }
            }
        }
    }
}

