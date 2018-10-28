package com.varun.alexa.stories;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.varun.alexa.stories.data.Transaction;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamoDBAdapter {

    private Logger logger = Logger.getLogger(this.getClass());

    private final static DynamoDBAdapter adapter = new DynamoDBAdapter();

    private final AmazonDynamoDB client;

    private DynamoDBAdapter() {
        client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration("https://dynamodb.us-west-2.amazonaws.com", "us-west-2"))
                .build();
        logger.info("Created DynamoDB client");
    }

    public static DynamoDBAdapter getInstance(){
        return adapter;
    }

}