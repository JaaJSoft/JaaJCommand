package dev.jaaj.command;

public abstract class AbstractCommandInvoker<I, O> {

    public abstract O execute(AbstractCommand<I, O> command, I input);

}
