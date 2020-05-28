package com.didichuxing.datachannel.arius.fastindex.server.common.es.catshard.item;


import com.alibaba.fastjson.annotation.JSONField;

public class ESNode {
    @JSONField(name = "name")
    private String name;

    @JSONField(name = "transport_address")
    private String transportAddress;

    @JSONField(name = "attributes")
    private NodeAttributes attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransportAddress() {
        return transportAddress;
    }

    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }

    public NodeAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(NodeAttributes attributes) {
        this.attributes = attributes;
    }
}