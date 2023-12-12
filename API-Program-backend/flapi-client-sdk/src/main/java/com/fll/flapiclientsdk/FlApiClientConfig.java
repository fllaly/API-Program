package com.fll.flapiclientsdk;

import com.fll.flapiclientsdk.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("flapi.client")
@Data
@ComponentScan
public class FlApiClientConfig {

    private String accesKey;

    private String secretKey;

    @Bean
    public YuApiClient yuApiClient() {
        return new YuApiClient(accesKey, secretKey);
    }

}
