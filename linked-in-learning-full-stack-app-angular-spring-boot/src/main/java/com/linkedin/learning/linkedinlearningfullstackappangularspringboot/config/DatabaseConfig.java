package com.linkedin.learning.linkedinlearningfullstackappangularspringboot.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.linkedin.learning.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
