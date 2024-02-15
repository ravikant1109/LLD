package main.java.BehavioralPatterns.chainofresponsibility.logger;

import main.java.BehavioralPatterns.chainofresponsibility.LogProcessor;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if( logLevel == DEBUG){
            System.out.println("This is the debug log" + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
