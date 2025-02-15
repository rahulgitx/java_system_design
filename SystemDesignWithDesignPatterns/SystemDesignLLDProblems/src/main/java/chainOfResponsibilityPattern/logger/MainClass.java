package chainOfResponsibilityPattern.logger;

public class MainClass {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.process(3,"error occured");
        logProcessor.process(2,"debugging");
        logProcessor.process(1,"info sldkjls");

    }
}
