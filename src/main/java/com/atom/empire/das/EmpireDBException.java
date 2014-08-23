/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.atom.empire.das;

import org.apache.empire.exceptions.EmpireException;
import org.springframework.dao.UncategorizedDataAccessException;

/**
 * Exception inside springs exception hierarchy. This may be good for client
 * code that catches any {@link org.springframework.dao.DataAccessException}
 * and doesn't want to look for implementation specific {@link org.apache.empire.exceptions.EmpireException}.
 */
public class EmpireDBException extends UncategorizedDataAccessException {

    private static final long serialVersionUID = 1L;

    public EmpireDBException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public EmpireDBException(EmpireException e) {
        super(e.getMessage(), e);
    }
}
