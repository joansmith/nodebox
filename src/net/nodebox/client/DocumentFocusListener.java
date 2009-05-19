package net.nodebox.client;

import net.nodebox.node.Node;

import java.util.EventListener;

public interface DocumentFocusListener extends EventListener {

    public void currentNodeChanged(Node node);

    public void focusedNodeChanged(Node node);
}
