package com.yupi.sjxmoj.judge;

import com.yupi.sjxmoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.sjxmoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.sjxmoj.judge.strategy.JudgeContext;
import com.yupi.sjxmoj.judge.strategy.JudgeStrategy;
import com.yupi.sjxmoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.sjxmoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理 简化调用
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    public JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if("java".equals(language)){
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
