package dev.jaaj.command;

import java.io.Serializable;

public abstract class AbstractCommand<I, O> implements Serializable {

    protected abstract O execute(I input);
}
