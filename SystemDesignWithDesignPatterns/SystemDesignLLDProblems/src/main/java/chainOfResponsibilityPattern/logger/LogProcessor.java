package chainOfResponsibilityPattern.logger;

public abstract class LogProcessor {
    public static Integer info = 1;
    public static Integer debug = 2;
    public static Integer error = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public abstract void process(Integer logType, String message);
}
