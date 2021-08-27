package com.ef.cim.objectmodel;

public class Language {

    private String code;
    private String policy;

    public Language() {
    }

    public Language(String code, String policy) {
        this.code = code;
        this.policy = policy;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "Language{" +
                "code='" + code + '\'' +
                ", policy='" + policy + '\'' +
                '}';
    }
}
