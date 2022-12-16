package org.example;

import griffon.core.artifact.GriffonModel;
import griffon.metadata.ArtifactProviderFor;
import org.codehaus.griffon.runtime.core.artifact.AbstractGriffonModel;

@ArtifactProviderFor(GriffonModel.class)
public class ConsoleModel extends AbstractGriffonModel {
    private int clickCount = 0;

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        firePropertyChange("clickCount", this.clickCount, this.clickCount = clickCount);
    }

    private String greetMessage = "Hello";

    public String getGreetMessage() {
        return greetMessage;
    }

    public void setGreetMessage(final String revisedGreetMessage) {
        firePropertyChange("changeGreetingMsg", this.greetMessage, this.greetMessage = revisedGreetMessage);
    }
}