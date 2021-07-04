package com.batchprocessor.example.springbatch.jsonreader;

import com.batchprocessor.example.springbatch.jsonreader.model.BatchJsonEntry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class ExampleProcessor implements ItemProcessor<BatchJsonEntry, BatchJsonEntry> {
	private static Logger logger = LoggerFactory.getLogger(ExampleProcessor.class);
	
	public BatchJsonEntry process(BatchJsonEntry item) throws Exception {
		logger.info("Processing 'Number {}'", item);
		return item;
	}

}
