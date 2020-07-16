package dev.jaaj.command;

import java.io.Serializable;

public abstract class AbstractCommand<I, O> {
    protected abstract O execute(I input);
}
