package org.hotswap.agent.example.payara.jersey2;

import org.glassfish.jersey.jsonp.JsonProcessingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import javax.ws.rs.ApplicationPath;

/**
 * @author Dmitry Zhuravlev
 *         Date:  20.04.2017
 */
@ApplicationPath("/")
public class EndpointConfiguration extends ResourceConfig {
        public EndpointConfiguration() {
            super();
            //setting features
            register(JsonProcessingFeature.class);
            packages(true,"org.hotswap.agent.example.payara.jersey2");

            //setting properties
            property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
        }
}
