package com.mphasis.secondspringapp.config;

import org.springframework.context.annotation.*;
import com.mphasis.secondspringapp.repository.*;

@Configuration
public class DatabaseConfig {

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new DataSource("jdbc:mysql://localhost/devdb", "devuser");
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return new DataSource("jdbc:mysql://prod/db", "admin");
    }

    @Bean
    public UserRepository userRepository(DataSource dataSource) {
        return new UserRepository(dataSource);
    }
}
