package com.simiyu.authendancev2;

import java.util.List;

public class Module {

    private List<String> moduleGroup;

    public Module() {

    }

    public Module(List<String> moduleGroup) {
        this.moduleGroup = moduleGroup;
    }

    public List<String> getModuleGroup() {
        return moduleGroup;
    }

    public void setModuleGroup(List<String> moduleGroup) {
        this.moduleGroup = moduleGroup;
    }
}
