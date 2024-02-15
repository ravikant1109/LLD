package main.java.BehavioralPatterns.chainofresponsibility.logger;

import main.java.BehavioralPatterns.chainofresponsibility.LogProcessor;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if( logLevel == INFO){
            System.out.println("This is the info log" + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
