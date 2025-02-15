package chainOfResponsibilityPattern.logger;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    @Override
    public void process(Integer logType, String message) {
        if(logType==1){
            System.out.println("Info: " + " Processing log: " + message);
        }
        else{
            nextLogProcessor.process(logType,message);
        }
    }
}
