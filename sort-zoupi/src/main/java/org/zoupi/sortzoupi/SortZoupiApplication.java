package org.zoupi.sortzoupi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.zoupi.sortzoupi.entities.GroupVideo;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class SortZoupiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SortZoupiApplication.class, args);
	}
	@Autowired
	ReactiveMongoTemplate mongoTemplate;
	@Autowired
	SortBasic sortBasic;
	@Scheduled(fixedRate = 300000)
	public void sort() {
		mongoTemplate.findAll(GroupVideo.class).doOnNext(g -> {
			sortBasic.sortByView(g.getCategory(), g.getIds());
		}).doOnError(Throwable::printStackTrace).subscribe();
	}
}
