package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public interface ICimMessage extends Serializable {
    public UUID getId();
    public MessageHeader getHeader();
    public void setHeader(MessageHeader header);
}
