package com.os.process.queuer;

import com.os.process.ProcessControlBlock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EDFQueuer implements Queuer {

    @Override
    public void sortProcess(ArrayList<ProcessControlBlock> readyList) {
        Collections.sort(readyList, new EDFComparator());
    }
}

class EDFComparator implements Comparator<ProcessControlBlock> {
    @Override
    public int compare(ProcessControlBlock p1, ProcessControlBlock p2) {
        return p1.getDeadline() - p2.getDeadline();
    }
}