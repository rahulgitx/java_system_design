package chainOfResponsibilityPattern.logger;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void process(Integer logType, String message) {
        if(logType==3){
            System.out.println("Error: " + " Processing log: " + message);
        }
        else{
            nextLogProcessor.process(logType,message);
        }
    }
}
