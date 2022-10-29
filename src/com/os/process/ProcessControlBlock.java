package com.os.process;

public class ProcessControlBlock {
    private String name;
    private int runTime;
    private int deadline;

    public ProcessControlBlock() {
    }

    public ProcessControlBlock(String name, int runTime, int deadline) {
        this.name = name;
        this.runTime = runTime;
        this.deadline = deadline;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return runTime
     */
    public int getRunTime() {
        return runTime;
    }

    /**
     * 设置
     * @param runTime
     */
    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    /**
     * 获取
     * @return deadline
     */
    public int getDeadline() {
        return deadline;
    }

    /**
     * 设置
     * @param deadline
     */
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String toString() {
        return "ProcessControlBlock{name = " + name + ", runTime = " + runTime + ", deadline = " + deadline + "}";
    }
}
