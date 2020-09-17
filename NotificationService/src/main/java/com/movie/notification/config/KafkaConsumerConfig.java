package com.movie.notification.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.movie.notification.vo.Details;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

	@Bean
	public KafkaListenerContainerFactory<?> kafkaListenerContainerFactory() {
		ConcurrentKafkaListenerContainerFactory<String, Details> factory = new ConcurrentKafkaListenerContainerFactory<>();
		factory.setConsumerFactory(consumerFactory());
		factory.setBatchListener(true);
		return factory;
	}

	@Bean
	public ConsumerFactory<String, Details> consumerFactory() {
		Map<String, Object> config = new HashMap<>();
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "sample-group");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaConsumerFactory<String, Details>(config, new StringDeserializer(),
				new JsonDeserializer<>(Details.class));
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, Details> kafkaListener() {
		ConcurrentKafkaListenerContainerFactory<String, Details> factory = new ConcurrentKafkaListenerContainerFactory<String, Details>();
		factory.setConsumerFactory(consumerFactory());
		return factory;
	}
}
