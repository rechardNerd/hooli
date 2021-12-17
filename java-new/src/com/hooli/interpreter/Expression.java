package com.hooli.interpreter;

/**
 * 解释器（Interpreter）
 * Intent
 * 为语言创建解释器，通常由语言的语法和语法分析来定义
 * Class Diagram
 *  TerminalEcpression:终端符表达式，每个终端符都需要一个TerminalExpression.
 *  Context:上下文，包含解释器之外的一些全局信息。
 */
public abstract class Expression {
    public abstract boolean interpret(String str);
}
