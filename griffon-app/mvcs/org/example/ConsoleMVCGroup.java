package org.example;

import javax.inject.Named;
import griffon.core.mvc.MVCGroup;
import org.codehaus.griffon.runtime.core.mvc.AbstractTypedMVCGroup;
import javax.annotation.Nonnull;

@Named("console")
public class ConsoleMVCGroup extends AbstractTypedMVCGroup<ConsoleModel, ConsoleView, ConsoleController> {
    public ConsoleMVCGroup(@Nonnull MVCGroup delegate) {
        super(delegate);
    }
}