package com.yupi.sjxmoj.judge.strategy;

import com.yupi.sjxmoj.model.dto.question.JudgeCase;
import com.yupi.sjxmoj.model.dto.questionsubmit.JudgeInfo;
import com.yupi.sjxmoj.model.entity.Question;
import com.yupi.sjxmoj.model.entity.QuestionSubmit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JudgeContext implements Serializable {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}
