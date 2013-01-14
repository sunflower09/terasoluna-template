package jp.sunflower09.terasoluna.tutorial.handler;

import jp.sunflower09.terasoluna.tutorial.entity.Message;

public interface MessageHandler {
    public Message selectByPrimaryKey(Integer id);
}
