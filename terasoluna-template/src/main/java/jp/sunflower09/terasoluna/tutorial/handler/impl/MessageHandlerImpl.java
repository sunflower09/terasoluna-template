package jp.sunflower09.terasoluna.tutorial.handler.impl;

import jp.sunflower09.terasoluna.tutorial.entity.Message;
import jp.sunflower09.terasoluna.tutorial.handler.MessageHandler;
import jp.terasoluna.fw.dao.QueryDAO;

public class MessageHandlerImpl implements MessageHandler {
    /**
     * QueryDAO�B Spring�ɂ��C���X�^���X��������ݒ肳���B
     */
    private QueryDAO queryDAO = null;

    @Override
    public Message selectByPrimaryKey(Integer id) {
        Message message = queryDAO.executeForObject(
                "message.selectByPrimaryKey", id, Message.class);
        return message;
    }

    public void setQueryDAO(QueryDAO queryDAO) {
        this.queryDAO = queryDAO;
    }

}
