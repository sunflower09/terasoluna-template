package jp.sunflower09.terasoluna.tutorial.form;

import jp.terasoluna.fw.web.struts.form.ValidatorActionFormEx;

public class HelloWorldForm extends ValidatorActionFormEx {
    /**
     * 
     */
    private static final long serialVersionUID = -5545207105503522444L;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}