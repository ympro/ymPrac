package com.ymPrac.drools;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;

/**
 * RuleBaseFacatory 单实例RuleBase生成工具
 *
 * @author quzishen
 */
public class RuleBaseFacatory {
    private static RuleBase ruleBase;

    public static RuleBase getRuleBase() {
        return null != ruleBase ? ruleBase : RuleBaseFactory.newRuleBase();
    }
}
