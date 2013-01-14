package jp.sunflower09.terasoluna.tutorial.blogic;

import jp.sunflower09.terasoluna.tutorial.dto.HelloWorldOutputDTO;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;

public class HelloWorldBLogic implements BLogic<Object> {

    public BLogicResult execute(Object arg0) {
        //
        BLogicResult result = new BLogicResult();
        HelloWorldOutputDTO output = new HelloWorldOutputDTO();
        output.setMessage("Hello World");
        result.setResultObject(output);
        result.setResultString("success");
        return result;
    }

}
