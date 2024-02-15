package main.java.BehavioralPatterns.chainofresponsibility;

import main.java.BehavioralPatterns.chainofresponsibility.logger.DebugLogProcessor;
import main.java.BehavioralPatterns.chainofresponsibility.logger.ErrorLogProcessor;
import main.java.BehavioralPatterns.chainofresponsibility.logger.InfoLogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new DebugLogProcessor(new ErrorLogProcessor(
                new InfoLogProcessor(null)));
        logProcessor.log(LogProcessor.DEBUG,"NullPointerError");
    }
}
