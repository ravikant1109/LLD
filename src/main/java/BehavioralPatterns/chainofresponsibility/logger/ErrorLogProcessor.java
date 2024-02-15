package main.java.BehavioralPatterns.chainofresponsibility.logger;

import main.java.BehavioralPatterns.chainofresponsibility.LogProcessor;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if( logLevel == ERROR){
            System.out.println("This is the error log" + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
