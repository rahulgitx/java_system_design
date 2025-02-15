package chainOfResponsibilityPattern.logger;


public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void process(Integer logType, String message) {
        if(logType==2){
            System.out.println("Debug: " + " Processing log: " + message);
        }
        else{
            nextLogProcessor.process(logType, message);
        }
    }
}
