/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * NOTE: The code/logic in this class is copied from https://bitbucket.org/thetransactioncompany/cors-filter.
 * All credits goes to the original authors of the project https://bitbucket.org/thetransactioncompany/cors-filter.
 */

package org.wso2.carbon.identity.cors.mgt.core.constant;

/**
 * Grouping of constants related to database tables.
 */
public class SchemaConstants {

    /**
     * Constants related to the IDN_CORS_ORIGIN table.
     */
    public static class CORSOriginTableColumns {

        public static final String ID = "ID";
        public static final String TENANT_ID = "TENANT_ID";
        public static final String ORIGIN = "ORIGIN";
        public static final String UNIQUE_ID = "UUID";

        private CORSOriginTableColumns() {

        }
    }

    /**
     * Constants related to the IDN_CORS_ASSOCIATION table.
     */
    public static class CORSAssociationTableColumns {

        public static final String IDN_CORS_ORIGIN_ID = "IDN_CORS_ORIGIN_ID";
        public static final String SP_APP_ID = "SP_APP_ID";

        private CORSAssociationTableColumns() {

        }
    }
}
