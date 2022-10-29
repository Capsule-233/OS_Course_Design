package com.os.process.queuer;

import com.os.process.ProcessControlBlock;

import java.util.ArrayList;

public interface Queuer {
    public void sortProcess(ArrayList<ProcessControlBlock> readList);

}
