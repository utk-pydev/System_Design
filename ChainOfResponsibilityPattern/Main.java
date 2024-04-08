package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String args[]){
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "Exception Happens");
        logObject.log(LogProcessor.DEBUG, "Need to debug");
        logObject.log(LogProcessor.INFO, "Just for info");
    }
}
