package data.dto;

import data.access.LightFoot;

public class AutogateProcessor extends LightFoot<AutogateProcessor> {

    private int id;
    private String processorDescription;
    private String processorShortCode;
    private String cbnCode;
    private int initialDelay;
    private int delayPerCycle;
    private boolean isStp;
    private boolean isPaused;

    public String getCbnCode() {
        return cbnCode;
    }

    public void setCbnCode(String cbnCode) {
        this.cbnCode = cbnCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessorDescription() {
        return processorDescription;
    }

    public void setProcessorDescription(String processorDescription) {
        this.processorDescription = processorDescription;
    }

    public String getProcessorShortCode() {
        return processorShortCode;
    }

    public void setProcessorShortCode(String processorShortCode) {
        this.processorShortCode = processorShortCode;
    }

    public int getInitialDelay() {
        return initialDelay;
    }

    public void setInitialDelay(int initialDelay) {
        this.initialDelay = initialDelay;
    }

    public int getDelayPerCycle() {
        return delayPerCycle;
    }

    public void setDelayPerCycle(int delayPerCycle) {
        this.delayPerCycle = delayPerCycle;
    }

    public boolean isStp() {
        return isStp;
    }

    public void setStp(boolean stp) {
        isStp = stp;
    }

    public boolean isPaused() {
        return isPaused;
    }

    public void setPaused(boolean paused) {
        isPaused = paused;
    }
}
