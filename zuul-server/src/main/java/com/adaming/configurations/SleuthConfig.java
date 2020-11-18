package com.adaming.configurations;

import org.springframework.context.annotation.Configuration;

import brave.sampler.Sampler;

@Configuration
public class SleuthConfig {

	public Sampler defaultSempler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
