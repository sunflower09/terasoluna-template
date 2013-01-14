package jp.sunflower09.terasoluna.tutorial.service.impl;

import jp.sunflower09.terasoluna.tutorial.entity.Message;
import jp.sunflower09.terasoluna.tutorial.handler.MessageHandler;
import jp.sunflower09.terasoluna.tutorial.service.TutorialService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialServiceImpl implements TutorialService {

    @Autowired
    private MessageHandler messageHandler;

    @Override
    public String sayHello() {
        Message message = messageHandler.selectByPrimaryKey(1);
        return message.getMessage();
    }

}
