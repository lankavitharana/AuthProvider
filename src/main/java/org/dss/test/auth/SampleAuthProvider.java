package org.dss.test.auth;

import org.apache.axis2.context.MessageContext;
import org.wso2.carbon.dataservices.core.DataServiceFault;
import org.wso2.carbon.dataservices.core.auth.AuthorizationProvider;

import java.util.Map;

/**
 * Created by rajith on 5/3/17.
 */
public class SampleAuthProvider implements AuthorizationProvider {
    public String[] getUserRoles(MessageContext messageContext) throws DataServiceFault {
        String[] roles = {"user", "manager"};
        return roles;
    }


    public String[] getAllRoles() throws DataServiceFault {
        String[] roles = {"admin", "client", "user", "manager"};
        return roles;
    }

    public String getUsername(MessageContext messageContext) throws DataServiceFault {
        return "saman";
    }

    public void init(Map<String, String> map) throws DataServiceFault {

    }
}
