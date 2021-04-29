package com.ef.cim.objectmodel;

import java.io.Serializable;
import java.util.UUID;

public class RoutingPolicy implements Serializable {
    private AgentSelectionPolicy agentSelectionPolicy;
    private UUID defaultQueue;
    private boolean routeToLastAgent;
    private int agentRequestTtl;

    public AgentSelectionPolicy getAgentSelectionPolicy() {
        return agentSelectionPolicy;
    }

    public void setAgentSelectionPolicy(AgentSelectionPolicy agentSelectionPolicy) {
        this.agentSelectionPolicy = agentSelectionPolicy;
    }

    public UUID getDefaultQueue() {
        return defaultQueue;
    }

    public void setDefaultQueue(UUID defaultQueue) {
        this.defaultQueue = defaultQueue;
    }

    public boolean isRouteToLastAgent() {
        return routeToLastAgent;
    }

    public void setRouteToLastAgent(boolean routeToLastAgent) {
        this.routeToLastAgent = routeToLastAgent;
    }

    public int getAgentRequestTtl() {
        return agentRequestTtl;
    }

    public void setAgentRequestTtl(int agentRequestTtl) {
        this.agentRequestTtl = agentRequestTtl;
    }

    @Override
    public String toString() {
        return "RoutingPolicy{" +
                "agentSelectionPolicy=" + agentSelectionPolicy +
                ", defaultQueue=" + defaultQueue +
                ", routeToLastAgent=" + routeToLastAgent +
                ", agentRequestTtl=" + agentRequestTtl +
                '}';
    }
}
