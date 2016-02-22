package com.kth.peonsson;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Peonsson on 22/02/16.
 */
@XmlRootElement
public class ReturnData {

    String reply;

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public ReturnData(String reply) {
        this.reply = reply;
    }

    public ReturnData() {
    }

}

