package com.pyeondongbu.editorrecruitment.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.pyeondongbu.editorrecruitment.domain"})
public class JpaConfig {
}
