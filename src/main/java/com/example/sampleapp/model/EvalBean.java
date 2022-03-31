package com.example.sampleapp.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class EvalBean {
        public EvalBean() throws ClassNotFoundException {
        System.out.println("[+] EvalBean.EvalBean");}

        public String name;
        public ServiceBean commonBean;

        public String getName() {
        System.out.println("[+] EvalBean.getName");
        return name;
        }

        public void setName(String name) {
	System.out.println("[+] EvalBean.setName ");
        this.name = name;
        }

        public ServiceBean getCommonBean() {
	System.out.println("[+] EvalBean.getCommonBean");
        return commonBean;
        }

        public void setCommonBean(ServiceBean commonBean) {
	System.out.println("[+] EvalBean.setCommonBean");
        this.commonBean = commonBean;
        }
}
