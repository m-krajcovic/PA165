package cz.muni.pa165.pneuservis.service.config;

import cz.muni.pa165.pneuservis.persistence.config.PersistenceConfiguration;
import cz.muni.pa165.pneuservis.service.impl.UserServiceImpl;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by peter on 11/18/16.
 */

@Configuration
@ComponentScan(basePackageClasses = {UserServiceImpl.class})
@Import(PersistenceConfiguration.class)
public class ServiceConfiguration {
    @Bean
    public Mapper dozer() {
        return new DozerBeanMapper();
    }
}
