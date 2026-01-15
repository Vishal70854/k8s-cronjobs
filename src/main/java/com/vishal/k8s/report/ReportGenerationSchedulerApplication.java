package com.vishal.k8s.report;

import com.vishal.k8s.report.job.ReportGenerationScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ReportGenerationSchedulerApplication implements CommandLineRunner {

	@Autowired
	private ReportGenerationScheduler scheduler;

	public static void main(String[] args) {
		SpringApplication.run(ReportGenerationSchedulerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		scheduler.generateReportAndSendEmail();
	}

}
