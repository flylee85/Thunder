package com.nepxion.thunder.common.thread;

/**
 * <p>Title: Nepxion Thunder</p>
 * <p>Description: Nepxion Thunder For Distribution</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public interface RejectedRunnable extends Runnable {
    // 如果任务被拒绝，用户自行处理
    void rejected();
}