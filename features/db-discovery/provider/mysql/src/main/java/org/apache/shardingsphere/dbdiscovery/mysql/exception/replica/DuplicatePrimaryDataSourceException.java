/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.dbdiscovery.mysql.exception.replica;

import org.apache.shardingsphere.dbdiscovery.exception.DBDiscoveryProviderException;
import org.apache.shardingsphere.infra.util.exception.external.sql.sqlstate.XOpenSQLState;

/**
 * Duplicate primary data source exception.
 */
public final class DuplicatePrimaryDataSourceException extends DBDiscoveryProviderException {
    
    private static final long serialVersionUID = -7715117257616134436L;
    
    public DuplicatePrimaryDataSourceException(final String databaseName) {
        super(XOpenSQLState.DUPLICATE, 90, "Duplicate primary data source in database `%s`.", databaseName);
    }
}