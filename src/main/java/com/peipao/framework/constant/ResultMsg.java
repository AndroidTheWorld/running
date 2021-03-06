package com.peipao.framework.constant;

public enum ResultMsg {

    SUCCESS("SUCCESS", "操作成功完成"),
    /********************************************** 模块通用 编号从300001开始递增 **********************************************************/
    PAGE_INDEX_ERROR("300001", "分页页码参数错误，请检查"),
    PARAMETER_NOT_ENOUGH("300002", "必填项请求参数不完整，请检查"),
    PAGE_SIZE_ERROR("300003", "每页条数参数错误，请检查"),
    START_TIME_IS_NULL("300004", "请设置查询条件：开始时间"),
    STUDENT_NOT_FOUND("300005", "学生不存在"),
    USER_TYPE_RUNNER_ONLY("300006", "非跑步帐号不能进行此操作"),
    USER_TYPE_OFFICIAL_ONLY("300007", "非官方帐号不能进行此操作"),
    USER_TYPE_SCHOOL_ONLY("300008", "非校方帐号不能进行此操作"),
    USER_TYPE_MISSING("300009", "未能识别用户身份"),
    USER_CLASS_COUNT_ERROR("300010", "统计学生库人数异常"),

    /********************************************** 精品文章模块 编号从400001开始递增 **********************************************************/
    DOC_ID_ERROR("400001", "文章ID错误，请检查"),


    /********************************************** 动力圈模块 编号从500001开始递增 **********************************************************/

    DISCOVER_EMTYY("500001", "动力圈发布内容不能为空"),

    DISCOVER_COMMENTID_NOT_EXIST("500002", "您要删除的评论不存在"),
    DISCOVER_COMMENTID_DEL_SELF("500003", "您不能删除他人发布的评论"),
    DISCOVER_COMMENTID_TOO_LONG("500004", "评论内容过长"),

    DISCOVER_DEL_SELF("500006", "您不能删除他人发布动力圈信息"),

    /********************************************** 用户设置模块 编号从600001开始递增 **********************************************************/
    USER_SECRET_STATUS("600001", "用户隐私状态不能为空"),

    /********************************************** 规则设置模块 编号从700001开始递增 **********************************************************/
    DISCOVER_ROLE_UPVOTEAMOUNT("700001", "动力圈热门规则参数为空"),
    DISCOVER_NOT_EXIST("700002", "您要删除动力圈不存在"),

    /********************************************** 版本控制模块 编号从800001开始递增 **********************************************************/
    VERSION_NOT_EXIST("800001", "您要修改的版本信息不存在"),
    VERSION_CLIENT_ERROR("800002", "客户端类型参数错误，请检查"),
    VERSION_CLIENT_MISS("800003", "缺少客户端类型参数，请检查"),

    /********************************************** 跑步活动抽奖模块 编号从 900001 开始递增 **********************************************************/
    ACTIVITY_NO_LUCK_DRAW("900001", "本活动没有抽奖环节"),
    RUNNINGRECORD_HAS_LUCK_DRAW("900002", "本条跑步记录已经参与过抽奖，不能重复抽奖"),
    NO_LUCK("900003", "很遗憾，没有中奖"),
    LUCK_DRAW_RULE_NOT_EXIST("900004", "当前活动抽奖规则不完整,无法抽奖"),
    ACTIVITY_PRIZE_NOT_EXIST("900005", "当前活动奖品信息不完整,无法抽奖"),

    GET_PRIZE_INDEX_ERROR("900006", "抽奖出错，请检查"),
    LUCK_DRAW_CANT_DELETE("900007", "已经有用户抽中奖品，不能关闭抽奖"),
    PRIZE_CANT_DELETE("900008", "已经有用户抽中奖品，不能删除此奖品"),
    PRIZE_TOTAL_ERROR("900009", "活动奖品总数量不能小于已派奖数量"),
    PRIZE_IS_NOT_LONELY("900010", "活动奖品已有中奖者，不能删除"),
    LUCKRULE_NOT_EXIST("900011", "活动抽奖规则不存在，请检查"),
    ACTIVITY_CHANGE_ERROR("900012", "活动ID改变，请检查"),
    LUCK_DRAW_RULE_EXIST("900013", "当前活动抽奖规则已存在，请进行修改操作"),
    ACTIVITY_PRIZE_NOT_FOUND("900014", "活动奖品不存在"),
    ACTIVITY_EFFECTIVESIGNCOUNT_ERROR("900015", "您已达到活动可参与次数上限"),

