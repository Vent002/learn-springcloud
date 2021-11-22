package cn.hsmxg1204.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-09-05 12:12
 */
@Component
public class RestTemplateConfig extends RestTemplateAutoConfiguration {
    public RestTemplateConfig(ObjectProvider<HttpMessageConverters> messageConverters, ObjectProvider<RestTemplateCustomizer> restTemplateCustomizers) {
        super(messageConverters, restTemplateCustomizers);
    }

}
