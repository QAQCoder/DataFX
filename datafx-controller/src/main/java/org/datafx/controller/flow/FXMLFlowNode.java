package org.datafx.controller.flow;

import org.datafx.controller.context.ViewFlowContext;


public interface FXMLFlowNode {

    public FXMLFlowView handle(FXMLFlowView currentFlowView, ViewFlowContext flowContext, FXMLFlowHandler flowHandler) throws FXMLFlowException;
}