    /********************************************** 指南模块 编号从 910001 开始递增 **********************************************************/
    GUIIDE_KEYWORD_EXIST("910001", "此关键字已经存在"),

    /********************************************** 活动模块 编号从 110001 开始递增 **********************************************************/
    ACTIVITY_PERMISSION_ERROR("110001", "活动太火爆了，请稍后再来查看"),

    /********************************************** 跑步规则模块 编号从 120001 开始递增 **********************************************************/
    QUERY_RAIL_NODE_FAIL("120001", "加载电子围栏信息失败"),
    QUERY_RULE_KEY_FAIL("120002", "查询本学期运动规则主键失败"),
    RAIL_NODE_EMTPY("120003", "当前运动规则开启了围栏检测，围栏数据不能为空"),
    QUERY_ACTIVITY_RULE_EMTPY("120004", "当前跑步活动没有找到运动规则,请检查活动信息"),
    NODE_FILE_PATH_EMTPY("120005", "节点文件寻址失败"),

    /********************************************** 成绩补偿模块 编号从 130001 开始递增 **********************************************************/
//    RUNNING_RECORD_TYPE_ERROR("130001", "这是一个活动跑步，请检查"),
//    RUNNING_ACTIVITY_TYPE_ERROR("130002", "这不是一个活动跑步，请检查"),
    RUNNING_LENGTH_IS_MISSING("130003", "请填写计分里程"),
    RUNNING_TYPE_ERROR("130004", "跑步类型错误"),
    ACTIVITY_RUNNING_RULE_NULL("130005", "跑步活动规则不存在，请检查"),
    ACTIVITY_IS_NOT_RUNNING("130006", "这是一个非跑步活动"),

    /****************************************** 晨练模块 编号从 140001 开始递增 *******************************/
    MORNING_TRAIN_RECORD_EXIST("140001", "今日已存在晨练记录，不能多次晨练"),
    MORNING_TRAIN_RECORD_NOT_EXIST("140002", "今日晨练记录不存在，不能签退"),
    MORNING_TRAIN_RULE_EMTYP("140003", "晨练功能没有开启"),
    MORNING_TRAIN_SIGN_LOCATION_EMTYP("140004", "晨练签到时必须提供签到坐标"),
    MORNING_TRAIN_SIGNOUT_LOCATION_EMTYP("140005", "晨练签退时必须提供签退坐标"),
    MORNING_TRAIN_DURATION_EMTYP("140006", "缺少晨练时长"),
    MORNING_TRAIN_TIME_ERROR("140007", "晨练不在规定时间范围内"),
    MORNING_TRAIN_TIME_ERROR_OUT("140008", "晨练不在规定时间范围内"),
    MORNING_TRAIN_TIME_SHORT("140008", "晨练时长不足"),

    /****************************************** 课程模块 编号从 150001 开始递增 *******************************/
    COURSE_SIGN_TYPE_ERROR("150001", "考勤类型参数错误,请检查"),

    /********************************************** event事件相关 编号从 200001 开始递增 **********************************************************/
    STATISTIC_QUERY_ERROR("200001", "查询用户统计信息失败(申诉补偿后更新统计)"),
    STATISTIC_UPDATE_ERROR("200002", "保存用户统计信息失败(申诉补偿后更新统计)"),

    RUNNING_RECORD_QUERY_FAIL("200011", "查询跑步记录失败(申诉智能审核)"),
    RUNNING_RULE_QUERY_FAIL("200012", "查询学期运动规则失败(申诉智能审核)"),
    RUNNING_COUNT_QUERY_FAIL("200013", "查询用户日晨跑次数失败(申诉智能审核)"),
    RUNNING_ACTIVITY_QUERY_FAIL("200014", "查询活动信息失败(申诉智能审核)"),
    ACTIVITY_RULE_QUERY_FAIL("200015", "查询活动跑步规则信息失败(申诉智能审核)"),
    ACTIVITY_MEMBER_QUERY_FAIL("200016", "查询用户活动参与信息失败(申诉智能审核)"),
    ACTIVITY_MEMBER_UPDATE_FAIL("200017", "更新跑步记录状态失败(申诉智能审核)"),

    REIL_NOT_EXIST("200018", "更新的围栏不存在");


    /*********************************************************************************************************************/

    private String code;
    private String msg;
    ResultMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
