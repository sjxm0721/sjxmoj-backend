package com.yupi.sjxmoj.judge.codesandbox.impl;

import com.yupi.sjxmoj.judge.codesandbox.CodeSandbox;
import com.yupi.sjxmoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.sjxmoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.sjxmoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.sjxmoj.model.enums.QuestionSubmitStatusEnum;
import com.yupi.sjxmoj.judge.codesandbox.model.ExecuteCodeResponse;

import java.util.List;

/**
 * 示例代码沙箱（跑业务流程用）
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {

        List<String> inputList = executeCodeRequest.getInputList();

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);

        return executeCodeResponse;
    }
}
