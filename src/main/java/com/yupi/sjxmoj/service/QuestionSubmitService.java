package com.yupi.sjxmoj.service;

import com.yupi.sjxmoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.sjxmoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.sjxmoj.model.entity.User;

/**
* @author sijixiamu
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2023-12-15 09:27:49
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

}
