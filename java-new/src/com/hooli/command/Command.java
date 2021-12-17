package com.hooli.command;

/**
 * 设计模式-命令
 * 将命令封装成对象中，具有以下作用
 * 1.使用命令来参数化其他对象
 * 2.将命令放入队列中进行排队
 * 3.将命令的操作记录到日志中
 * 4.支持可撤销的操作
 * Command:     命令
 * Receiver:    通过它来调用命令
 * Invoker:     通过它来调用命令
 * Client:      可以设置命令与命令的接收者
 */
public interface Command {
    void execute();
}
