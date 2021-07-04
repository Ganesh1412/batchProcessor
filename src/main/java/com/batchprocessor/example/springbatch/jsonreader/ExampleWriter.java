package com.batchprocessor.example.springbatch.jsonreader;

import java.util.List;

import com.batchprocessor.example.springbatch.jsonreader.model.BatchJsonEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class ExampleWriter implements ItemWriter<BatchJsonEntry>{
	private static Logger logger = LoggerFactory.getLogger(ExampleWriter.class);
	
	public void write(List<? extends BatchJsonEntry> items) throws Exception {
		for (BatchJsonEntry item : items) {
			logger.info("Writing " + item);
		}
	}

}
