package org.repository.models;

public abstract class Terminal {
    private String terminalId;

    Terminal(String id){
        this.terminalId = id;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
}
