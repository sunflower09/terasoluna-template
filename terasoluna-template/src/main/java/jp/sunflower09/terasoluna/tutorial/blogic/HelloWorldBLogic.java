package jp.sunflower09.terasoluna.tutorial.blogic;

import jp.sunflower09.terasoluna.tutorial.dto.HelloWorldOutputDTO;
import jp.sunflower09.terasoluna.tutorial.service.TutorialService;
import jp.terasoluna.fw.service.thin.BLogic;
import jp.terasoluna.fw.service.thin.BLogicResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldBLogic implements BLogic<Object> {

    @Autowired
    TutorialService service;

    public BLogicResult execute(Object arg0) {
        //
        BLogicResult result = new BLogicResult();
        HelloWorldOutputDTO output = new HelloWorldOutputDTO();
        output.setMessage(service.sayHello());
        result.setResultObject(output);
        result.setResultString("success");
        return result;
    }

}
